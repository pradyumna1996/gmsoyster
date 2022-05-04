package com.gymsystem.gymapi.gymattendance.staffattendance.service;

import com.gymsystem.gymapi.gymattendance.staffattendance.model.StaffAttendance;
import com.gymsystem.gymapi.gymattendance.staffattendance.repository.StaffAttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffAttendanceService {


    @Autowired
    private StaffAttendanceRepository staffAttendanceRepository;


    public List<StaffAttendance> getStaffAttendance() {
    return staffAttendanceRepository.findAll();
    }

    public void updateStaffAttendance(StaffAttendance staffAttendance) {
        staffAttendanceRepository.save(staffAttendance);
    }

    public void addStaffAttendance(StaffAttendance staffAttendance) {
        staffAttendanceRepository.save(staffAttendance);
    }
}
