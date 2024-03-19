package com.payroll.Zuci.controller;

import com.payroll.Zuci.model.Employee;
import com.payroll.Zuci.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class SalaryController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/Employee")
    public Employee addEmployee( @RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }

    @GetMapping("/Employee")
    public List<Employee> getEmployees(){
    return employeeService.allEmployees();
    }
    @GetMapping("/Employee/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable("id") int id){
        return employeeService.getEmployeeById(id);
    }
    @DeleteMapping("/Employee/{id}")
    public void deleteEmployeeById(@PathVariable("id") int id){
         employeeService.deleteEmployee(id);
    }

}