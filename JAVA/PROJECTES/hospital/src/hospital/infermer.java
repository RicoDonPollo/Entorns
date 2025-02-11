package hospital;

import java.time.LocalDate;

public class infermer extends persona{
    
    private String especialitat;
    private String metgesSuport;
    private String experiencia;

    public infermer(String nom, LocalDate data_naix, String dni, String especialitat, String metgesSuport, String experiencia){
    super(nom, data_naix, dni);
    this.especialitat=especialitat;
    this.metgesSuport=metgesSuport;
    this.experiencia=experiencia;

    }

    //====TOSTRING====//

    public String toString (){
        return super.toString() + especialitat + "\n" + metgesSuport + "\n" + experiencia;
    }


}
