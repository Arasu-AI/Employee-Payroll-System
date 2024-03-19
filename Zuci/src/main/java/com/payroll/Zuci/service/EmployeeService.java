package com.payroll.Zuci.service;

import com.payroll.Zuci.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    public Employee createEmployee(Employee employee);
    public List<Employee> allEmployees();
    public Optional<Employee> getEmployeeById(int id);
    public void deleteEmployee(int id);
}
