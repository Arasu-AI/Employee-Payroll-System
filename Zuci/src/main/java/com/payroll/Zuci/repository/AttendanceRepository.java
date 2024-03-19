package com.payroll.Zuci.repository;

import com.payroll.Zuci.model.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendanceRepository extends JpaRepository<Attendance,Integer> {

}