package joc_medieval;

public class Arma extends Objecte{

    protected String tipusArma;
    // protected String nom;
    protected int pes;
    protected int mal;
    protected int rareza;

    public Arma (String nom, String tipusArma, int pes, int mal, int rareza) {
        // this.nom=nom;
        super(nom, pes);
        this.tipusArma=tipusArma;
        this.pes=pes;
        this.mal=mal;
        this.rareza=rareza;

    }

    public int getPes() {
        return this.pes;
    }
    

}
