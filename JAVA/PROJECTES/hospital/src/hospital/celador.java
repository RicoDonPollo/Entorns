package hospital;

import java.time.LocalDate;

public class celador extends persona{
    private String especialitat;
    private String infermersAsignats;
    private String tasquesFetes;

    public celador(String nom, LocalDate data_naix, String dni, String especialitat, String infermersAplicats, String tasquesFetes){
    super(nom, data_naix, dni);
    this.especialitat=especialitat;
    this.infermersAsignats=infermersAplicats;
    this.tasquesFetes=tasquesFetes;

    }

    //====TOSTRING====//

    public String toString (){
        return super.toString() + especialitat + "\n" + infermersAsignats + "\n" + tasquesFetes;
    }
}
