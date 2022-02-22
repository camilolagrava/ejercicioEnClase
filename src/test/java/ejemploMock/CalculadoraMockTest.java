package ejemploMock;

import ejemploMock.Calculadora;
import ejemploMock.MultiplicarServicio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CalculadoraMockTest {

    MultiplicarServicio servicioMock = Mockito.mock(MultiplicarServicio.class);

    @Test
    public void verifyFactorial(){
        //PASO 3 crear el metodo y sus comportamiento
        Mockito.when(servicioMock.mult(1,1)).thenReturn(1);
        Mockito.when(servicioMock.mult(1,2)).thenReturn(2);
        Mockito.when(servicioMock.mult(2,3)).thenReturn(6);

        // PASO 4 enviar el objeto mockeado en el constrcutor
        Calculadora calculadoraMock = new Calculadora(servicioMock);
        int expectedResult=0;
        int actualResult=calculadoraMock.getFactorial(3);
        Assertions.assertEquals(expectedResult,actualResult,"Error el factorial el incorrecto");

        // verificacion mocks
        Mockito.verify(servicioMock).mult(1,1);
        Mockito.verify(servicioMock).mult(1,2);
        Mockito.verify(servicioMock).mult(2,3);
        Mockito.verify(servicioMock).mult(6,4);
    }
}
