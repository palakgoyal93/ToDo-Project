package com.example.model;

import java.util.Objects;

public class ToDoItemTask {
    private int id;
    private Boolean assigned;

    @Override
    public String toString() {
        return "TodoItemTask{" +
                "id=" + id +
                ", assigned=" + assigned +
                ", todoItem=" + todoItem +
                '}';
    }

    private ToDoItem todoItem;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ToDoItemTask that = (ToDoItemTask) o;
        return id == that.id && Objects.equals(assigned, that.assigned) && Objects.equals(todoItem, that.todoItem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, assigned, todoItem);
    }

    private Person assignee;





    public ToDoItemTask(int id, Boolean assigned, ToDoItem todoItem, Person assignee) {
        this.id = id;
        this.assigned = assigned;
        setTodoItem(todoItem);
        setAssignee(assignee);

    }



    public int getId() {
        return id;
    }

    public Boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(Boolean assigned) {
        this.assigned = assigned;
    }

    public ToDoItem getTodoItem() {
        return todoItem;
    }

    public void setTodoItem(ToDoItem todoItem) {
        if (todoItem == null) throw new IllegalArgumentException("ToDoItem cannot be null");
        this.todoItem = todoItem;
    }
    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee){
        this.assignee = assignee;
    }


    public void setToDoItem(Object o) {
    }
}
