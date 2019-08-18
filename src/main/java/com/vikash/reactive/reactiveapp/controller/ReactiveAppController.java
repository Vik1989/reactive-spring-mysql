package com.vikash.reactive.reactiveapp.controller;

import com.vikash.reactive.reactiveapp.service.ReactiveAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reactiveApp")
public class ReactiveAppController {

    @Autowired
    private ReactiveAppService reactiveAppService;

    @RequestMapping(value = "/getPersonNames", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public String getNames(){

        String names = null;

        names = reactiveAppService.getNames();

        return names;
    }
}
