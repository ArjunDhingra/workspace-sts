package com.mindtree.ratingsdataservice.models;

import java.util.List;

public class UserRating {
	
	private List<Rating> userRating;

	/**
	 * @return the userRating
	 */
	public List<Rating> getUserRating() {
		return userRating;
	}

	/**
	 * @param userRating the userRating to set
	 */
	public void setUserRating(List<Rating> userRating) {
		this.userRating = userRating;
	}
	
	

}
