//Brendon Kupsch
//CMPT_220L_202
//Prof. Arias
//Project 5 Complex Class

public class Complex implements Cloneable
{
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex(Complex aComplex)
    {   
        this.real = aComplex.real;
        this.imaginary = aComplex.imaginary;
    }

    public Complex()
    {
        real = 0.0;
        imaginary = 0.0;
    }

    public double getRealPart()
    {
        return real;
    }

    public double getImaginaryPart()
    {
        return imaginary;
    }

    public Complex add(Complex complex)
    {
        return new Complex(this.real + complex.real, this.imaginary + complex.imaginary);
    }

    public Complex subtract(Complex complex)
    {
        return new Complex(this.real - complex.real, this.imaginary - complex.imaginary);
    }

    public Complex multiple(Complex c1)
    {
        double real = c1.real * this.real - c1.imaginary * imaginary;
        double imaginary = c1.real * this.imaginary + c1.imaginary * this.real;
        return new Complex(real, imaginary);
    }

    public Complex reciprocal()
    {
        double scale = real * real + imaginary * imaginary;
        return new Complex(real / scale, -imaginary / scale);
    }

    public double abs()
    {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    @Override
    public String toString()
    {
        if (imaginary < 0)
            return "" + String.format("%.2f", real) + " -" + String.format("%.2f", Math.abs(imaginary)) + "i";
        else
            return "" + String.format("%.2f", real) + " +" + String.format("%.2f", Math.abs(imaginary)) + "i";
    }
}