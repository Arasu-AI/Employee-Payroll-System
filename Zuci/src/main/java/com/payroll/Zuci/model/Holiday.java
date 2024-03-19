package com.payroll.Zuci.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Holiday {
    @NotEmpty(message = "Holiday name must not be empty")
    private String name;

    @Id
    @NotNull(message = "Holiday date must not be null")
    @Temporal(TemporalType.DATE)
    @Column(name = "date")
    private Date date;

    @NotEmpty(message = "Day must not be empty")
    private String day;
}
