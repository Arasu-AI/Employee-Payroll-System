package com.payroll.Zuci.service;

import com.payroll.Zuci.model.Holiday;
import java.time.LocalDate;
import java.util.List;


public interface HolidayService {
    public Holiday createHoliday(Holiday holiday);
    public List<Holiday> allHolidays();
    public int deleteHoliday(LocalDate date);

}
