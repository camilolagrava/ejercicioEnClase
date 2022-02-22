package primerParcial;

public class Descuentos9_1 {

    public double draDesescuento(double s){
        if(s<=0){
            throw new ArithmeticException("valor negativo");
        }else if(s >= 4000){
            s = s - (s*0.15);
        }else if(s > 2000)
            s = s- (s*0.05);
        return s;
    }

}
