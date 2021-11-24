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

    public User saveUser(User date){
        return UserCrudRepository.save(date);
    }

    public boolean getEmail(String email){     
        Optional<User> exist = UserCrudRepository.findByEmail(email);
        return !exist.isEmpty();
    }
    
    public Optional<User> getEmailAndPassword(String email,String password){      
        return UserCrudRepository.findByEmailAndPassword(email,password);
    }

//     public Optional<User> getName(String name){
//         return UserCrudRepository.findByName(name);
//   }

    

    // public List<User> getNameOrEmail(String name,String email){      
    //     return UserCrudRepository.findByNameOrEmail(name,email);
    // }

    
   
    // public void  delete(User id){
    //     UserCrudRepository.delete(id);
    // }
}
