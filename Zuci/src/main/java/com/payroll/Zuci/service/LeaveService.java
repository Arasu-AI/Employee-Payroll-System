package com.payroll.Zuci.service;

import com.payroll.Zuci.model.Leave;

import java.util.List;
import java.util.Optional;

public interface LeaveService {

    public Leave createLeave(Leave leave);
    public List<Leave> allLeaves();
    public Optional<Leave> getLeaveById(int id);
    public void deleteLeave(int id);
}
