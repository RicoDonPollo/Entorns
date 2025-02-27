package LinkedList;
public class Camio extends Vehicle{
    
    private int eixos;
    private String remolc;

    public Camio(String matricula, String marca, String model, String combustible, int cilindrada, int eixos, String remolc){
        super(matricula, marca, model, combustible, cilindrada,3.0);
        this.eixos=eixos;
        this.remolc=remolc;
    }

    public String toString(){
        return super.toString()+"\n Eixos: "+this.eixos+"\n Tipus remolc :"+ this.remolc;
    }

    

}
