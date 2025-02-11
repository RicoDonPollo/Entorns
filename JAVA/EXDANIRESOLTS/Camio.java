package RA4.AC404.EX5;

public class Camio extends Vehicle{
    
    private int eixos;
    private String remolc;

    public Camio(String matricula, String marca, String model, String combustible, int cilindrada, int eixos, String remolc){
        super(matricula, marca, model, combustible, cilindrada);
        this.eixos=eixos;
        this.remolc=remolc;
    }

    public String toString(){
        return super.toString()+"\n Eixos: "+this.eixos+"\n Tipus remolc :"+ this.remolc;
    }

    

}
