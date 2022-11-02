package com.international.shopfloor.controller;

import com.international.shopfloor.entity.Employee;
import com.international.shopfloor.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Transactional
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping(path = "/employee/save")
    public ResponseEntity<?> createEmployee() {
        Employee newEmployee = new Employee();
        newEmployee.setName("Baeldung");
        employeeRepository.save(newEmployee);
        return ResponseEntity.ok(newEmployee);
    }

    @GetMapping(path = "/employee")
    public ResponseEntity<?> getEmployees() {
        return ResponseEntity.ok(employeeRepository.findAll());
    }
}
