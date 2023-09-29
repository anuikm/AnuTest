package com.example.demo.controller;

import com.example.demo.contract.EmployeeRequest;
import com.example.demo.contract.EmployeeResponse;
import com.example.demo.contract.Response;
import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/assessment")
@RequiredArgsConstructor
@Validated
public class EmployeeController {
    private final EmployeeService employeeService;
    @SneakyThrows
    @Operation(summary = "Save Employee Details request")
    @PostMapping(value = {"/save-employee-details"})
    public ResponseEntity<?> saveEmployeeDetails( @Valid @RequestBody EmployeeRequest request)
    {
        Employee employee = employeeService.saveEmployee(request);
        EmployeeResponse employeeResponse =
                EmployeeResponse.builder()
                        .empid(
                                employee.getEmpid())
                        .build();

        return new ResponseEntity<>(
                Response.<EmployeeResponse>builder()
                        .payload(employeeResponse)
                        .message("Successfully saved employee details")
                        .build(),
                HttpStatus.CREATED);
    }
}
