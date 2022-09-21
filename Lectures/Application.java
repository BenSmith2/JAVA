public class Application {
    public static void main(String args[]){
        int numerator = 3;
        int denominator =4;
        
        Fraction fraction1 = new Fraction(numerator, denominator);
        Fraction fraction2 = new Fraction(num: 1, denominator: 2);
        
        Fraction result = fraction1.add(fraction2);

    }
}
