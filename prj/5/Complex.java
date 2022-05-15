//Brendon Kupsch
//CMPT_220L_202
//Prof. Arias
//Project 5 Complex Class

public class Complex extends Number implements Cloneable, Comparable<Complex>
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

    public Complex conjugate()
    {
        return new Complex(this.a, this.b * -1);
    }

    public static Complex area(Complex z1, Complex z2, Complex z3)
    {
        Complex z1c = z1.conjugate();
        Complex z2c = z2.conjugate();
        Complex z3c = z3.conjugate();
        Complex i = new Complex(4, 0);
        return (z1.multiply(z2c)).subtract((z1.multiply(z3c))).subtract((z1c.multiply(z2))).add((z1c.multiply(z3))).add((z2.multiply(z3c))).subtract((z2c.multiply(z3))).divide(new Complex(4,0)).multiply(new Complex(0,1));
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

    @Override
    public int intValue() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public long longValue() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public float floatValue() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double doubleValue() {
        // TODO Auto-generated method stub
        return 0;
    }
}