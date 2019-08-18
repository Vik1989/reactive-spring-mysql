package com.vikash.reactive.reactiveapp.dao;

import com.github.jasync.sql.db.pool.ConnectionFactory;
import com.vikash.reactive.reactiveapp.model.Person;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public class ReactiveAppDaoImpl implements ReactiveAppDao {

    ConnectionFactory connectionFactory = null;

    @Override
    public Mono<String> getNames() {

        //Mono<Person> person = ;
        return null;
    }
}
