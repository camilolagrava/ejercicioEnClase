package ejercicioComplementarioParaAumnetarNota;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.MockedStatic;
import org.mockito.Mockito;



public class BecaDeEstudioTest {

    Utils uMock = Mockito.mock(Utils.class);
    MockedStatic<Helpers> hMock = Mockito.mockStatic(Helpers.class);

    @ParameterizedTest
    @CsvSource({
        "123456"
    })
    public void verifyTest(int ci, boolean b, double d ,String expectedResult){
        Mockito.when(uMock.getNota(ci)).thenReturn(d);
        hMock.when(() -> Helpers.applicaBeca(ci)).thenReturn(b);

        BecaDeEstudio correct = new BecaDeEstudio(uMock);
        String actualResult = correct.recomendacionBeca(ci);
        Assertions.assertEquals(expectedResult,actualResult,"Error, un errooooor!");

        hMock.close();
    }

}
