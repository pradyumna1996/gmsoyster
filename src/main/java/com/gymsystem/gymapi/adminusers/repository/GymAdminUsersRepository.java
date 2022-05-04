package com.gymsystem.gymapi.adminusers.repository;

import com.gymsystem.gymapi.adminusers.model.GymAdminUsers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GymAdminUsersRepository extends JpaRepository<GymAdminUsers , Integer> {
}
