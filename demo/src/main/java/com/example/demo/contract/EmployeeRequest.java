package com.example.demo.contract;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class EmployeeRequest {

    private UUID empid;
    @NotEmpty(message = "Employee Name cannot be empty")
    private String fullname;
    @NotEmpty(message = "Employee designation cannot be empty")
    private String designation;
    @NotEmpty(message = "Employee Mobile Number cannot be empty")
    private String mobile;
    @NotEmpty(message = "Employee email cannot be empty")
    private String email;
    @JsonFormat(pattern = "dd-MM-yyyy")
    @PastOrPresent(message = "Date of birth cannot be a future date")
    @NotNull(message = "Date of birth cannot be empty")
    private LocalDate dateOfBirth;




}
