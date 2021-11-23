package com.ciclo4.demo.repository;

import java.util.List;
import java.util.Optional;

import com.ciclo4.demo.model.User;
import com.ciclo4.demo.repository.crud.UserCrudRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    @Autowired

    private UserCrudRepository UserCrudRepository;

    public List<User> getAll(){
        return (List<User>)UserCrudRepository.findAll();
    }
    public Optional<User>getUser(int id){
        return UserCrudRepository.findById(id);
    }

    public Optional<User> getName(String name){
        return UserCrudRepository.findByName(name);
  }

    public Optional<User> getEmail(String email){      
        return UserCrudRepository.findByEmail(email);
    }

    public List<User> getNameOrEmail(String name,String email){      
        return UserCrudRepository.findByNameOrEmail(name,email);
    }

    public Optional<User> getEmailAndPassword(String email,String password){      
        return UserCrudRepository.findByEmailAndPassword(email,password);
    }
   

    public User saveUser(User date){
        return UserCrudRepository.save(date);
    }
    // public Departamento save(Departamento dpto){
    //     return departamentoCrudRepositorio.save(dpto);
    // }
    public void  delete(User id){
        UserCrudRepository.delete(id);
    }
}
