package quantum.gates;

import quantum.math.Qubit;
import quantum.math.Complex;

public class HGate implements Gate{
    
    public Qubit apply(Qubit qubit){
        
        Complex alpha =  qubit.getAlpha();
        Complex beta = qubit.getBeta(); 

        Complex hAlpha = alpha.add(beta);
        Complex hBeta = alpha.subtract(beta); 
        
        double newAlphaReal = hAlpha.getReal() / Math.sqrt(2);
        double newAlphaImaginary = hAlpha.getImaginary() / Math.sqrt(2);

        double newBetaReal = hBeta.getReal() / Math.sqrt(2);
        double newBetaImaginary = hBeta.getImaginary() / Math.sqrt(2);
        
        Complex newAlpha = new Complex(newAlphaReal, newAlphaImaginary); 
        Complex newBeta = new Complex(newBetaReal, newBetaImaginary); 

        return new Qubit(newAlpha, newBeta);
    }
}
