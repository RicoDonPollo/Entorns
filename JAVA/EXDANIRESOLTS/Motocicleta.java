package RA4.AC404.EX5;

public class Motocicleta extends Vehicle{

        private int tmotor;
        private boolean cavallet;

    public Motocicleta(String matricula, String marca, String model, String combustible, int cilindrada, int tmotor, boolean cavallet){
        super(matricula, marca, model, combustible, cilindrada);
        this.tmotor=tmotor;
        this.cavallet=cavallet;
    }

    public String toString(){
        return super.toString()+"\n Temps de motor: "+this.tmotor+"\n Té cavallet? "+ this.cavallet;
    }

}
