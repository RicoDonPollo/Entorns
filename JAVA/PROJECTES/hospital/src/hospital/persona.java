package hospital;

import java.time.LocalDate;
import java.time.Period;

public class persona {

    private String nom;
    private LocalDate data_naix;
    private String dni;

    public persona(String nom, LocalDate data_naix, String dni){

        this.nom=nom;
        this.data_naix=data_naix;
        this.dni=dni;

    }

    //====TOSTRING====//

    public String toString (){
        return nom + "\n" + data_naix + "\n" + dni;
    }

    //=====GETTERS=====//

    // public String getNom(){
    //    return this.nom; 
    // }

}
