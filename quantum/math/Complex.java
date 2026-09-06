package quantum.math;

public class Complex {

    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return this.real;
    }

    public double getImaginary() {
        return this.imaginary;
    }

    // Addition: (a + bi) + (c + di) = (a + c) + (b + d)i

    public Complex add(Complex other) {

        double sumReal = real + other.getReal();
        double sumImginary = imaginary + other.getImaginary();

        Complex newComNum = new Complex(sumReal, sumImginary);

        return newComNum;
    }

    // Multiplication: (a + bi)(c + di) = (ac - bd) + (ad + bc)i

    public Complex multiply(Complex other) {

        // Real part
        double firstDistribute = (real * other.real) - (imaginary * other.imaginary);

        // Imaginary part
        double secoundDistribute = (real * other.imaginary) + (imaginary * other.real);

        Complex complexEquation = new Complex(firstDistribute, secoundDistribute);

        return complexEquation;
    }

    // Magnitude formula: |z| = √(real² + imaginary²)

    public double magnitude() {

        double magnitude = Math.sqrt((real * real) + (imaginary * imaginary));

        return magnitude;
    }

    // Conjugate formula: a + bi → a - bi

    public Complex conjugate() {

        Complex conjugate = new Complex(real, -imaginary);

        return conjugate;
    }
}