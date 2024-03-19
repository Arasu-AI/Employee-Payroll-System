package com.payroll.Zuci.service;

import com.payroll.Zuci.model.Salary;
import com.payroll.Zuci.repository.SalaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalaryServiceImpl implements SalaryService {
    @Autowired
    private SalaryRepository salaryRepository;
    @Override
    public Salary createSalary(Salary salary) {
        return salaryRepository.save(salary);
    }
    @Override
    public List<Salary> allSalarys() {
        return salaryRepository.findAll();
    }




    @Override
    public Optional<Salary> getSalaryById(int id) {
        return salaryRepository.findById(id);
    }

    @Override
    public void deleteSalary(int id) {
        salaryRepository.deleteById(id);
    }
}
