package primerParcial;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CorrectUser9_3 {

    public String verify(String u, String pss){

        String m = "";

        if(UserVerifyStatic.verify(u,pss)){
            m = UserPermisosStatic.permisos(u,pss);
            DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yy/MM/dd HH:mm:ss");
            m = m+" "+dtf2.format(LocalDateTime.now());
        }else{
            m = "Incorrect USER and PWD";
        }

        return m;
    }

}
