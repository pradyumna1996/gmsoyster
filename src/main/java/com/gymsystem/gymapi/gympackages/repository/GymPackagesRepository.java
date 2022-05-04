package com.gymsystem.gymapi.gympackages.repository;

import com.gymsystem.gymapi.gympackages.model.GymPackages;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface GymPackagesRepository extends JpaRepository<GymPackages, Integer> {
}
