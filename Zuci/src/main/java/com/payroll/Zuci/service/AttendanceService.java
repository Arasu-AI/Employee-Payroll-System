package com.payroll.Zuci.service;

import com.payroll.Zuci.model.Attendance;

import java.util.List;
import java.util.Optional;

public interface AttendanceService {

    public Attendance createAttendance(Attendance attendance);
    public List<Attendance> allAttendances();
    public Optional<Attendance> getAttendanceById(int id);
    public void deleteAttendance(int id);
}
