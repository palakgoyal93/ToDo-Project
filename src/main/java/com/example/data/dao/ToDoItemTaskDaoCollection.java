package com.example.data.dao;

import com.example.model.Person;
import com.example.model.ToDoItem;
import com.example.model.ToDoItemTask;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ToDoItemTaskDaoCollection implements ToDoItemTaskDao {
    private Collection<ToDoItemTask> ToDoItemTask;

    @Override
    public ToDoItemTask persist(ToDoItemTask ToDoItemTask) {
        Person p2 = new Person(2, "Sneha", "Mittal", "snehamittal@gmail.com");
        ToDoItem T1 = new ToDoItem(1, "Construction", "Digging the soil", LocalDate.of(2023, 8, 21), false, p2);
        ToDoItemTask t1 = new ToDoItemTask(1, true, T1, p2);
        this.ToDoItemTask.add(t1);
        return t1;
    }

    @Override
    public ToDoItemTask findById(ToDoItemTask id) {
        for (ToDoItemTask t1 : ToDoItemTask) {
            if (t1.getId() == id.getId()) {
                return t1;
            }

        }
        return null;
    }

    @Override
    public Collection<ToDoItemTask> findAll() {
        return new ArrayList<>(ToDoItemTask);
    }

    @Override
    public Collection<ToDoItemTask> findByAssignedStatus(ToDoItemTask status) {
        List<ToDoItemTask> result = new ArrayList<>();

        for (ToDoItemTask task : ToDoItemTask) {
            if (task.isAssigned() == status.isAssigned()) {
                result.add(task); // Add tasks with matching assigned status to the result list
            }
        }

        return result;
    }

    @Override
    public Collection<ToDoItemTask> findByPersonId(ToDoItemTask personId) {
        List<ToDoItemTask> result = new ArrayList<>();

        for (ToDoItemTask task : ToDoItemTask) {
            if (task.getId() == personId.getId()) {
                result.add(task);
            }
        }

        return result;
    }

    @Override
    public void remove(ToDoItemTask id) {
        Iterator<ToDoItemTask> iterator = ToDoItemTask.iterator();

        while (iterator.hasNext()) {
            ToDoItemTask item = iterator.next();
            if (item.getId() == id.getId()) {
                iterator.remove();
            }
        }

    }

}
