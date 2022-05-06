package com.gymsystem.gymapi.gymaccounts.repository;

import com.gymsystem.gymapi.gymaccounts.model.GymAccountPayment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GymAccountRepository extends JpaRepository<GymAccountPayment , Integer> {
}
