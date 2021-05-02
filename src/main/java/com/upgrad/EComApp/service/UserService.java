package com.upgrad.EComApp.service;

import com.upgrad.EComApp.entity.User;

public interface UserService {
    public User getUserDetails(int id);
    public void saveUserDetails(User user);
}
