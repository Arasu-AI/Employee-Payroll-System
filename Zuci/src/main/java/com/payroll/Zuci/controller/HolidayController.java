package com.payroll.Zuci.controller;

import com.payroll.Zuci.model.Holiday;
import com.payroll.Zuci.service.HolidayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@CrossOrigin

public class  HolidayController{

    @Autowired
    private HolidayService holidayService;

    @PostMapping("/Holiday")
    public Holiday addHoliday( @RequestBody Holiday holiday){
        return holidayService.createHoliday(holiday);
    }

    @GetMapping("/Holiday")
    public List<Holiday> getHolidays(){
        return holidayService.allHolidays();
    }


    @DeleteMapping("/Holiday/{date}")
    public int deleteHolidayByDate(@PathVariable("date")LocalDate date){
        return holidayService.deleteHoliday(date);
    }


}