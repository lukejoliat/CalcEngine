package com.pluralsight.calcengine;

public class Subtractor extends CalculateBase {
    Subtractor() {}
    Subtractor(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        double value = getLeftVal() - getRightVal();
        setResult(value);
    }
}
