package com.ciclo4.demo.repository.crud;


// import java.util.List;
import java.util.Optional;

import com.ciclo4.demo.model.User;

import org.springframework.data.repository.CrudRepository;

public interface UserCrudRepository  extends CrudRepository<User,Integer>{
    // public abstract String<User>  findByEmail(String email);
      // Optional<User> findByName(String name);
      Optional<User> findByEmail(String email);
      // List<User> findByNameOrEmail(String name, String email);
      Optional<User> findByEmailAndPassword(String email, String Password);
}




