package io.cisigep.springReact.preload;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import io.cisigep.springReact.interfaces.BasicRepository;
import io.cisigep.springReact.model.BasicPersistenceObject;

@Component
public class DatabaseLoader implements CommandLineRunner {
	
	private BasicRepository basicRepository;

	@Autowired
	public DatabaseLoader(BasicRepository basicRepository) {
		this.basicRepository = basicRepository;
	}


	@Override
	public void run(String... args) throws Exception {
		this.basicRepository.save(new BasicPersistenceObject("Test", 43));
	}

}
