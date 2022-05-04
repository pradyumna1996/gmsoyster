package com.gymsystem.gymapi.staffs.repository;

import com.gymsystem.gymapi.staffs.model.Staffs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffsRepository extends JpaRepository<Staffs ,Integer> {
}
