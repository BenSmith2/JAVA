public class Fraction{
    //attributes go at the top
    //we are creating instance attributes
    private int numerator;
    private int denominator;

    //this is our constructor
    public Fraction(int num, int denominator){
        this.numerator = num; // we have used num as numerator
        this.denominator = denominator; // we are showing off the 'this' synctax
    }

    public int getNumerator(){
        return this.numerator;
    }

    public int getDenominator(){
        return this.denominator;
    }

    public void setNumerator( int num ){
        this.numerator = num;
    }

    public Fraction add(Fraction fraction2){
        int num = this.numerator*fraction2.getDenominator() + this.denominator*fraction2.getNumerator();
        int den = this.denominator * fraction2.getDenominator();
        Fraction result = new Fraction(num, den);
    }

    public String toString(){
        return numerator + "/" + denominator;
    }
}