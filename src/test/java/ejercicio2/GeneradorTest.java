package ejercicio2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;

public class GeneradorTest {

    EsPrimo esPrimoMock = Mockito.mock(EsPrimo.class);
    public GeneradorTest(){}

    @ParameterizedTest
    @CsvSource({
            "7,true,1 3 5 7",
            "0,false,0",
            "1,true,1",
            "2,true,1",
            "3,true,1 3",
            "5,true,1 3 5",
            "-10,false,exception",
            "11,true,1 3 5 7 9 11",
            "20,false,0 2 4 6 8 10 12 14 16 18 20",
            "4,false,0 2 4",
            "9,false,0 2 4 6 8",
            "27,false,0 2 4 6 8 10 12 14 16 18 20 22 24 26"
    })
    public void generadorTest(int n, boolean b, String expectedResult){
        Mockito.when(esPrimoMock.primo(n)).thenReturn(b);

        Generador generador = new Generador(esPrimoMock);
        if(n < 0){
            Assertions.assertThrows(Exception.class, ()-> {generador.getNumberValues(n);} );
        }else{
            String actualResult = generador.getNumberValues(n);

            Assertions.assertEquals(expectedResult,actualResult,"Error, un errooooor!");
            Mockito.verify(esPrimoMock).primo(n);
        }

    }




}
