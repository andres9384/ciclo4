package com.ciclo4.demo.model;

import java.io.Serializable;

import javax.persistence.*;

import org.springframework.lang.NonNull;






@Entity
@Table(name="user",indexes = @Index(name= "indx_email",columnList = "user_email",unique = true))
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @NonNull
    @Column(name= "user_email",length = 50, nullable = false)
    private String email;

    @NonNull
    @Column(name= "password",length = 50, nullable = false)
   private String password;

   @NonNull
   @Column(name= "user_name",length = 80, nullable = false)
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
