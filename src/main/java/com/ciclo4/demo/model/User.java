package com.ciclo4.demo.model;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name="user")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    
    // @Column(unique = true , nullable = false)
    private String email;

   private String password;

   
   private String name;

   public User() {
}
public User(Integer id, String email, String password, String name) {
    this.id = id;
    this.email = email;
    this.password = password;
    this.name = name;
}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

     public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   

    
  
}
