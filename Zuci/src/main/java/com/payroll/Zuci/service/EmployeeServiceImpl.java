package com.payroll.Zuci.service;

import com.payroll.Zuci.model.Employee;
import com.payroll.Zuci.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
    @Override
    public List<Employee> allEmployees() {
        return employeeRepository.findAll();
    }




    @Override
    public Optional<Employee> getEmployeeById(int id) {
        return employeeRepository.findById(id);
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }
}
