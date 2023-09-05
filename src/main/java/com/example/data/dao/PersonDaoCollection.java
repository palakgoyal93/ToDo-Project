package com.example.data.dao;

import com.example.model.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PersonDaoCollection implements PersonDao{
    private Collection<Person> person;
    public PersonDaoCollection(Collection<Person> person) {
        this.person = person;
    }
    public PersonDaoCollection() {
        super();
    }
    @Override
    public Person findById(Person id) {
        for (Person p1 : person) {
            if (p1.getId() == id.getId()) {
                return p1;
            }
        }
        return null;

    }
    @Override
    public Person findByEmail(Person email) {
        for(Person p : person)
        {
            if(p.getEmail().equals(email))
            {
                return p;
            }
        }
        return null;
    }

    @Override
    public Collection<Person> findAll() {
        return new ArrayList<>(person);
    }

    @Override
    public Person remove(Person id)
    {
        Iterator<Person> iterator = person.iterator();
        while (iterator.hasNext())
        {
            Person person1 = iterator.next();
            if (person1.equals(id))
            {
                iterator.remove();
                return id;
            }

        }
        return null;
    }
    @Override
    public Person persist(Person person)
    {
        Person P1=new Person(1,"Palak","Goyal","palakgoyal@gmail.com") ;
        this.person.add(P1);
        return P1;
    }
}
