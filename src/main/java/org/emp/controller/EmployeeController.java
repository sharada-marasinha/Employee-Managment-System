package org.emp.controller;

import lombok.RequiredArgsConstructor;
import org.emp.dto.Employee;
import org.emp.entity.EmployeeEntity;
import org.emp.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp-controller")
//http://localhost:8080/emp-controller/add-employee
@RequiredArgsConstructor
public class EmployeeController {
    final EmployeeService service;
    @PostMapping("add-employee")
    public void addEmployee(@RequestBody Employee employee) {
        service.addEmployee(employee);
    }

    @GetMapping("get-all")
    public List<Employee> getAll() {
      return service.getAll();
    }
}

