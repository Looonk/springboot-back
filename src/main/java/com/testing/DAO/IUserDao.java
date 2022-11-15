package com.testing.DAO;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.testing.Entity.User;

public interface IUserDao extends CrudRepository<User, Long>{
    
    List<User> findAll();
    

}
