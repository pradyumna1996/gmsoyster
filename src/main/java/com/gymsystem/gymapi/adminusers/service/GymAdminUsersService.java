package com.gymsystem.gymapi.adminusers.service;

import com.gymsystem.gymapi.adminusers.model.GymAdminUsers;
import com.gymsystem.gymapi.adminusers.repository.GymAdminUsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GymAdminUsersService {

    @Autowired
    private GymAdminUsersRepository gymAdminUsersRepository;


    public List<GymAdminUsers> getAllGymUsers() {
        return gymAdminUsersRepository.findAll();
    }
}
