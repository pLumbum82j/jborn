package s5;

public class ComplexNumber {

    private final double re;
    private final double im;
    private int hash;


    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
        this.hash = (int) im;
        hash = 31 * hash + (int) re;

    }


    public double getRe() {
        return re;
    }


    public double getIm() {
        return im;
    }


    @Override

    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (!(o instanceof ComplexNumber)) return false;
        ComplexNumber complexNumber = (ComplexNumber) o;
        if (hash != complexNumber.hashCode()) return false;
        return complexNumber.im == getIm() && complexNumber.re == getRe();
    }


    @Override
    public int hashCode() {
        return hash;
    }
}