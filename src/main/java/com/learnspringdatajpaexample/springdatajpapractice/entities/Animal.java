package com.learnspringdatajpaexample.springdatajpapractice.entities;

import jakarta.persistence.*;

@Entity(name = "animals")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "animal_type")
    private String type;
    @Column(name = "domestic")
    private boolean isDomestic;

    public Animal() {
    }

    public Animal( String type, boolean isDomestic) {
        super();
        this.type = type;
        this.isDomestic = isDomestic;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isDomestic() {
        return isDomestic;
    }

    public void setDomestic(boolean domestic) {
        isDomestic = domestic;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", isDomestic=" + isDomestic +
                '}';
    }
}
