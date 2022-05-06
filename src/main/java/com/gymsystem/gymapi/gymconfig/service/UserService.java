package com.gymsystem.gymapi.gymconfig.service;

import com.gymsystem.gymapi.gymconfig.model.GymAdminUser;
import com.gymsystem.gymapi.gymconfig.repository.GymAdminUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class UserService implements UserDetailsService {

    @Autowired
    private GymAdminUserRepository gymAdminUserRepository;

    @Autowired
    private GymAdminUser gymAdminUser;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        //get user from database
        gymAdminUser=gymAdminUserRepository.findByUsername(userName);

        return new User(gymAdminUser.getUsername(), gymAdminUser.getPassword(), new ArrayList<>());
    }
}
