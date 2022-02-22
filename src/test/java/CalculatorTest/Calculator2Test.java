package CalculatorTest;

import BasicCalculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/*parametrizacion*/
public class Calculator2Test {


    @ParameterizedTest
    @CsvSource({ "2,2,4",
            "3,3,6",
            "2,3,5",
            "-2,-2,-4",
            "-1,5,4"
    })
    public void sumarTest(int a,int b, int expectedResult){
        Calculator calculadora = new Calculator();
        int actualResult=calculadora.suma(a,b);
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
    @ParameterizedTest
    public void dividirTest(){
        Calculator calculadora = new Calculator();
        Assertions.assertThrows(ArithmeticException.class, () -> {calculadora.division(8,0);});
    }


}
