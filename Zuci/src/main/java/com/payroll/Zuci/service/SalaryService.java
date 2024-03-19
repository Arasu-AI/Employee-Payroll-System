package com.payroll.Zuci.service;

import com.payroll.Zuci.model.Salary;

import java.util.List;
import java.util.Optional;

public interface SalaryService {

    public Salary createSalary(Salary salary);
    public List<Salary> allSalarys();
    public Optional<Salary> getSalaryById(int id);
    public void deleteSalary(int id);
}
