package LinkedList;

public class Cotxe extends Vehicle {
    
    private int portes;
    private boolean adblue;

    public Cotxe(String matricula, String marca, String model, String combustible, int cilindrada, int portes, boolean adblue){
        super(matricula, marca, model, combustible, cilindrada, 1.0);
        this.portes=portes;
        this.adblue=adblue;
    }

    public String quinTipus(){
        return "Cotxe";
    }

    public String toString(){
        return super.toString()+"\n Portes: "+this.portes+"\n AdBlue :"+ this.adblue;
    }

}
