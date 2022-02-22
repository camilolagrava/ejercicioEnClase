import org.junit.jupiter.api.*;

public class Basic {

    @BeforeAll
    public static void beforeClass(){
        System.out.println("***********************************************");
        System.out.println("Esto se ejecuta sola una ves antes de todo");
    }

    @BeforeEach
    public void setup(){
        System.out.println("----------------------------------------------");
        System.out.println("Esto se ejecuta ANTES de CADA test");
    }

    @AfterEach
    public void cleanup(){
        System.out.println("Esto se ejecuta DESPUES de CADA test");
        System.out.println("----------------------------------------------");
    }

    @Test
    public void verifyThings(){
        System.out.println("Test uuuuuuuuuuuu");
    }

    @Test
    public void verifyThings2(){
        System.out.println("Test uuuuuuuuuuuu 2");
    }

    @AfterAll
    public static void afterClass(){
        System.out.println("Esto se ejecuta sola una ves, depsues de todo");
        System.out.println("***********************************************");
    }
}
