package com.payroll.Zuci.service;

import com.payroll.Zuci.model.Department;
import com.payroll.Zuci.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department createDepartment(Department department) {
        return departmentRepository.save(department);
    }
    @Override
    public List<Department> allDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Optional<Department> getDepartmentById(int id) {
        return departmentRepository.findById(id);
    }

}
