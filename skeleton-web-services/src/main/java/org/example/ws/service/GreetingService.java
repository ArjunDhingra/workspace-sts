package org.example.ws.service;

import java.util.Collection;
import java.util.Optional;

import org.example.ws.model.Greeting;

public interface GreetingService {

	Collection<Greeting> findAll();

	Optional<Greeting> findOne(Long id);

	Greeting create(Greeting greeting);

	Greeting update(Greeting greeting);

	void delete(Long id);

}
