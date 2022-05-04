package com.gymsystem.gymapi.adminusers.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GymAdminUsers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer gymUserId;

    @NotBlank(message = "enter user name or email")
    private String gymUserName;

    @Email
    @NotBlank(message = "email is required")
    private String gymUserEmail;

    @NotBlank(message = "enter a password")
    private String gymUserPassword;

}
