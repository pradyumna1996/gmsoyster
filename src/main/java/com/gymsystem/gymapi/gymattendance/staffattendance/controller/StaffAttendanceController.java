package com.gymsystem.gymapi.gymattendance.staffattendance.controller;

import com.gymsystem.gymapi.gymattendance.memberattendance.model.MemberAttendance;
import com.gymsystem.gymapi.gymattendance.staffattendance.model.StaffAttendance;
import com.gymsystem.gymapi.gymattendance.staffattendance.service.StaffAttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class StaffAttendanceController {

    @Autowired
    private StaffAttendanceService staffAttendanceService;

    @GetMapping("/staffAttendance")
    public List<StaffAttendance> getAllAttendanceList(){
        return staffAttendanceService.getStaffAttendance();
    }

    @PostMapping("/staffAttendance")
    public void addAttendace(@RequestBody StaffAttendance staffAttendance){
        staffAttendanceService.addStaffAttendance(staffAttendance);
    }

    @PutMapping("/staffAttendance/{staffId}")
public void updateAttendance(@RequestBody StaffAttendance staffAttendance , @PathVariable("staffId") Integer staffId){
        staffAttendanceService.updateStaffAttendance(staffAttendance);
    }

}
