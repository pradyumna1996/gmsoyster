package com.gymsystem.gymapi.members.repository;

import com.gymsystem.gymapi.members.model.Members;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembersRepository extends JpaRepository<Members, Integer> {
}
