package ejemplo3;

public class Conversor {

    Conv conv;
    public Conversor(){
        conv = new Conv();
    }
    public Conversor(Conv conv){
        this.conv = conv;
    }

    public String convertir(double n ,String o, String d){
        if(n < 0){
            return "cantidad negativa";
        }else{
            n = n*conv.cambio(o,d);
            return "La cantidad correcta es "+n+" "+d ;
        }

    }

}
