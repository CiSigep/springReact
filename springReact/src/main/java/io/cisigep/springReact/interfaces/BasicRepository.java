package io.cisigep.springReact.interfaces;

import org.springframework.data.repository.CrudRepository;

import io.cisigep.springReact.model.BasicPersistenceObject;

public interface BasicRepository extends CrudRepository<BasicPersistenceObject, Long> {

}
