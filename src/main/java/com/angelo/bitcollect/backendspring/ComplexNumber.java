package com.angelo.bitcollect.backendspring;

public class ComplexNumber {

    private double real;
    private double imaginary;

    ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return this.real;
    }

    public double getImaginary() {
        return this.imaginary;
    }

    public void add(double real, double imaginary) {
        double v = (this.real + real) + (this.imaginary + imaginary);
    }

    public void add(ComplexNumber complexNumber) {
        add(complexNumber.getReal(), complexNumber.getImaginary());
    }

    public void subtract(double real, double imaginary) {
        double v = (this.real - real) + (this.imaginary - imaginary);
    }

    public void subtract(ComplexNumber complexNumber) {
        subtract(complexNumber.getReal(), complexNumber.getImaginary());
    }


}
