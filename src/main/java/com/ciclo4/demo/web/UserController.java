package com.ciclo4.demo.web;

import java.util.List;


import com.ciclo4.demo.model.User;
import com.ciclo4.demo.service.UserServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/user")
@CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class UserController {
    @Autowired
    private UserServices userServices;

    @GetMapping("/all")
    public List<User>getUser(){
        return userServices.getAll();
    }
    // @GetMapping("/{id}")
    // public Optional<User>getUser(@PathVariable("id")int id){
    //     return userServices.getUser(id);
    // }

    @GetMapping("/{email}")
    public boolean getEmail(@PathVariable("email")String email){
        return userServices.getEmail(email);
    }

    @GetMapping("/{email}/{password}")
    public User getEmail(@PathVariable("email")String email,@PathVariable("password")String password){
        return userServices.getEmailPassword(email,password);
    }
    
    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public User saveUser(@RequestBody User date){
        return userServices.saveUser(date);
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public User updateUser(@RequestBody User date){
        return userServices.updateUser(date);
    }
    @DeleteMapping("/{numId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean deleteUser(@PathVariable("numId")int id){
        return userServices.deleteUser(id);
    }
}
