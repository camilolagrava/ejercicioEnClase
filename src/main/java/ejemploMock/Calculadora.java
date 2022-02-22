package ejemploMock;

public class Calculadora {

    MultiplicarServicio multiplicarServicio;
    public Calculadora( MultiplicarServicio multiplicarServicio){
        this.multiplicarServicio= new MultiplicarServicio();
    }

    // Desarrollador A
    public int getFactorial(int number){
        int fact=1;
        for (int i = 1; i <=number ; i++) {
            fact=multiplicarServicio.mult(i,fact);
        }
        return fact;
    }
}
