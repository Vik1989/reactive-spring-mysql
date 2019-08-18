package com.vikash.reactive.reactiveapp.service;

import com.vikash.reactive.reactiveapp.dao.IReactiveRepository;
import com.vikash.reactive.reactiveapp.dao.ReactiveAppDao;
import com.vikash.reactive.reactiveapp.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.io.Console;

@Service
public class ReactiveAppServiceImpl implements ReactiveAppService {

    @Autowired
    private ReactiveAppDao reactiveAppDao;

    @Autowired
    private IReactiveRepository iReactiveRepository;

    @Override
    public String getNames() {

        Mono<Person> person= iReactiveRepository.findById("123");

        person.subscribe(System.out::print);

        return person.toString();
    }
}
