import quantum.math.Complex;
import quantum.math.Qubit;
import quantum.gates.Gate;
//import quantum.gates.XGate; 
import quantum.gates.HGate;
import quantum.gates.XGate;
import java.util.ArrayList;
import quantum.circuit.Circuit; 

public class Main {

    public static void main(String[] args) {
        
       Complex alpha = new Complex(1, 0);
       Complex beta = new Complex(0, 0);

       Qubit qubit = new Qubit(alpha, beta);
       HGate hGate = new HGate();
       XGate xGate = new XGate(); 
       
       ArrayList<Gate> gates = new ArrayList<>();
          gates.add(hGate); 
          gates.add(xGate);
          gates.add(hGate); 

       Circuit circuit = new Circuit(gates);

       Qubit result = circuit.circuitExecution(qubit);

    //    Complex alphaResult = result.getAlpha(); 
    //    Complex betaResult = result.getBeta(); 

    //    System.out.println(alphaResult.getImaginary());
    //    System.out.println(alphaResult.getReal());

    //    System.out.println(betaResult.getImaginary());
    //    System.out.println(betaResult.getReal());

       double[] probabilites = circuit.getprobabilities(result); 
       System.out.print(probabilites); 
    
    }
}


