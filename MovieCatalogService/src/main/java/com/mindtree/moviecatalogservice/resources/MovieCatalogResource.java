package com.mindtree.moviecatalogservice.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mindtree.moviecatalogservice.models.CatalogItem;
import com.mindtree.moviecatalogservice.models.Movie;
import com.mindtree.moviecatalogservice.models.UserRating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

	@Autowired
	private RestTemplate restTemplate;
	
//	@Autowired
//	private DiscoveryClient discoveryClient;

//	@Autowired
//	private WebClient.Builder webClientBuilder;

	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {
		UserRating ratings = restTemplate.getForObject("http://RatingsDataService/ratingsdata/users/" + userId,
				UserRating.class);
		return ratings.getUserRating().stream().map(rating -> {
			Movie movie = restTemplate.getForObject("http://MovieInfoService/movies/" + rating.getMovieId(), Movie.class);
			return new CatalogItem(movie.getName(), "Test", rating.getRating());
		}).collect(Collectors.toList());
	}
//	List<Rating> ratings = Arrays.asList(new Rating("1234", 4), new Rating("5678", 3));
	/*
	 * Movie movie =
	 * webClientBuilder.build().get().uri("http://localhost:8082/movies/" +
	 * rating.getMovieId()) .retrieve().bodyToMono(Movie.class).block();
	 */
}
