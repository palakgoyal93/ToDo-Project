package com.example.data.dao;

import com.example.model.Person;

import java.util.Collection;

public interface PersonDao {
    public Person persist(Person person);
    public Person findById(Person id);
    public Person findByEmail(Person email);
    public Collection<Person> findAll();
    public Person remove (Person id);
}
