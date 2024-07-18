package org.example;
import java.lang.Object;
import java.lang.System;
public class CalculatorProduct {
    public int addTwoNumber(String numbers){
        if(numbers.equals("")){
            return 0;
        }
        String [] numberString = numbers.split(",");

        //int firstNumber = Integer.parseInt(numberString[0]);
        //System.out.println(firstNumber);
        //int secondNumber = Integer.parseInt(numberString[1]);
        //System.out.println(secondNumber);
        int sum = 0;
        if(numberString.length == 3){
            sum = Integer.parseInt(numberString[1]) + Integer.parseInt(numberString[2]);
            return sum;
        }
        sum = Integer.parseInt(numberString[0]) + Integer.parseInt(numberString[1]);
        return sum;
    }
}
