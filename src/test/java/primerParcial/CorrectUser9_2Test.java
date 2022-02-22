package primerParcial;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CorrectUser9_2Test {

    UserVerify verMock = Mockito.mock(UserVerify.class);
    UserPermisos perMock = Mockito.mock(UserPermisos.class);



    @ParameterizedTest
    @CsvSource({
            "u,pass,false,Incorrect USER and PWD,Incorrect USER and PWD",
            "u1,pass1,true,CRUD,CRUD",
            "u1,pass1,true,CD,CD",
            "u1,pass1,true,R,R",
    })
    public void verifyTest(String u , String pss, boolean b, String m ,String expectedResult){
        Mockito.when(verMock.verify(u,pss)).thenReturn(b);
        Mockito.when(perMock.permisos(u,pss)).thenReturn(m);
        if(b){
            DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yy/MM/dd HH:mm:ss");
            expectedResult = expectedResult+" "+dtf2.format(LocalDateTime.now());
        }

        CorrectUser9_2 correct = new CorrectUser9_2(verMock,perMock);
        String actualResult = correct.verify(u,pss);
        Assertions.assertEquals(expectedResult,actualResult,"Error, un errooooor!");

    }

}
