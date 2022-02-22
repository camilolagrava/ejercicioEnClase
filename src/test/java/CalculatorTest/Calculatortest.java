package CalculatorTest;

import BasicCalculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class Calculatortest {

    @Test
    public void sumarTest(){
        Calculator calculadora = new Calculator();
        int expectedResult=4;
        int actualResult=calculadora.suma(2,2);
        // tiene que existir una verificacion
        Assertions.assertEquals(expectedResult,actualResult,"ERROR! la suma es incorrecta");
    }

    @Test
    @Disabled
    public void restaTest(){
        Calculator calculadora = new Calculator();
        int expectedResult=0;
        int actualResult=calculadora.resta(2,2);
        // tiene que existir una verificacion
        Assertions.assertEquals(expectedResult,actualResult,"ERROR! la resta es incorrecta");
    }


    @Test
    @Timeout(value = 7)
    public void multiTest() throws InterruptedException {
        Calculator calculadora = new Calculator();
        int expectedResult=6;
        int actualResult=calculadora.multi(3,2);
        // tiene que existir una verificacion
        Assertions.assertEquals(expectedResult,actualResult,"ERROR! la multiplicacion es incorrecta");
    }

    @Test
    public void dividirTest(){
        Calculator calculadora = new Calculator();
        Assertions.assertThrows(ArithmeticException.class, () -> {calculadora.division(8,0);});
    }

}
