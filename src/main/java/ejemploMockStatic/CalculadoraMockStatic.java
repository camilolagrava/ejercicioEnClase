package ejemploMockStatic;

public class CalculadoraMockStatic {

    public int getFactorial(int number){
        int fact=1;
        for (int i = 1; i <=number ; i++) {
            fact=MultiplicarServicioStatic.mult(fact,i);
        }
        return fact;
    }

}

