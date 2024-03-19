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

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Leave {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @NotNull(message = "Employee ID must not be null")
    @Positive(message = "Employee ID must be positive")
    private int employeeId;

    @NotEmpty(message = "Leave type must not be empty")
    private String leaveType;

    @NotEmpty(message = "Reason must not be empty")
    @Size(min = 10, max = 100, message = "Leave reason must be between 20 and 100 characters")
    private String reason;

    @Positive(message = "Number of days must be positive")
    private int noOfDays;

    @NotNull(message = "From date must not be null")
    private LocalDate fromDate;

    @NotNull(message = "To date must not be null")
    private LocalDate toDate;

    @NotEmpty(message = "Status must not be empty")
    private String status;

}
