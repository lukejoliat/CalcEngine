package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {

        CalculateBase[] calculators = {
                new Divider(100.0d, 50.0d),
                new Adder(25.0d, 92.0d),
                new Subtractor(225.0d, 17.0d),
                new Multiplyer(11.0d, 3.0d)
        };

        for (CalculateBase calculator: calculators) {
            calculator.calculate();
            System.out.print("result = ");
            System.out.println(calculator.getResult());
        }

    }
}
