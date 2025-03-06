import java.util.ArrayList;
import java.util.LinkedList;

public class Deixalleria {

    private LinkedList<Ipad> deixalleria;
    private int comp;
 

    public Deixalleria(){
        this.deixalleria=new LinkedList<Ipad>();
        this.comp=0;
    }

    public boolean entraIpadDefectuos(Ipad ip){
            if(ip.isDefectuos()==true){
                if(deixalleria.add(ip)){
                    System.out.println("El iPad s'ha afegit a la deixalleria");

                comp++;
                return true;
                } else {
                    System.out.println("El iPad NO s'ha afegit a la deixalleria");
                }
            }
            return false;
    }

    public String llistaVehicles(){

        String llista=new String();
        for(Ipad temp : deixalleria){
            llista = llista + temp + "\n";
        }
        return llista;
    }

    // public Ipad agafa(int i){
    //     return Ipad;
    // }

    // public int tamany(){
    //     return 5;
    // }

    // public int busca(Ipad ip){
    //     return 5;
    // }

    // public boolean inserta(int i, Ipad ip){
    //     return false;
    // }

    // public void elimina(int i){
        
    // }
}
