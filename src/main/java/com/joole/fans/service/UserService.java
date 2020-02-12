package com.joole.fans.service;

import com.joole.fans.model.User;
import org.springframework.stereotype.Service;



@Service
public interface UserService {

    User findUserbyName( String username);

}
