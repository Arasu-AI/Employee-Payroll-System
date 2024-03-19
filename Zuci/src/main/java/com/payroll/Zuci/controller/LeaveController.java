package com.payroll.Zuci.controller;

import com.payroll.Zuci.model.Leave;
import com.payroll.Zuci.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class LeaveController {

    @Autowired
    private LeaveService leaveService;

    @PostMapping("/Leave")
    public Leave addLeave( @RequestBody Leave leave){
        return leaveService.createLeave(leave);
    }

    @GetMapping("/Leave")
    public List<Leave> getLeaves(){
    return leaveService.allLeaves();
    }
    @GetMapping("/Leave/{id}")
    public Optional<Leave> getLeaveById(@PathVariable("id") int id){
        return leaveService.getLeaveById(id);
    }
    @DeleteMapping("/Leave/{id}")
    public void deleteLeaveById(@PathVariable("id") int id){
         leaveService.deleteLeave(id);
    }

}