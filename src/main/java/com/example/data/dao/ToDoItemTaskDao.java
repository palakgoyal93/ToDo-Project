package com.example.data.dao;

import com.example.model.ToDoItemTask;

import java.util.Collection;

public interface ToDoItemTaskDao {
    public ToDoItemTask persist(ToDoItemTask todoItemTask);
    public ToDoItemTask findById(ToDoItemTask id);
    public Collection<ToDoItemTask> findAll();
    public Collection<ToDoItemTask> findByAssignedStatus(ToDoItemTask status);
    public Collection<ToDoItemTask> findByPersonId(ToDoItemTask personId);
    public void remove(ToDoItemTask id);
}
