package hospital;

import java.time.LocalDate;

public class metge extends persona{

    private String especialitat;
    private String experiencia;
    private String pacientAsignat;

    public metge(String nom, LocalDate data_naix, String dni, String especialitat, String infermersAplicats, String tasquesFetes){
    super(nom, data_naix, dni);
    this.especialitat=especialitat;
    this.experiencia=experiencia;
    this.pacientAsignat=pacientAsignat;

    }

    //====TOSTRING====//

    public String toString (){
        return super.toString() + especialitat + "\n" + experiencia + "\n" + pacientAsignat;
    }
}
