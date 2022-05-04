package com.gymsystem.gymapi.gympackages.service;

import com.gymsystem.gymapi.gympackages.model.GymPackages;
import com.gymsystem.gymapi.gympackages.repository.GymPackagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GymPackagesService {

    @Autowired
    private GymPackagesRepository gymPackagesRepository;

public List<GymPackages> getPackages(){

return gymPackagesRepository.findAll();

}

public void addGymPackage(GymPackages packages){
gymPackagesRepository.save(packages);
}


public void updateGymPackage(GymPackages gymPackages){
 gymPackagesRepository.save(gymPackages);
}

public  void deleteGymPackage(Integer id){
gymPackagesRepository.deleteById(id);
}


}
