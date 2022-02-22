package ejemplo3;


import ejemploMockStatic.MultiplicarServicioStatic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class ConversorTest {

    Conv convMock = Mockito.mock(Conv.class);

    @ParameterizedTest
    @CsvSource({
            "100.0,Dollar,Boliviano,6.98,La cantidad correcta es 698.0 Boliviano",
            "-20,Dollar,Boliviano,6.98,cantidad negativa",
            "50.0,Euro,Boliviano,7.82,La cantidad correcta es 391.0 Boliviano",
            "10.0,Boliviano,Yen,16.73,La cantidad correcta es 167.3 Yen"
    })
    public void convertirTest(double n, String o, String d, double c,String expectedResult){
        Mockito.when(convMock.cambio(o,d)).thenReturn(c);
        Conversor conversor = new Conversor(convMock);
        String actualResult = conversor.convertir(n,o,d);

        Assertions.assertEquals(expectedResult,actualResult,"Error");


    }
}
