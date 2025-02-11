package RA4.AC404.EX5;

public class Cotxe extends Vehicle {
    
    private int portes;
    private boolean adblue;

    public Cotxe(String matricula, String marca, String model, String combustible, int cilindrada, int portes, boolean adblue){
        super(matricula, marca, model, combustible, cilindrada);
        this.portes=portes;
        this.adblue=adblue;
    }


    public String toString(){
        return super.toString()+"\n Portes: "+this.portes+"\n AdBlue :"+ this.adblue;
    }

}
