package com.example.data.dao;

import com.example.model.ToDoItem;

import java.util.Collection;

public interface ToDoItemDao {
    public ToDoItem persist(ToDoItem todoItem);
    public ToDoItem findById(ToDoItem id);
    public Collection<ToDoItem> findAll();
    public Collection<ToDoItem> findAllByDoneStatus(ToDoItem done);
    public Collection<ToDoItem> findByTitleContains(ToDoItem title);
    public Collection<ToDoItem> findByPersonId(ToDoItem personId);
    public Collection<ToDoItem> findByDeadlineBefore(ToDoItem date);
    public Collection<ToDoItem> findByDeadlineAfter(ToDoItem date);
    public void remove (ToDoItem id);
}
