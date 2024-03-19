package com.payroll.Zuci.repository;
import com.payroll.Zuci.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}