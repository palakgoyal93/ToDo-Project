package com.example;
import com.example.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class PersonTest {
    @Test
    void setFirstname() {
        Person palak = new Person(1,"Palak","Goyal","palakgoyal@gmail.com");

        assertEquals("Palak",palak.getFirstname());
    }
    @Test
    void setFirstNameWithNullValue() {
        Person p = new Person(1,"Palak","Goyal","palakgoyal@gmail.com");

        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            p.setFirstname(null);
        });
        Assertions.assertEquals("FirstName cannot be null", thrown.getMessage());
    }




    @Test
    void setLastname() {
        Person palak = new Person(1,"Palak","Goyal","palakgoyal@gmail.com");

        assertEquals("Goyal",palak.getLastname());

    }
    @Test
    void setLastNameWithNullValue() {
        Person a = new Person(1,"Palak","Goyal","palakgoyal@gmail.com");

        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            a.setLastname(null);
        });
        Assertions.assertEquals("LastName cannot be null", thrown.getMessage());
    }

    @Test
    void setEmail() {
        Person Bhuvana = new Person(1,"Bhuvana","Chandran","bhuva@gmail.com");

        assertEquals("bhuva@gmail.com",Bhuvana.getEmail());

    }

    @Test
    void setEmailWithNullValue() {
        Person a = new Person(1,"Palak","Goyal","palakgoyal@gmail.com");

        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            a.setEmail(null);
        });
        Assertions.assertEquals("Email cannot be null", thrown.getMessage());
    }

}
