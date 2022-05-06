package com.gymsystem.gymapi.gymaccountshistory.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MembershipPaymentHistory {

    @Id
    private Integer membershipPaymentHistoryId;

    private Double previousAmount;

    @Basic
    @Temporal(TemporalType.DATE)
    private Date membershipPaymentDate;





}
