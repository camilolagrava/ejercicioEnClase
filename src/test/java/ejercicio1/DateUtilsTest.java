package ejercicio1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class DateUtilsTest {

    @ParameterizedTest
    @CsvSource({
            "0,Enero,2022,dia invalido","1,Enero,2022,2-Enero-2022","2,Enero,2022,3-Enero-2022",
            "30,Enero,2022,31-Enero-2022","31,Enero,2022,1-Febrero-2022","32,Enero,2022,dia invalido",
            "0,Diciembre,2022,dia invalido","1,Diciembre,2022,2-Diciembre-2022","2,Diciembre,2022,3-Diciembre-2022",
            "30,Diciembre,2022,31-Diciembre-2022","31,Diciembre,2022,1-Enero-2023","32,Diciembre,2022,dia invalido",
            "0,Febrero,2022,dia invalido","1,Febrero,2022,2-Febrero-2022","2,Febrero,2022,3-Febrero-2022",
            "27,Febrero,2022,28-Febrero-2022","28,Febrero,2022,1-Marzo-2022","29,Febrero,2022,dia invalido",
            "28,Febrero,2020,29-Febrero-2020","29,Febrero,2020,1-Marzo-2020","30,Febrero,2022,dia invalido",
            "50,KK,2020,ingresar nuevos datos","20,Septiembre,-2,anno invalido","20,fufu,2020,mes invalido",
            "20,KK,-2,ingresar nuevos datos", "50,Mayo,-20,ingresar nuevos datos"
    })
    public void nextDay(int a, String b,int c, String expectedResult){
        DateUtils date = new DateUtils();
        String actualResult = date.nextDate(a,b,c);
        Assertions.assertEquals(expectedResult,actualResult,"Error, resultado invalido");
    }

}
