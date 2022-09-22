package module1.numberClassForder;

public class MyInteger extends MyRationalNumber{

    int num1;
    int num2;

    int result;

    public MyInteger(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public MyInteger() {
        this.num1 = 1;
        this.num2 = 1;
    }

    @Override
    MyNumber plus (MyNumber myNumber) {

    }
}
