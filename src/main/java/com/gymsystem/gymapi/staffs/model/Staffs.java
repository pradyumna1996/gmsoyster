package com.gymsystem.gymapi.staffs.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Staffs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer staffId;

    private String uniqueStaffId;

    @NotBlank(message = "enter name")
    private String staffFullName;

    @NotBlank(message = "enter address")
    private String staffAddress;

    @NotNull(message = "enter a age")
    private Integer staffAge;

    @NotBlank(message = "select a gender")
    private String staffGender;

    @NotNull(message = "enter number")
    @Size(min =10, max = 10, message = "enter valid number")
    private String staffContact;

    @NotBlank(message = " select blood group")
    private String staffBloodGroup;

    @NotBlank(message = "enter a valid email")
    @Email
    private String staffEmail;

    @NotNull(message = "enter number")
    @Size(min =10, max = 10, message = "enter valid number")
    private String staffEmergencyContact;

    private String staffOrginalPhoto;

    @NotBlank(message = "enter post")
    private String staffDesignation;

}
