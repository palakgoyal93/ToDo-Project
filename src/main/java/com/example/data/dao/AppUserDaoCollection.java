package com.example.data.dao;
import com.example.model.AppRole;
import com.example.model.AppUser;
import com.example.model.Person;
import com.example.model.ToDoItem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class AppUserDaoCollection implements AppUserDao{
    private Collection<AppUser> appUser;
    @Override
    public AppUser persist(AppUser appUser) {
        AppUser a1=new AppUser("Shiva", AppRole.ROLE_APP_ADMIN);
        this.appUser.add(a1);
        return a1;
    }
    @Override
    public AppUser findByUsername(AppUser username) {
        for (AppUser user : appUser)
        {
            if (user.getUsername().contains(username.getUsername())) {
                return user;
            }
        }
        return null;
    }

    @Override
    public Collection<AppUser> findAll() {
        return new ArrayList<>(appUser);
    }

    @Override
    public void remove(AppUser username) {
        Iterator<AppUser> iterator = appUser.iterator();


        while (iterator.hasNext()) {
            AppUser item = iterator.next();
            if (item.getUsername() == username.getUsername()) {
                iterator.remove();
            }
        }


    }

}
