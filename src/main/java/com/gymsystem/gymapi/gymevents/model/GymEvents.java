package com.gymsystem.gymapi.gymevents.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class GymEvents {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gymEventId;

    @NotBlank(message = "enter event name")
    private String gymEventName;

    @NotNull(message = "enter a start date")
    @DateTimeFormat
    private Date gymEventStartDate;
    @DateTimeFormat
    @NotNull(message = "enter a End date")
    private Date gymEventEndDate;

    private String eventPhoto;

    @NotBlank(message = "write any description")
    private String gymEventDescription;
}
