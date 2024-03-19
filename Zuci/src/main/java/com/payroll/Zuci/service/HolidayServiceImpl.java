package com.payroll.Zuci.service;

import com.payroll.Zuci.model.Holiday;
import com.payroll.Zuci.repository.HolidayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class HolidayServiceImpl implements HolidayService{


    @Autowired
    private HolidayRepository holidayRepository;

    @Override
    public Holiday createHoliday(Holiday holiday) {
        return holidayRepository.save(holiday);
    }

    @Override
    public List<Holiday> allHolidays() {
        return holidayRepository.findAll();
    }

    @Override
    public int deleteHoliday(LocalDate date) {
    return holidayRepository.deleteByDate(date);
    }
}
