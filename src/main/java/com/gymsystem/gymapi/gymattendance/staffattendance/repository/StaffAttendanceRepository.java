package com.gymsystem.gymapi.gymattendance.staffattendance.repository;

import com.gymsystem.gymapi.gymattendance.staffattendance.model.StaffAttendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffAttendanceRepository extends JpaRepository<StaffAttendance , Integer> {
}
