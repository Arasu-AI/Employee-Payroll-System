package com.payroll.Zuci.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @NotEmpty(message = "Name must not be empty")
    @Size(min = 2, max = 100, message = "Name must be between 2 and 100 characters")
    private String name;

    @NotEmpty(message = "Department must not be empty")
    private String department;

    @NotNull(message = "Allowance must not be null")
    @Positive(message = "Allowance must be positive")
    private int allowance;

    @NotNull(message = "Deduction must not be null")
    @Positive(message = "Deduction must be positive")
    private int deduction;

}
