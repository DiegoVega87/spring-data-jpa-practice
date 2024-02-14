package com.learnspringdatajpaexample.springdatajpapractice.springdatajpa;

import com.learnspringdatajpaexample.springdatajpapractice.entities.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnimalSpringDataJpaRepository extends JpaRepository<Animal, Long> {

    // You can define custom methods here
    List<Animal> findByType(String type); // This is used to map the column name in the database
    List<Animal> findByIsDomestic(boolean isDomestic); // This is used to map the column name in the database

}
