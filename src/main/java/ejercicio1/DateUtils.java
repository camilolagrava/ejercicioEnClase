package ejercicio1;

public class DateUtils {

    public DateUtils(){}

    public String nextDate(int d,String m,int a){
       String list[] = {
               "Enero","31",
               "Febrero","28",
               "Febrero","29",
               "Marzo","31",
               "Abril","30",
               "Mayo","31",
               "Junio","30",
               "Julio","31",
               "Agosto","31",
               "Septiembre","30",
               "Octubre","31",
               "Noviembre","30",
               "Diciembre","31"
       };

       boolean[] mlist = {false, true, false, true};

        String message = "n";
        if(d <= 0 || d > 31 || (a % 4 == 0 && d > 29 && m.equals("Febrero")) || (a % 4 != 0 && d > 28&& m.equals("Febrero"))){
            mlist[0]=true;
        }
        if(a <= 0 ) {
            mlist[2]=true;
        }
            for (int i = 0; i < 25 && mlist[3]; i=i+2) {

                if(list[i].equals(m)){
                    mlist[1]=false;
                    if( !(mlist[0] || mlist[2])){

                        if(a % 4 == 0 && i == 2){
                            i = 4;
                        }

                        if (d > Integer.parseInt(list[i+1])) {
                            mlist[0]=true;

                        }else if(d < Integer.parseInt(list[i+1])){
                            d++;
                        }else{
                            if(i == 24 && d == 31){
                                m = list[0];
                                d = 1;
                                a++;
                            }else if(i == 2 && d == 28){
                                m = list[i+4];
                                d = 1;
                            }else{
                                m = list[i+2];
                                d = 1;
                            }

                        }
                        mlist[3]=false;
                    }

                message = ""+d+"-"+m+"-"+a;
                }
            }


        if ((mlist[0] || mlist[1] || mlist[2])){
            if( (mlist[0] && mlist[1]) || (mlist[0] && mlist[2]) || (mlist[1] && mlist[2]) ){
                return "ingresar nuevos datos";
            }else if(mlist[0]){
                message = "dia invalido";
            }else if(mlist[1]){
                message = "mes invalido";
            }else if(mlist[2]){
                message = "anno invalido";
            }
        }
        return message;
    }

}
