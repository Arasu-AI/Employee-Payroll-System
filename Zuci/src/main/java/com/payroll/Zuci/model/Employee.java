package com.payroll.Zuci.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @NotEmpty(message = "Profile photo must not be empty")
    private String profilePhoto;

    @NotEmpty(message = "First name must not be empty")
    private String firstName;

    @NotEmpty(message = "Last name must not be empty")
    private String lastName;

    @Email(message = "Email address must be valid")
    @NotEmpty(message = "Email ID must not be empty")
    private String emailId;

    @NotEmpty(message = "Date of birth must not be empty")
    private String dateOfBirth;

    @NotEmpty(message = "Gender must not be empty")
    private String gender;

    @NotEmpty(message = "Address must not be empty")
    private String address;

    @Pattern(regexp="(^$|[0-9]{10})", message = "Contact number must be a valid 10-digit number")
    @NotEmpty(message = "Contact number must not be empty")
    private String contactNumber;

    @NotEmpty(message = "Department must not be empty")
    private String department;

    @NotEmpty(message = "Position must not be empty")
    private String position;

    @NotEmpty(message = "Employment status must not be empty")
    private String employmentStatus;

    @Positive(message = "Hourly rate must be positive")
    private double hoursRate;

    @PositiveOrZero(message = "Leave balances must be positive or zero")
    private int leaveBalances;

    @PositiveOrZero(message = "Leave taken must be positive or zero")
    private int leaveTaken;

    @NotEmpty(message = "Joining date must not be empty")
    private String joiningDate;

}
