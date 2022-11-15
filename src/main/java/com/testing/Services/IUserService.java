package com.testing.Services;

import java.util.List;

import com.testing.Entity.User;

public interface IUserService {

    public List<User> findAll();
    
    public User save(User x);
    
    public void delete(Long id);
    
    public User findById(Long id);
    
    public User findByEmail(String email);
    
    public User findByUsername(String username);
    
}
