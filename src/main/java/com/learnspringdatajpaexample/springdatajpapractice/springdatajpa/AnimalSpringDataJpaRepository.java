package com.learnspringdatajpaexample.springdatajpapractice.springdatajpa;

import com.learnspringdatajpaexample.springdatajpapractice.entities.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalSpringDataJpaRepository extends JpaRepository<Animal, Long> {

}
