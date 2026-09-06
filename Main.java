import quantum.math.Complex;
import quantum.math.Qubit;

public class Main {

    public static void main(String[] args) {
        Qubit z3 = new Qubit(new Complex(1 / Math.sqrt(2),0), new Complex(1 / Math.sqrt(2),0));

       System.out.println(z3.isNormalized()); 
       System.out.println(z3.probabilityOfZero());
       System.out.println(z3.probabilityOfOne()); 
    }
}
