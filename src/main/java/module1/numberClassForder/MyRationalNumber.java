package module1.numberClassForder;

public class MyRationalNumber extends MyNumber {

    int numerator;
    int denominator;

    public MyRationalNumber(int numerator, int denominator) {
        if(denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
        int gcd = getGCD(Math.abs(numerator), Math.abs(denominator));
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    public MyRationalNumber() {
        this.numerator = 0;
        this.denominator = 1;
    }

    private int getGCD(int a, int b) {
        if(b == 0) return a;

        return getGCD(b, a%b);
    }

    MyNumber plus(MyNumber myNumber) {
        MyRationalNumber result = new MyRationalNumber(this.numerator * ((MyRationalNumber)myNumber).getDenominator()
        + this.denominator * ((MyRationalNumber)myNumber).getNumerator(),
                this.denominator * ((MyRationalNumber)myNumber).getDenominator());

        return result;
    }

    MyNumber minus(MyNumber myNumber) {
        MyRationalNumber result = new MyRationalNumber(this.numerator * ((MyRationalNumber)myNumber).getDenominator() -
                this.denominator * ((MyRationalNumber)myNumber).getNumerator(),
                this.denominator * ((MyRationalNumber)myNumber).getDenominator());

        return result;
    }

    MyNumber multiple(MyNumber myNumber) {
        MyRationalNumber result = new MyRationalNumber(this.numerator * ((MyRationalNumber)myNumber).getDenominator() *
                this.denominator * ((MyRationalNumber)myNumber).getNumerator(), this.denominator * ((MyRationalNumber)myNumber).getDenominator());
        return result;
    }

    MyNumber divide(MyNumber myNumber) {
        MyRationalNumber result = new MyRationalNumber(this.numerator * ((MyRationalNumber)myNumber).getDenominator() /
                this.denominator * ((MyRationalNumber)myNumber).getNumerator(), this.denominator * ((MyRationalNumber)myNumber).getDenominator());
        return result;
    }

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

}
