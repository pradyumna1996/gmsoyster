package com.gymsystem.gymapi.gymaccountshistory.repository;

import com.gymsystem.gymapi.gymaccountshistory.model.MembershipPaymentHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembershipPaymentHistoryRepository extends JpaRepository<MembershipPaymentHistory , Integer> {
}

