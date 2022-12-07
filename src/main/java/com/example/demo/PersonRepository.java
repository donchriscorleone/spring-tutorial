package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "person", path = "people")
public interface PersonRepository extends CrudRepository<Person, Long> {
    List<Person> findByLastName(@Param("name") String name);
}
