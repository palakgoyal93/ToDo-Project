package com.example;
import com.example.model.Person;
import com.example.model.ToDoItem;
import com.example.model.ToDoItemTask;
import com.junit.jupiter.api.Assertions;
import com.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
public class ToDoItemTaskTest {
    @Test
    void isAssigned() {
        Person palak = new Person(1,"Palak","Goyal","palakgoyal@gmail.com");
        ToDoItem task = new ToDoItem(1,"Construction","Digging the soil", LocalDate.now(),true,palak);
        ToDoItemTask taskDesc = new ToDoItemTask(1, false,task,palak );
        taskDesc.setAssignee(null);
        assertFalse(taskDesc.isAssigned());
    }

    @Test
    void setToDoItem() {
        Person palak = new Person(1,"Palak","Goyal","palakgoyal@gmail.com");
        ToDoItem task = new ToDoItem(1,"Construction","Digging the soil", LocalDate.now(),true,palak);
        ToDoItemTask taskdesc = new ToDoItemTask(1, false,task,palak );
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            taskdesc.setToDoItem(null);
        });
        Assertions.assertEquals("ToDoItem cannot be null", thrown.getMessage());
    }

}
