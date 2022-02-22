package primerParcial;

import ejemplo3.convStatic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CorrectUser9_3Test {

    MockedStatic<UserPermisosStatic> perMock = Mockito.mockStatic(UserPermisosStatic.class);
    MockedStatic<UserVerifyStatic> verMock = Mockito.mockStatic(UserVerifyStatic.class);


    @ParameterizedTest
    @CsvSource({
            "u,pass,false,Incorrect USER and PWD,Incorrect USER and PWD",
            "u1,pass1,true,CRUD,CRUD",
            "u1,pass1,true,CD,CD",
            "u1,pass1,true,R,R",
    })
    public void verifyTest(String u , String pss, boolean b, String m ,String expectedResult){
        perMock.when(() -> UserPermisosStatic.permisos(u, pss)).thenReturn(m);
        verMock.when(() -> UserVerifyStatic.verify(u, pss)).thenReturn(b);
        if(b){
            DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yy/MM/dd HH:mm:ss");
            expectedResult = expectedResult+" "+dtf2.format(LocalDateTime.now());
        }


        CorrectUser9_3 correct = new CorrectUser9_3();
        String actualResult = correct.verify(u,pss);
        Assertions.assertEquals(expectedResult,actualResult,"Error, un errooooor!");

        perMock.close();
        verMock.close();
    }
}
