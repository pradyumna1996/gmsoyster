package com.gymsystem.gymapi.staffs.controller;

import com.gymsystem.gymapi.staffs.model.Staffs;
import com.gymsystem.gymapi.staffs.service.StaffsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class StaffsController {

    @Autowired
    private StaffsService staffsService;

    @GetMapping("/staffs")
    public ResponseEntity <List<Staffs>> getStaffs(){
        List<Staffs> staffs =  staffsService.getStaffs();
        if (staffs.size()<=0){
            return  ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }else{
            return ResponseEntity.of(Optional.of(staffs));
        }


    }

    @PostMapping("/staffs/addStaff")
    public ResponseEntity<?> addStaff( @Valid @RequestBody Staffs staff){
       if (staff.toString().equals("{}")) {
           return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("nothing insert in form");
       }
       if (staff ==null){
           return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("nothing inset in form");
       }
       if (staff !=null){
           staffsService.addStaff(staff);
           return ResponseEntity.status(HttpStatus.OK).body("staffs added successfully");
       }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("error in request");
    }

    @PutMapping("/staffs/editStaff/{staffId}")
    public void updateStaff(@PathVariable("staffId") Integer staffId , @RequestBody Staffs staff){
        staffsService.updateStaff(staff);
    }

    @DeleteMapping("/staffs/deleteStaff/{staffId}")
    public ResponseEntity<String> deleteStaff(@PathVariable("staffId") Integer staffId){
        staffsService.deleteStaff(staffId);
        return ResponseEntity.status(HttpStatus.OK).body("The selected event was deleted");
    }

}
