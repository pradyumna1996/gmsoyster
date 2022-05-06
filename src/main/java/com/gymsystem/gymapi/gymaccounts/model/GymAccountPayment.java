package com.gymsystem.gymapi.gymaccounts.model;

import com.gymsystem.gymapi.members.model.Members;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GymAccountPayment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer gymAccountPaymentId;

    @Basic
    @Temporal(value = TemporalType.DATE)
    private Date accountPaymentDate;

    private Double accountPayment;

    @ManyToMany
    @JoinColumn(name="member_id")
    private List<Members> members;
}
