package joc_medieval;

public class ObjectesActivacio extends Objecte{

    protected String nom;
    protected String tipus;
    protected int bonificadorTemporal;
    protected int duraccio;

    public ObjectesActivacio (String nom, String tipus, int bonificadorTemporal, int duraccio, int pes) {
        // this.nom=nom;
        super(nom, pes);
        this.tipus=tipus;
        this.bonificadorTemporal=bonificadorTemporal;
        this.duraccio=duraccio;
    }

}
