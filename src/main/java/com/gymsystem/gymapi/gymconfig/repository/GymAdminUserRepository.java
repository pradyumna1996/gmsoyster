package com.gymsystem.gymapi.gymconfig.repository;

import com.gymsystem.gymapi.gymconfig.model.GymAdminUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GymAdminUserRepository extends JpaRepository<GymAdminUser , Long> {

GymAdminUser findByUsername(String username);

}
