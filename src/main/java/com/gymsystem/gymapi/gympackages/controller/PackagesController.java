package com.gymsystem.gymapi.gympackages.controller;

import com.gymsystem.gymapi.gympackages.model.GymPackages;
import com.gymsystem.gymapi.gympackages.service.GymPackagesService;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class PackagesController {

    @Autowired
    private GymPackagesService gymPackagesService;

    @GetMapping("/packages")
    public ResponseEntity<List<GymPackages>> getPackages(){
        List<GymPackages> gymPackages = gymPackagesService.getPackages();
        if(gymPackages.size()<=0){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }else{
            return ResponseEntity.of(Optional.of(gymPackages));
        }
    }

    @PostMapping("/packages/addPackage")
    public ResponseEntity<?> addGymPackage(@Valid @RequestBody GymPackages gymPackages){

            
        if(gymPackages.toString().equals("{}")){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Nothing is inserted in Form");
        }

        if(gymPackages ==null){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Nothing is inserted in Form");
        }
        if( gymPackages != null){
            gymPackagesService.addGymPackage(gymPackages);
            return ResponseEntity.status(HttpStatus.OK).body("Gym Package Added Successful.");
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error In Request");
    }

    @PutMapping("/packages/editPackage/{gymPackageId}")
    public void updateGymPackage(@PathVariable("gymPackageId") Integer gymPackageId , @RequestBody GymPackages gymPackages){
        gymPackagesService.updateGymPackage(gymPackages);
    }

    @DeleteMapping("/packages/deletePackage/{gymPackageId}")
    public ResponseEntity<?> deletePackage(@PathVariable("gymPackageId") Integer gymPackageId){

         gymPackagesService.deleteGymPackage(gymPackageId);
         return ResponseEntity.status(HttpStatus.OK).body("The Selected Package was Deleted");
    }
}
