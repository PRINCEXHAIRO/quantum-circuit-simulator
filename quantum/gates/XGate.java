package quantum.gates;

import quantum.math.Qubit;
import quantum.math.Complex;


public class XGate implements Gate{
    //XGate are the same as NOT gates, it act as an inverter 
    public Qubit apply(Qubit qubit){
        
        Complex alpha =  qubit.getAlpha();
        Complex beta = qubit.getBeta(); 

        return new Qubit (beta, alpha);  
        
    }

}