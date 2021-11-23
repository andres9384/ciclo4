package com.ciclo4.demo.repository.crud;


import java.util.List;
import java.util.Optional;

import com.ciclo4.demo.model.User;

import org.springframework.data.repository.CrudRepository;

public interface UserCrudRepository  extends CrudRepository<User,Integer>{
    // public abstract String<User>  findByEmail(String email);
    public  Optional<User> findByName(String name);
    public  Optional<User> findByEmail(String email);
    public  List<User> findByNameOrEmail(String name, String email);
    public  Optional<User> findByEmailAndPassword(String email, String Password);
}




