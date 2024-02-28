package secondYear.prelims;

public class Fraction {
    private int numerator;
    private int denominator;

    // Default Constructor for the Fraction class
    public Fraction(){
        numerator = 0;
        denominator = 1;
    }

    // Constructor that allows class to store a whole number
    public Fraction(int wholeNumber){
        numerator = wholeNumber;
        denominator = 1;
    }

    // Normal constructor for fraction class that allows for fraction data
    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // Edits the value of the numerator in the object
    public void setNumerator(int numerator){
        this.numerator = numerator;
    }

    // Returns the numerator of the object
    public int getNumerator(){
        return numerator;
    }

    // Edits the value of the denominator in the object
    public void setDenominator(int denominator){
        this.denominator = denominator;
    }

    // Returns the value of the denominator in the object
    public int getDenominator(){
        return denominator;
    }

    // An overload of the method toString of Object class to correctly display the data
    public String toString(){
        return numerator + "/" + denominator;
    }

    // Returns a double value of the fraction
    public double toDouble(){
        return (double) numerator / denominator;
    }

    // Recursive method for calculating the GCD using Euclid's Algorithm
    private int computeGCD(int num1, int num2){
        if (num1 % num2 == 0){
            return num2;
        }else{
            return computeGCD(num2, num1 % num2);
        }
    }


    // Method for adding two fractions
    public Fraction add(Fraction f2){
        int num1 = this.getNumerator() * f2.getDenominator();
        int d = this.getDenominator() * f2.getDenominator();

        int num2 = f2.getNumerator() * this.getDenominator();

        int n = num1 + num2;

        return new Fraction(n, d);
    }

    // Method for subtracting two fractions
    public Fraction subtract(Fraction f2){
        int num1 = this.getNumerator() * f2.getDenominator();
        int d = this.getDenominator() * f2.getDenominator();

        int num2 = f2.getNumerator() * this.getDenominator();

        int n = num1 - num2;
        return new Fraction(n, d);
    }

    // Using cross multiplication divides the two fraction
    public Fraction divide(Fraction f2){
        int num1 = this.getNumerator();
        int den1 = this.getDenominator();
        int num2 = f2.getNumerator();
        int den2 = f2.getDenominator();

        return new Fraction(num1 * den2, num2 * den1);
    }

    // a Method for multiplying two fractions
    public Fraction multiply(Fraction f2){
        return new Fraction(this.getNumerator() * f2.getNumerator(), this.getDenominator() *
                f2.getDenominator());
    }

    // Using the compute GCD method this method simplifies the fraction
    public Fraction simplify(){
        int num = this.getNumerator();
        int den = this.getDenominator();
        int gcd = computeGCD(num, den);
        num /= gcd;
        den /= gcd;
        return new Fraction(num, den);
    }

    public double toDecimal(){
        return (double) this.getNumerator() / this.getDenominator();
    }



}
