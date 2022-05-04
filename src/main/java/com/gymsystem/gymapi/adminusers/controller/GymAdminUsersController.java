package com.gymsystem.gymapi.adminusers.controller;

import com.gymsystem.gymapi.adminusers.model.GymAdminUsers;
import com.gymsystem.gymapi.adminusers.service.GymAdminUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class GymAdminUsersController {

    @Autowired
    private GymAdminUsersService gymAdminUsersService;

    @GetMapping("/gymUsers")
    public ResponseEntity <List<GymAdminUsers>> getAllGymAdminUsers(){
        List<GymAdminUsers> gymAdminUsers = gymAdminUsersService.getAllGymUsers();
        if (gymAdminUsers.size()<=0){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }else{
            return ResponseEntity.of(Optional.of(gymAdminUsers));
        }
    }


}
