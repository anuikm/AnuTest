package com.example.demo.contract;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeeResponse {

    private UUID empid;
    private String fullname;
    private String designation;
    private String mobile;
    private String email;
    private LocalDate dateOfBirth;


}
