package com.payroll.Zuci.controller;
import com.payroll.Zuci.model.Department;
import com.payroll.Zuci.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class  DepartmentController{

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/Department")
    public Department addDepartment( @RequestBody Department department){
        return departmentService.createDepartment(department);
    }

    @GetMapping("/Department")
    public List<Department> getDepartments(){
        return departmentService.allDepartments();
    }
    @GetMapping("/Department/{id}")
    public Optional<Department> getDepartmentById(@PathVariable("id") int id){
        return departmentService.getDepartmentById(id);
    }


}