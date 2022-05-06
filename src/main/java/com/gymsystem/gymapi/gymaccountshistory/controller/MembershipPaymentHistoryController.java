package com.gymsystem.gymapi.gymaccountshistory.controller;


import com.gymsystem.gymapi.gymaccountshistory.model.MembershipPaymentHistory;
import com.gymsystem.gymapi.gymaccountshistory.service.MembershipPaymentHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Controller
@CrossOrigin
public class MembershipPaymentHistoryController
{

    @Autowired
    private MembershipPaymentHistoryService membershipPaymentHistoryService;

    @GetMapping("/membershipPaymentHistory")
    public ResponseEntity<List<MembershipPaymentHistory>> getAllMembershipPaymentHistory(){

        List<MembershipPaymentHistory> membershipPaymentHistories = membershipPaymentHistoryService.getAllMembershipPaymentHistory();

        if (membershipPaymentHistories.size()<=0){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }else{
            return  ResponseEntity.of(Optional.of(membershipPaymentHistories));
        }
    }

}
