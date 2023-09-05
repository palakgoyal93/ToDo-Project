package com.example.data.dao;

import com.example.model.Person;
import com.example.model.ToDoItem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ToDoItemDaoCollection implements ToDoItemDao{
    private Collection<ToDoItem> ToDoItem;

    @Override
    public ToDoItem persist(ToDoItem ToDoItem) {


        Person p1=new Person(1,"Deepa","Singh","deepasingh@gmail.com");
        ToDoItem T1 = new ToDoItem(1,"Construction","Digging soil first ",
                LocalDate.of(2023,8,21),false,p1) ;
        this.ToDoItem.add(T1);
        return T1;

    }

    @Override
    public ToDoItem findById(ToDoItem id) {
        for(ToDoItem t1: ToDoItem)
        {
            if (t1.getId() == id.getId()) {
                return t1;
            }

        }
        return null;

    }
    @Override
    public Collection<ToDoItem> findAll() {
        return new ArrayList<>(ToDoItem);
    }
    @Override
    public Collection<ToDoItem> findAllByDoneStatus(ToDoItem done)
    {
        List<ToDoItem> result = new ArrayList<>();

        for (ToDoItem item : ToDoItem) {
            if (item.equals(done)) {
                result.add(item);
            }
        }

        return result;
    }
    @Override
    public Collection<ToDoItem> findByTitleContains(ToDoItem title) {
        List<ToDoItem> result = new ArrayList<>();

        for (ToDoItem item : ToDoItem) {
            if (item.getTitle().contains(item.title))
            {
                result.add(item);
            }
        }

        return result;
    }

    @Override
    public Collection<ToDoItem> findByPersonId(ToDoItem personId) {
        for (ToDoItem p1 : ToDoItem) {
            if (p1.getId() == personId.getId()) {
                return (Collection<ToDoItem>) p1;
            }
        }
        return null;
    }
    @Override
    public Collection<ToDoItem> findByDeadlineBefore(ToDoItem date) {
        List<ToDoItem> result = new ArrayList<>();

        for (ToDoItem item : ToDoItem) {
            if (item.getDeadLine() != null && item.getDeadLine().isBefore(date.getDeadLine())) {
                result.add(item);
            }
        }

        return result;
    }
    @Override
    public Collection<ToDoItem> findByDeadlineAfter(ToDoItem date) {
        List<ToDoItem> result = new ArrayList<>();

        for (ToDoItem item : ToDoItem) {
            if (item.getDeadLine() != null && item.getDeadLine().isAfter(date.getDeadLine())) {
                result.add(item); // Add items with deadlines after the given date to the result list
            }
        }

        return result;
    }

    @Override
    public void remove(ToDoItem id) {
        Iterator<ToDoItem> iterator = ToDoItem.iterator();

        while (iterator.hasNext()) {
            ToDoItem item = iterator.next();
            if (item.getId() == id.getId()) {
                iterator.remove();
            }
        }
    }
    
}
