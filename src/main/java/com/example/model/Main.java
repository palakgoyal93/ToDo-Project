package com.example.model;
import com.example.model.Person;
import com.example.data.dao.AppUserDaoCollection;
import com.example.data.dao.ToDoItemTaskDaoCollection;
import com.example.data.dao.ToDoItemDaoCollection;
import com.example.data.dao.PersonDaoCollection;
import com.example.data.dao.PersonDao;
import com.example.data.dao.ToDoItemTaskDao;
import com.example.data.dao.ToDoItemDao;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {

        Person palak = new Person(1,"Palak","Goyal","palakgoyal@gmail.com");
        Person deepa = new Person(1,"Deepa","Singh","deepasingh@gmail.com");
        Person sneha = new Person(2,"Sneha","Mittal","snehamittal@gmail.com");
        ToDoItem T1= new ToDoItem(1,"Cooking","Preparing food", LocalDate.of(2023,8,14),false,deepa);
        ToDoItem T2= new ToDoItem(1,"Working","Doing office task", LocalDate.of(2023,8,21),true,deepa);
        ToDoItemTask t1 =new ToDoItemTask(1,true,T1,palak);
        ToDoItemTask t2 =new ToDoItemTask(1,true,T2,sneha);



    }


}
