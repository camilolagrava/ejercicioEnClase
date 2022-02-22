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
            "123456,false,100.0,EL ESTUDIANTE NO CURSO AUN EL 60% DE LAS MATERIAS",
            "123456,false,20.0,EL ESTUDIANTE NO CURSO AUN EL 60% DE LAS MATERIAS",
            "123456,true,85.0,NO APLICA A BECA POR PROMEDIO ACADEMICO",
            "123456,true,90.0,SI APLICA BECA",
            "123456,true,95.0,SI APLICA BECA",
            "123456,true,100.0,SI APLICA BECA",

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
