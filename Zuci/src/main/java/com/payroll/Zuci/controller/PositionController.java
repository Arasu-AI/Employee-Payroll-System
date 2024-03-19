package com.payroll.Zuci.controller;

import com.payroll.Zuci.model.Position;
import com.payroll.Zuci.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class PositionController {

    @Autowired
    private PositionService positionService;

    @PostMapping("/Position")
    public Position addPosition( @RequestBody Position position){
        return positionService.createPosition(position);
    }

    @GetMapping("/Position")
    public List<Position> getPositions(){
    return positionService.allPositions();
    }
    @GetMapping("/Position/{id}")
    public Optional<Position> getPositionById(@PathVariable("id") int id){
        return positionService.getPositionById(id);
    }
    @DeleteMapping("/Position/{id}")
    public void deletePositionById(@PathVariable("id") int id){
         positionService.deletePosition(id);
    }

}