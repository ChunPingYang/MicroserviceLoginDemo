package com.chunping.springcloud.controller;

import com.chunping.springcloud.domain.Person;
import com.chunping.springcloud.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/people")
public class PeopleControllerV1 {

    @Autowired
    PeopleRepository peopleRepository;

    @GetMapping(value = "/all")
    Iterable<Person> all(){
        return peopleRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    Optional<Person> findById(@PathVariable("id") String id){
        return peopleRepository.findById(id);
    }
}
