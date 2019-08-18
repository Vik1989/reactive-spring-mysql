package com.vikash.reactive.reactiveapp.dao;

import com.vikash.reactive.reactiveapp.model.Person;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface IReactiveRepository  extends ReactiveCrudRepository<Person,String> {
}
