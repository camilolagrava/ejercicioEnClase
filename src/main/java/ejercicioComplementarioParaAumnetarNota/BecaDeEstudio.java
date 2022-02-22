package ejercicioComplementarioParaAumnetarNota;

public class BecaDeEstudio {

    Utils utils ;
    public BecaDeEstudio(){
        utils = new Utils();
    }
    

    public String recomendacoinBeca(int ci){
        String m = "";
        if(Helpers.applicaBeca(ci)){
            if(utils.getNota(ci)>=90){
                m = "SI APLICA BECA";
            }else{
                m = "NO APLICA A BECA POR PROMEDIO ACADEMICO";
            }
        }else{
            m = "EL ESTUDIANTE NO CURSO AUN EL 60% DE LAS MATERIAS";
        }
        return m;
    }

}
