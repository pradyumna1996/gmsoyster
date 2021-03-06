package com.gymsystem.gymapi.gymevents.service;

import com.gymsystem.gymapi.gymevents.model.GymEvents;
import com.gymsystem.gymapi.gymevents.repository.GymEventsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GymEventsService {

    @Autowired
    private GymEventsRepository gymEventsRepository;


    public List<GymEvents> getAllGymEvents() {
        return  gymEventsRepository.findAll();
    }

    public void addGymEvent(GymEvents gymEvents) {
        gymEventsRepository.save(gymEvents);
    }

    public void updateGymEvent(GymEvents gymEvents) {
        gymEventsRepository.save(gymEvents);
    }

    public void deleteGymEvent(Integer gymEventId) {
        gymEventsRepository.deleteById(gymEventId);
    }
}
