package com.gymsystem.gymapi.members.controller;

import com.gymsystem.gymapi.members.model.Members;
import com.gymsystem.gymapi.members.service.MembersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class MembersController {

    @Autowired
    private MembersService membersService;

    @GetMapping("/members")
    public ResponseEntity <List<Members> >getAllMembers(){
        List<Members> members = membersService.getAllMembers();
        if (members.size()<=0){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }else{
            return  ResponseEntity.of(Optional.of(members));
        }
    }

    @PostMapping("/members/addMember")
    public ResponseEntity<?>  addMember( @Valid @RequestBody Members members){
        if (members.toString().equals("{}")) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("nothing insert in form");

        }
        if (members ==null) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("nothing inset in form");
        }
        if (members !=null){
            membersService.addMember(members);
            return ResponseEntity.status(HttpStatus.OK).body("Member added successfully");
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("error in request");
    }

    @PutMapping("/members/editMember/{memberId}")
    public void updateMember(@PathVariable("memberId") Integer memberId , @RequestBody Members members){
        membersService.updateMember(members);
    }

    @DeleteMapping("/members/deleteMember/{memberId}")
    public ResponseEntity deleteMember(@PathVariable("memberId") Integer memberId){
        return ResponseEntity.status(HttpStatus.OK).body("The selected member was deleted");
    }
}
