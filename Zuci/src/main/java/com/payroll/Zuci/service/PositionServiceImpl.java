package com.payroll.Zuci.service;

import com.payroll.Zuci.model.Position;
import com.payroll.Zuci.repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PositionServiceImpl implements PositionService {
    @Autowired
    private PositionRepository positionRepository;
    @Override
    public Position createPosition(Position position) {
        return positionRepository.save(position);
    }
    @Override
    public List<Position> allPositions() {
        return positionRepository.findAll();
    }
    @Override
    public Optional<Position> getPositionById(int id) {
        return positionRepository.findById(id);
    }
    @Override
    public void deletePosition(int id) {
        positionRepository.deleteById(id);
    }
}
