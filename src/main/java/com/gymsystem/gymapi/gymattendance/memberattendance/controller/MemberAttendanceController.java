package com.gymsystem.gymapi.gymattendance.memberattendance.controller;

import com.gymsystem.gymapi.gymattendance.memberattendance.model.MemberAttendance;
import com.gymsystem.gymapi.gymattendance.memberattendance.service.MemberAttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
public class MemberAttendanceController {

    @Autowired
    private MemberAttendanceService memberAttendanceService;

    @GetMapping("/memberAttendance")
    public List<MemberAttendance> getAllAttendanceList(){

        return memberAttendanceService.getAttendanceList();
    }

    @GetMapping("/memberAttendance/{today}")
    public List<MemberAttendance> getTodaysAttendanceList(@PathVariable("today") String today){
        return
                memberAttendanceService.getTodayAttendanceList(today);
    }


    @PostMapping("/memberAttendance")
    public void addMemberAttendance(@RequestBody List<MemberAttendance> memberAttendances){
        memberAttendances.forEach(

                memberAttendance ->memberAttendanceService.saveMemberAttendance(memberAttendance));

    }

    @PutMapping("/memberAttendance/{memberAttendanceId}")
    public void updateMemberAttendance(@RequestBody MemberAttendance memberAttendance , @PathVariable("memberAttendanceId") Integer memberAttendanceId){
        memberAttendanceService.updateMemberAttendance(memberAttendance);
    }

    @DeleteMapping("/memberAttendance/{memberAttendanceId}")
    public void deleteMemberAttendace(@PathVariable("memberAttendanceId") Integer memberAttendanceId){
        memberAttendanceService.deleteMemberAttendance(memberAttendanceId);
    }
}
