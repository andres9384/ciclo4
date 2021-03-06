package com.ciclo4.demo.service;

import java.util.List;
import java.util.Optional;

import com.ciclo4.demo.model.User;
import com.ciclo4.demo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAll() {
        return userRepository.getAll();
    }

    public Optional<User> getUser(int id) {
        return userRepository.getUser(id);
    }

    public User saveUser(User date) {
        if (date.getId() == null) {
            if (getEmail(date.getEmail()) == false) {
                return userRepository.saveUser(date);
            }else {
                return date;
            }
        }else {
            return date;
        }
    }

    public boolean getEmail(String email) {
        return userRepository.getEmail(email);
    }

   

    public User getEmailPassword(String email, String password) {
        Optional<User> users = userRepository.getEmailAndPassword(email, password);
        if (users.isEmpty()) {
            return new User(null, email, password, "NO DEFINIDO");
        } else {
            return users.get();
        }
    }

    // public User updateUser(User date) {
    //     if (date.getId() != null) {
    //         Optional<User> consulte = userRepository.getUser(date.getId());
    //         if (!consulte.isEmpty()) {
    //             if (date.getName() != null) {
    //                 consulte.get().setName(date.getName());
    //             }
    //             if (date.getEmail() != null) {
    //                 consulte.get().setEmail(date.getEmail());
    //             }
    //             if (date.getPassword() != null) {
    //                 consulte.get().setPassword(date.getPassword());
    //             }
    //             return userRepository.saveUser(consulte.get());
    //         }
    //     }
    //     return date;
    // }

    // public boolean deleteUser(int id) {
    //     Optional<User> consulte = userRepository.getUser(id);
    //     if (!consulte.isEmpty()) {
    //         userRepository.delete(consulte.get());
    //         return true;
    //     }
    //     return false;
    // }
}
