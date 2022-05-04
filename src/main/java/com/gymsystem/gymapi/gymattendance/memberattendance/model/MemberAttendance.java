package com.gymsystem.gymapi.gymattendance.memberattendance.model;

import com.gymsystem.gymapi.members.model.Members;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberAttendance {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer memberAttendanceId;

    @OneToOne
    @JoinColumn(name="member_id")
    private Members members;

    private Date attendanceDate;

    private Boolean memberAttendanceStatus;


}
