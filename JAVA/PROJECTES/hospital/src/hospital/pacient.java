package hospital;

import java.time.LocalDate;

public class pacient extends persona{

    private int gravetat;
    private String tractamentsAplicats;
    private int habitacioAsignada;

    public pacient(String nom, LocalDate data_naix, String dni, int gravetat, String tractamentsAplicats, int habitacioAsignada){
    super(nom, data_naix, dni);
    this.gravetat=gravetat;
    this.tractamentsAplicats=tractamentsAplicats;
    this.habitacioAsignada=habitacioAsignada;

    }

    //====TOSTRING====//

    public String toString (){
        return super.toString() + gravetat + "\n" + tractamentsAplicats + "\n" + habitacioAsignada;
    }

}
