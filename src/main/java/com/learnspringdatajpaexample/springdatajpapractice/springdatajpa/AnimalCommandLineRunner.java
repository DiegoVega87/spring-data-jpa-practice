package com.learnspringdatajpaexample.springdatajpapractice.springdatajpa;

import com.learnspringdatajpaexample.springdatajpapractice.entities.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AnimalCommandLineRunner implements CommandLineRunner {

    @Autowired
    private AnimalSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {

        repository.save(new Animal("Dog", true));
        repository.save(new Animal("Cat", true));
        repository.save(new Animal("Lion", false));
        repository.save(new Animal("Tiger", false));

        repository.deleteById(1l);

        System.out.println("Should return empty "+ repository.findById(1l));
        System.out.println(repository.findById(2l));

        System.out.println(repository.findAll());

        System.out.println(repository.findByType("Cat"));
        System.out.println(repository.findByType("Lion"));

        System.out.println(repository.findByIsDomestic(true));
        System.out.println(repository.findByIsDomestic(false));


    }
}
