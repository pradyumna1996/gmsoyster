package com.gymsystem.gymapi.members.service;

import com.gymsystem.gymapi.members.model.Members;
import com.gymsystem.gymapi.members.repository.MembersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembersService {

    @Autowired
    private MembersRepository membersRepository;

    public List<Members> getAllMembers() {
        return membersRepository.findAll();
    }

    public void addMember(Members members) {
        membersRepository.save(members);
    }

    public void updateMember(Members members) {
        membersRepository.save(members);
    }

    public void deleteMember(Integer memberId) {
        membersRepository.deleteById(memberId);
    }
}
