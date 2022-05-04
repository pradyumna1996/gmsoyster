package com.gymsystem.gymapi.gympackages.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.NumberFormat;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class GymPackages {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gymPackageId;


    @NotBlank(message = "Enter Gym Package Name")
    private String gymPackageName;

    private String gymPackageDescription;

    private Double gymPackagePrice;

    @Min(value = 0 , message = "Should not be less than 0")
    @Max(value = 100 , message = "Discount less than 100")
    private Double gymPackageDiscount;

//    @Min(value = 1 , message = "Should not be less than 1")
//    @Max(value = 12 , message = "Discount grater than 12")
    @NotNull(message = "Empty Package Duration")
    private Integer gymPackageDuration;

}