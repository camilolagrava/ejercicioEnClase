package ejercicio2;

public class Generador {

    public Generador(){

    }

    EsPrimo esPrimo;
    public Generador(EsPrimo es){
        esPrimo = es;
    }

    public String getNumberValues(int n){

        String r = "";
        if(n<0){
            throw new ArithmeticException("valor negativot");
        }else{

            int i=0;
            if(esPrimo.primo(n)){
                i=1;
            }

            while(i <= n){
                r = r+i;
                i=i+2;
                if(i <=  n){
                    r=r+" ";
                }
            }

        }

        return r;
    }

}
