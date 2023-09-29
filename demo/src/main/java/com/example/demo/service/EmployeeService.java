package com.example.demo.service;

import com.example.demo.contract.EmployeeRequest;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final ModelMapper modelMapper = new ModelMapper();
    private final EmployeeRepository employeeRepository;


    public Employee saveEmployee(EmployeeRequest request) {

        Employee employee=modelMapper.map(request,Employee.class);
        employeeRepository.save(employee);
        return employee;
    }
}
