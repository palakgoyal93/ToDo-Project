package com.example;
import com.example.model.Person;
import com.example.model.ToDoItem;
import com.junit.jupiter.api.Assertions;
import com.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
public class ToDoItemTest {
    @Test
    void setTitle() {
        Person person=new Person(1,"Palak","Goyal","palakgoyal@gmail.com");
        ToDoItem task = new ToDoItem(1,"Construction","Digging the soil", LocalDate.now(),false,person);
        assertEquals("Construction",task.getTitle());
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            task.setTitle(null);
        });
        Assertions.assertEquals("Title cannot be null", thrown.getMessage());
    }
    @Test
    void setDeadLine() {
        Person person=new Person(1,"Palak","Goyal","palakgoyal@gmail.com");
        ToDoItem task = new ToDoItem(1,"Construction","Digging the soil", LocalDate.now(),false,person);
        assertEquals(LocalDate.now(),task.getDeadLine());
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            task.setDeadLine(null);
        });
        Assertions.assertEquals("Deadline cannot be null", thrown.getMessage());
    }

    @Test
    void isOverdue() {
        Person person=new Person(1,"Palak","Goyal","palakgoyal@gmail.com");
        ToDoItem task = new ToDoItem(1,"Gardening","planting tree",LocalDate.of(2023,8,23),true,person);
        task.setDeadLine(LocalDate.now().plusDays(0));
        assertFalse(task.isOverdue());

        task.setDeadLine(LocalDate.now().minusDays(2));
        assertTrue(task.isOverdue());
    }
}
