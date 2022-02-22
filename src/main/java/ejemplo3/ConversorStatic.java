package ejemplo3;

public class ConversorStatic {


    public String convertir(double n ,String o, String d){
        if(n < 0){
            return "cantidad negativa";
        }else{
            n = n*convStatic.cambio(o,d);
            return "La cantidad correcta es "+n+" "+d ;
        }

    }

}
