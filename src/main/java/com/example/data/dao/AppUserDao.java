package com.example.data.dao;

import com.example.model.AppUser;

import java.util.Collection;

public interface AppUserDao {
    public AppUser persist (AppUser appUser);
    public AppUser findByUsername(AppUser username);
    public Collection<AppUser> findAll();
    public void remove(AppUser usename);
}
