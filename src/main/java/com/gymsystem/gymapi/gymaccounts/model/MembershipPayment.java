package com.gymsystem.gymapi.gymaccounts.model;

import com.gymsystem.gymapi.members.model.Members;
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
public class MembershipPayment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="membership_payment_id")
    private Integer membershipPaymentId;


    @OneToOne
    @JoinColumn(name="member_id")
    private Members members;

    private Double paidAmount;
    private Date paidDate;
    private Boolean paymentStatus;

    @OneToOne
    @JoinColumn(name="staffId")
    private Staffs staffs;

}
