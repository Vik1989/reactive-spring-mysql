package com.vikash.reactive.reactiveapp.dao;

import reactor.core.publisher.Mono;

public interface ReactiveAppDao {
    Mono<String> getNames();
}
