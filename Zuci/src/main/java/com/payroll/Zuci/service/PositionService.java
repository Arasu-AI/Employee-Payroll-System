package com.payroll.Zuci.service;

import com.payroll.Zuci.model.Position;

import java.util.List;
import java.util.Optional;

public interface PositionService {

    public Position createPosition(Position position);
    public List<Position> allPositions();
    public Optional<Position> getPositionById(int id);
    public void deletePosition(int id);
}
