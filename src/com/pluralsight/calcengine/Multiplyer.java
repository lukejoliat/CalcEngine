package com.pluralsight.calcengine;

public class Multiplyer extends CalculateBase {
    Multiplyer() {}
    Multiplyer(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        double value = getLeftVal() * getRightVal();
        setResult(value);
    }
}
