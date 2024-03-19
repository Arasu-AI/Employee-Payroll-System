package com.payroll.Zuci.service;

import com.payroll.Zuci.model.Leave;
import com.payroll.Zuci.repository.LeaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LeaveServiceImpl implements LeaveService {
    @Autowired
    private LeaveRepository leaveRepository;
    @Override
    public Leave createLeave(Leave leave) {
        return leaveRepository.save(leave);
    }
    @Override
    public List<Leave> allLeaves() {
        return leaveRepository.findAll();
    }
    @Override
    public Optional<Leave> getLeaveById(int id) {
        return leaveRepository.findById(id);
    }

    @Override
    public void deleteLeave(int id) {
        leaveRepository.deleteById(id);
    }
}
