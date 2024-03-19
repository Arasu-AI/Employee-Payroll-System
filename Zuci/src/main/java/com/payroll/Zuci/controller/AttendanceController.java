package com.payroll.Zuci.controller;

import com.payroll.Zuci.model.Attendance;
import com.payroll.Zuci.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class AttendanceController {

    @Autowired
    private AttendanceService attendanceService;

    @PostMapping("/Attendance")
    public Attendance addAttendance( @RequestBody Attendance attendance){
        return attendanceService.createAttendance(attendance);
    }

    @GetMapping("/Attendance")
    public List<Attendance> getAttendances(){
    return attendanceService.allAttendances();
    }
    @GetMapping("/Attendance/{id}")
    public Optional<Attendance> getAttendanceById(@PathVariable("id") int id){
        return attendanceService.getAttendanceById(id);
    }
    @DeleteMapping("/Attendance/{id}")
    public void deleteAttendanceById(@PathVariable("id") int id){
         attendanceService.deleteAttendance(id);
    }

}