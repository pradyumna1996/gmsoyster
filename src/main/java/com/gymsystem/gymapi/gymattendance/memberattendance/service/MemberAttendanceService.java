package com.gymsystem.gymapi.gymattendance.memberattendance.service;


import com.gymsystem.gymapi.gymattendance.memberattendance.model.MemberAttendance;
import com.gymsystem.gymapi.gymattendance.memberattendance.repository.MemberAttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class MemberAttendanceService {

    @Autowired
    private MemberAttendanceRepository memberAttendanceRepository;

    public List<MemberAttendance> getAttendanceList() {
        return memberAttendanceRepository.findAll();
    }

    public void saveMemberAttendance(MemberAttendance memberAttendance) {
        memberAttendanceRepository.save(memberAttendance);
    }

    public void updateMemberAttendance(MemberAttendance memberAttendance) {
        memberAttendanceRepository.save(memberAttendance);
    }


    public void deleteMemberAttendance(Integer memberAttendanceId) {
        memberAttendanceRepository.deleteById(memberAttendanceId);
    }

    public List<MemberAttendance> getTodayAttendanceList(String today) {
    return memberAttendanceRepository.findByAttendanceDateLike(today);
    }
}
