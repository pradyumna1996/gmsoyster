package com.gymsystem.gymapi.members.model;


import com.gymsystem.gymapi.gympackages.model.GymPackages;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Members {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer memberId;

    @NotBlank(message = "enter  member fullName")
    private String memberFullName;

    @NotBlank(message = "select gender")
    private String memberGender;

    @NotNull(message = "enter member age")
    private Integer memberAge;

    @NotBlank(message = "enter member address")
    private String memberAddress;

    @NotBlank(message = "enter member email")
    @Email(message = "enter valid email")
    private String memberEmail;

    @NotNull(message = "enter member's number")
    @Size( min = 10, max = 10, message = "enter member's valid number")
    @NumberFormat
    private String memberContactNumber;

    @NotNull(message = "enter member's height")
    @NumberFormat
    @Min(value = 5)
    @Max( value = 7, message = "height should be less than 7")
    private Double memberHeight;

    @NotNull(message = "enter member's weight")
    @NumberFormat
    private Double memberWeight;

    @NotBlank(message = "select a blood group")
    private String memberBloodGroup;

    @NotNull(message = "enter member's number")
    @Size( min = 10, max = 10, message = "enter member's valid number")
    @NumberFormat
    private String memberEmergencyContact;

//    @NotNull(message = "enter paid amounts")
    @NumberFormat
    private Double memberPaidAmount;

    @NotBlank(message = "enter description")
    private String memberDescription;

    private String memberOriginalPhoto;

    @NotNull(message ="select Enrollment  date")
    @DateTimeFormat
    private Date memberEnrollmentDate;

//    @NotNull(message ="select a payment status")
    private Boolean memberPaymentStatus;

    @NotNull(message ="select a BMI in number")
    @NumberFormat
    private Double memberBMI;

//    @NotNull(message ="enter a member's discount")
    @NumberFormat
    private Double memberDiscount;


    @NotNull(message ="enter a member's bodyFat")
    @NumberFormat
    private Double memberBodyFat;


    @OneToOne
    @JoinColumn(name="gym_package_id")
    @NotNull(message = "select a package")
    private GymPackages gymPackages;


//    @OneToOne(cascade= CascadeType.ALL)
//    @JoinColumn(name="gymPackageId",referencedColumnName = "gymPackageId")
//  @JsonManagedReference
//    private GymPackages gymPackages;
//
//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL , mappedBy="members")
//    @JsonBackReference
//    private GymPackageSubscription gymPackageSubscription;

}
