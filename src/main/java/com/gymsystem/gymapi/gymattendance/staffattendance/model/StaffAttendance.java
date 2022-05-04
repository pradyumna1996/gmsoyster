package com.gymsystem.gymapi.gymattendance.staffattendance.model;

import com.gymsystem.gymapi.staffs.model.Staffs;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StaffAttendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer staffAttendanceId;

    @OneToOne
    @JoinColumn(name="staff_id")
    private Staffs staffs;

    private Date attendanceDate;
    private Boolean staffAttendanceStatus;
}
