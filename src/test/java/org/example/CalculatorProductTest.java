package org.example;


import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorProductTest {
    @BeforeEach
    public void setUp(){
        calculatorProduct = new  CalculatorProduct();
    }
    private CalculatorProduct calculatorProduct;
    @org.junit.jupiter.api.Test
    void addTwoNumber() {

        String inputString = "2,3";
        int expectedResult = 5;
        int actualResult = calculatorProduct.addTwoNumber(inputString);
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void addThreeNumbers(){

        String input = "1,2,5";
        int expectedResult = 7;

        int actualResult = calculatorProduct.addTwoNumber(input);

        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void addEmptyNumbers(){
        String inputString = "";
        int expectedResult = 0;

        int actualResult = calculatorProduct.addTwoNumber(inputString);
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @AfterEach
    public void tearDown(){

    }
}