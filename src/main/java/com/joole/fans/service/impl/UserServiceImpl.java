package com.joole.fans.service.impl;

import com.joole.fans.model.User;
import com.joole.fans.repository.UserRepository;
import com.joole.fans.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository UserRepository;

    public User findUserbyName( String username) {

        User users = UserRepository.findByUsername(username);

        return users;
    }



}
