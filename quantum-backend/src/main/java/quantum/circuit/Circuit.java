package quantum.circuit;

import java.util.ArrayList;
import quantum.gates.Gate;
import quantum.math.Qubit;  

public class Circuit {
    private ArrayList<Gate> gates = new ArrayList<>(); 

    public Circuit(ArrayList<Gate> gates) {
        this.gates = gates;
    }
    
    public void addGate(Gate gate){
        gates.add(gate); 
    }

    public Qubit circuitExecution(Qubit qubit){
        //We have the starting Qubit, we now need to know what to Execute on that qubit
        ArrayList<Gate> sequenceGates = gates;
        Qubit result = qubit;  

        for(int i = 0; i < sequenceGates.size(); i++){
            if(sequenceGates.isEmpty() == true){
                System.out.print("No gates to apply at this time"); 
            }
            else{
                 //Take the first gate and apply to qubit 
                Gate firstGate = sequenceGates.get(i); 
                //result captures the Gate in the array and applys to the Qubit
                result = firstGate.apply(result);
        
            }
        }
        return result; 
    }

    public double[] getprobabilities(Qubit qubit){
        //Take the qubit
        double[] probabilities = new double[2]; 

        double probabilityOfZero = qubit.probabilityOfZero();  
        double probabilityOfOne = qubit.probabilityOfOne(); 

        probabilities[0] =  probabilityOfZero;
        probabilities[1] =  probabilityOfOne;

        System.out.println("P(0) : " + probabilityOfZero);
        System.out.println("P(1) : " + probabilityOfOne);
    
        //return the double 
        return probabilities; 
    }

}
