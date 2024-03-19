package com.payroll.Zuci.service;

import com.payroll.Zuci.model.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {

    public Department createDepartment(Department department);
    public List<Department> allDepartments();
    public Optional<Department> getDepartmentById(int id);
}
