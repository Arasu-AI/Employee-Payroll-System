package com.payroll.Zuci.repository;
import com.payroll.Zuci.model.Holiday;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

@Transactional
public interface HolidayRepository  extends JpaRepository<Holiday,Integer> {
    int deleteByDate(LocalDate date);
}
