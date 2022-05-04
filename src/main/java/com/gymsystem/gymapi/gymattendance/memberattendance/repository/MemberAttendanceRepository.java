package com.gymsystem.gymapi.gymattendance.memberattendance.repository;

import com.gymsystem.gymapi.gymattendance.memberattendance.model.MemberAttendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberAttendanceRepository extends JpaRepository<MemberAttendance,Integer> {

    @Query(value = "SELECT * FROM member_attendance  WHERE attendance_date LIKE %:today%", nativeQuery = true)
    List<MemberAttendance> findByAttendanceDateLike(@Param("today") String today);
}
