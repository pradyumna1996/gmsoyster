package com.gymsystem.gymapi.gymevents.controller;

import com.gymsystem.gymapi.gymevents.model.GymEvents;
import com.gymsystem.gymapi.gymevents.service.GymEventsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class GymEventsController {
    @Autowired
    private GymEventsService gymEventsService;


    @GetMapping("/gymEvents")
    public ResponseEntity <List<GymEvents>>getAllGymEvents(){
        List<GymEvents> gymEvents = gymEventsService.getAllGymEvents();
        if ( gymEvents.size()<=0){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } else{
            return ResponseEntity.of(Optional.of(gymEvents));
        }

    }

    @PostMapping("/gymEvents/addEvent")
    public ResponseEntity<?> addGymEvent( @Valid @RequestBody GymEvents gymEvents) {
        if (gymEvents.toString().equals("{}")) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("nothing insert in form");
        }
            if (gymEvents == null) {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("nothing insert in form");
            }
            if (gymEvents != null) {
                gymEventsService.addGymEvent(gymEvents);
                return ResponseEntity.status(HttpStatus.OK).body("Events added successfully");
            }


        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("error in request");
    }


    @PutMapping("/gymEvents/editEvent/{gymEventId}")
    public void updateGymEvent(@RequestBody GymEvents gymEvents , @PathVariable("gymEventId") Integer gymEventId){
        gymEventsService.updateGymEvent(gymEvents);
    }

    @DeleteMapping("/gymEvents/deleteEvent/{gymEventId}")
    public ResponseEntity<?> deleteGymEvent(@PathVariable("gymEventId") Integer gymEventId){
        gymEventsService.deleteGymEvent(gymEventId);
        return ResponseEntity.status(HttpStatus.OK).body("The selected event was deleted");
    }
}
