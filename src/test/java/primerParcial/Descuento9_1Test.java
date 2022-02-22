package primerParcial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Descuento9_1Test {

    Descuentos9_1 des = new Descuentos9_1();

    @ParameterizedTest
    @CsvSource({
            "-100.0,-100.0",
            "0.0,0.0",
            "100.0,100.0",
            "2000.0,2000.0",
            "1900.0,1900.0",
            "2100.0,1995.0",
            "2900.0,2755.0",
            "3000.0,2850.0",
            "3100.0,2945.0",
            "3900.0,3705.0",
            "4000.0,3400.0",
            "4100.0,3485.0"
    })
    public void darDescuentoTest(double n, double expectedResult){

        if(n <= 0){
            Assertions.assertThrows(Exception.class, ()-> {des.draDesescuento(n)  ;} );
        }else {
            double actualResult=des.draDesescuento(n);
            Assertions.assertEquals(expectedResult,actualResult,"Error, un errooooor!");
        }
    }

}
