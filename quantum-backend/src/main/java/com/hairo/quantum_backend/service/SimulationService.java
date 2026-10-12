package com.hairo.quantum_backend.service;

import org.springframework.stereotype.Service;
import java.util.List;
import quantum.circuit.Circuit;
import quantum.math.Qubit;
import quantum.math.Complex;
import quantum.gates.HGate;
import quantum.gates.XGate;
import java.util.ArrayList; 
import java.util.Arrays; 
import quantum.gates.Gate;

@Service
public class SimulationService {
    public double[] simulate(List<String> gates){

        Circuit circuit = new Circuit(new ArrayList<Gate>());
        
        //Iterate through strings and assigning gate objects 
        for(String gateName : gates){
            //adds H Gate 
             if(gateName.equals("H")){
             circuit.addGate(new HGate()); 
          }
            //adds X gate 
            else if(gateName.equals("X")){
             circuit.addGate(new XGate()); 
            }
            else{
                 throw new IllegalArgumentException("Unsupported gate: " + gateName);
            }
       }
        
        Complex alpha = new Complex(1, 0);
        Complex beta = new Complex(0, 0);

        Qubit qubit = new Qubit(alpha, beta);
        
        Qubit result = circuit.circuitExecution(qubit);

        double[] probabilites = circuit.getprobabilities(result); 

        return probabilites; 

    }
}
