package com.gymsystem.gymapi.gymevents.repository;

import com.gymsystem.gymapi.gymevents.model.GymEvents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GymEventsRepository extends JpaRepository<GymEvents , Integer> {
}
