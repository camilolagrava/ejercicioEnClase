package primerParcial;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CorrectUser9_2 {

    UserVerify v;
    UserPermisos p;
    public CorrectUser9_2(){
        v = new UserVerify();
        p = new UserPermisos();
    }

    public CorrectUser9_2(UserVerify verMock, UserPermisos perMock) {
        v = verMock;
        p = perMock;
    }

    public String verify(String u, String pss){

        String m = "";

        if(v.verify(u,pss)){
            m = p.permisos(u,pss);
            DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yy/MM/dd HH:mm:ss");
            m = m+" "+dtf2.format(LocalDateTime.now());
        }else{
            m = "Incorrect USER and PWD";
        }

        return m;
    }

}
