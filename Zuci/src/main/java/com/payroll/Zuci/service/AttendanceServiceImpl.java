package com.payroll.Zuci.service;

import com.payroll.Zuci.model.Attendance;
import com.payroll.Zuci.repository.AttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AttendanceServiceImpl implements AttendanceService {
    @Autowired
    private AttendanceRepository attendanceRepository;
    @Override
    public Attendance createAttendance(Attendance attendance) {
        return attendanceRepository.save(attendance);
    }
    @Override
    public List<Attendance> allAttendances() {
        return attendanceRepository.findAll();
    }




    @Override
    public Optional<Attendance> getAttendanceById(int id) {
        return attendanceRepository.findById(id);
    }

    @Override
    public void deleteAttendance(int id) {
        attendanceRepository.deleteById(id);
    }
}
