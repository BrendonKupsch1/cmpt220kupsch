//Brendon Kupsch
//CMPT_220L_202
//Prof. Arias
//Project 5 Complex Class

public class Complex implements Cloneable, Comparable<Complex>
{
    // private instance of real and imaginary 
    private double a;
    private double b;

    // method to set all the corresponding instance variables
    public Complex(double a, double b)
    {
        this.a = a;
        this.b = b;
    }

    // method to set all instance variables to 0
    public Complex()
    {
        a = 0.0;
        b = 0.0;
    }

    // method to set all instance variables to the passed object
    public Complex(Complex aComplex)
    {   
        this.a = aComplex.a;
        this.b = aComplex.b;
    }

    // methods to get and set instance variables individually 
    public double getRealPart()
    {
        return a;
    }
    public double getImaginaryPart()
    {
        return b;
    }

    // addition method 
    public Complex add(Complex complex)
    {
        return new Complex(this.a + complex.a, this.b + complex.b);
    }

    // subtraction method 
    public Complex subtract(Complex complex)
    {
        return new Complex(this.a - complex.a, this.b - complex.b);
    }

    // multiplication method
    public Complex multiply(Complex c1)
    {
        double a = c1.a * this.a - c1.b * b;
        double b = c1.a * this.b + c1.b * this.a;
        return new Complex(a, b);
    }

    // division method 
    public Complex divide(Complex c1)
    {
        Complex a = this;
        return a.multiply(c1.reciprocal());
    }

    // reciprocal method for division
    public Complex reciprocal()
    {
        double scale = a * a + b * b;
        return new Complex(a / scale, -b / scale);
    }

    // absolute value method 
    public double abs()
    {
        return Math.sqrt(a * a + b * b);
    }

    // method to return string representing complex number 
    @Override
    public String toString()
    {
        if (b < 0)
            return "" + String.format("%.2f", a) + " -" + String.format("%.2f", Math.abs(b)) + "i";
        else
            return "" + String.format("%.2f", a) + " +" + String.format("%.2f", Math.abs(b)) + "i";
    }

    // cloneable interface method
    @Override
    public Complex clone()
    {
        return new Complex(this);
    }

    // comparable interface method 
    @Override
    public int compareTo(Complex o)
    {
        double v1;
        double v2;

        v1 = Math.pow(this.a, 2) + Math.pow(this.b, 2);
        v2 = Math.pow(o.a, 2) + Math.pow(o.b, 2);
        if(v1 > v2)
            return 1;
        if (v2 > v1)
            return -1;
        return 0;
    }
}