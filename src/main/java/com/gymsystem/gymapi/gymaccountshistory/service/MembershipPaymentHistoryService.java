package com.gymsystem.gymapi.gymaccountshistory.service;


import com.gymsystem.gymapi.gymaccountshistory.model.MembershipPaymentHistory;
import com.gymsystem.gymapi.gymaccountshistory.repository.MembershipPaymentHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembershipPaymentHistoryService {

    @Autowired
    private MembershipPaymentHistoryRepository membershipPaymentHistoryRepository;

    public List<MembershipPaymentHistory> getAllMembershipPaymentHistory() {
        return membershipPaymentHistoryRepository.findAll();
    }
}
