package BasicCalculator;

public class Calculator {

    public Calculator(){};

    public int suma(int a, int b){
        return a+b;
    }
    public int resta(int a, int b){
        return -1;
    }
    public int multi(int a, int b) throws InterruptedException {
        Thread.sleep(6000);
        return a*b;
    }
    public int division(int a, int b){
        if (b == 0)
            throw new ArithmeticException("el valor no puede ser cero");

        return a/b;
    }

}
