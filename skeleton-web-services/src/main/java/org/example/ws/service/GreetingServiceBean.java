package org.example.ws.service;

import java.util.Collection;
import java.util.Optional;

import org.example.ws.model.Greeting;
import org.example.ws.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceBean implements GreetingService {

	/*
	 * private static Long nextId; private static Map<Long, Greeting> greetingMap;
	 * 
	 * private static Greeting save(Greeting greeting) { if (greetingMap == null) {
	 * greetingMap = new HashMap<Long, Greeting>(); nextId = new Long(1); } if
	 * (greeting.getId() != null) { Greeting oldGreeting =
	 * greetingMap.get(greeting.getId()); if (oldGreeting == null) { return null; }
	 * greetingMap.remove(greeting.getId()); greetingMap.put(greeting.getId(),
	 * greeting); return greeting; } greeting.setId(nextId); nextId += 1;
	 * greetingMap.put(greeting.getId(), greeting); return greeting; }
	 * 
	 * private static boolean remove(Long id) { Greeting deletedGreeting =
	 * greetingMap.remove(id); if (deletedGreeting == null) { return false; } return
	 * true; }
	 * 
	 * static { Greeting g1 = new Greeting(); g1.setText("Hello World"); save(g1);
	 * 
	 * Greeting g2 = new Greeting(); g2.setText("Hola Mundo!"); save(g2); }
	 */

	@Autowired
	private GreetingRepository greetingRepository;

	@Override
	public Collection<Greeting> findAll() {
//		Collection<Greeting> greetings = greetingMap.values();
		Collection<Greeting> greetings = greetingRepository.findAll();
		return greetings;
	}

	@Override
	public Optional<Greeting> findOne(Long id) {
//		Greeting greeting = greetingMap.get(id);
		Optional<Greeting> greeting = greetingRepository.findById(id);
		return greeting;
	}

	@Override
	public Greeting create(Greeting greeting) {
		if (greeting.getId() != null) {
			return null;
		}
		Greeting savedGreeting = greetingRepository.save(greeting);
		return savedGreeting;
	}

	@Override
	public Greeting update(Greeting greeting) {
		Optional<Greeting> greetingPersisted = findOne(greeting.getId());
		if (greetingPersisted == null) {
			return null;
		}
		Greeting updatedGreeting = greetingRepository.save(greeting);
		return updatedGreeting;
	}

	@Override
	public void delete(Long id) {
//		remove(id);
		greetingRepository.deleteById(id);
	}

}
