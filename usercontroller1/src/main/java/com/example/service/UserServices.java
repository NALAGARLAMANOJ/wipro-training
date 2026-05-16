package com.example.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.exception.AgeNotFoundException;
import com.example.repo.UserRepository;

@Service
public class UserServices {

    @Autowired
    private UserRepository repository;

    public User saveUser(User user) {

        if (user.getAge() < 18) {
            throw new AgeNotFoundException(
                    "Age should be greater than 18");
        }

        return repository.save(user);
    }
}