package com.payroll.Zuci.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Salary {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @NotNull(message = "Employee ID must not be null")
    @Positive(message = "Employee ID must be positive")
    private int employeeId;

    @NotEmpty(message = "Month must not be empty")
    private String month;

    @NotNull(message = "Salary must not be null")
    @Positive(message = "Salary must be positive")
    private double salary;

    @NotNull (message = "Allowance must not be null")
    @Positive(message = "Allowance must be positive")
    private double allowance;

    @NotNull(message = "Deductions must not be null")
    @Positive(message = "Deductions must be positive")
    private double deductions;

    @NotNull(message = "Tax must not be null")
    @Positive(message = "Tax must be positive")
    private double tax;

    @NotNull(message = "Total hours must not be null")
    @Positive(message = "Total hours must be positive")
    private double totalHours;

}
