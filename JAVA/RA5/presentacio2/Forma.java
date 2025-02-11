package presentacio2;
import java.io.Serializable;

public class Forma implements Serializable{
    
    private String nom;
    private String intern;
    private String vora;

    public Forma (String nom, String colori, String colorv){
        this.nom=nom;
        this.intern=colori;
        this.vora=colorv;
    }

    public String toString() {
        return "Nom: " + nom + " intern: " + intern + " vora: " + vora;
    }

}
