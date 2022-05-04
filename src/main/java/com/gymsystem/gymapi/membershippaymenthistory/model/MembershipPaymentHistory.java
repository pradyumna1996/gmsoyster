package com.gymsystem.gymapi.membershippaymenthistory.model;

import com.gymsystem.gymapi.gymaccounts.model.MembershipPayment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MembershipPaymentHistory {

    @Id
    private Integer membershipPaymentHistoryId;

    private Double previousAmounts;

    @ManyToOne
    @JoinColumn(name="membership_payment_id")
    private MembershipPayment membershipPayment;


}
