package com.pluralsight.myApp;
import com.pluralsight.calcengine.CalculateHelper;
import com.pluralsight.calcengine.InvalidStatementException;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        useCalculateHelper();
    }

    static void useCalculateHelper() {

        String[] statements = {
            "add 1.0", // Error: incorrect number of numerical values
            "add xx 25.0", // Error: non-numeric data
            "addX 100.0 50.0", // Error: invalid command
            "divide 100.0 50.0",
            "add 25.0 92.0",
            "subtract 225.0 17.0",
            "multiply 11.0 3.0"
        };

        CalculateHelper helper = new CalculateHelper();
        for(String statement: statements) {
            try {
                helper.process(statement);
                System.out.println(helper);
            } catch (InvalidStatementException e) {
                System.out.println(e.getMessage());
                if (e.getCause() != null)
                    System.out.println(" Original Exception " + e.getCause().getMessage());
            }
        }

    }
}