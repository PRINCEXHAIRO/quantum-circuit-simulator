package com.hairo.quantum_backend.controller;

import org.springframework.web.bind.annotation.RestController;
import com.hairo.quantum_backend.service.SimulationService;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class SimulationController {

    private final SimulationService simulationService;
    
    //Constuctor
    public SimulationController(SimulationService simulationService){
        this.simulationService = simulationService; 
    }

    @PostMapping("/api/simulate")
    public double[] simulateCircuit(@RequestBody List<String> gates) {
        
        return simulationService.simulate(gates);
    }

}