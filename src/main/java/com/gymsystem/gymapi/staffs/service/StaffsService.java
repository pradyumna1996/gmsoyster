package com.gymsystem.gymapi.staffs.service;

import com.gymsystem.gymapi.staffs.model.Staffs;
import com.gymsystem.gymapi.staffs.repository.StaffsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffsService {

    @Autowired
    private StaffsRepository staffsRepository;

    public List<Staffs> getStaffs(){
        return staffsRepository.findAll();
    }

    public void addStaff(Staffs staffs){
        staffsRepository.save(staffs);
    }

    public void updateStaff(Staffs staffs){
        staffsRepository.save(staffs);
    }

    public void deleteStaff(Integer staffId){
        staffsRepository.deleteById(staffId);
    }
}
