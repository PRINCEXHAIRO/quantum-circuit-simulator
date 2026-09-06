package quantum.math;

public class Qubit {
    //ampitudes 
    private Complex alpha; 
    private Complex beta; 

    public Qubit(Complex alpha, Complex beta){
        //these reprsent : ∣ψ⟩=[αβ​]
        this.alpha = alpha; 
        this.beta = beta; 
    }
    public boolean isNormalized() {
       double magAlpha = alpha.magnitude(); 
       double magBeta =  beta.magnitude(); 
       
        //∣α∣^2+∣β∣^2 = 1
        double isNormal = ((magAlpha * magAlpha) + (magBeta * magBeta)); 
        
        if(isNormal == 1){
            return true; 
        }

        return false;  
    }
    public double probabilityOfZero(){
        //P(0)=∣α∣^2
        double propAlpha = alpha.magnitude(); 
        double propEquation = propAlpha * propAlpha; 
        
        return propEquation; 
    }
    public double probabilityOfOne(){
        //P(1)=∣β∣^2
        double propBeta = beta.magnitude(); 
        double propEquation = propBeta * propBeta; 
        
        return propEquation; 
    }
    public int measure(){
    
        double random = Math.random();
        double result = probabilityOfZero();
        
        if(random < result){
            return 0; 
        } else{
            return 1; 
        }
    }
    
    public Complex getAlpha() {
    return alpha;
    }

    public Complex getBeta() {
    return beta;
    }


}
