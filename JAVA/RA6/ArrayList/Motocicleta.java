package ArrayList;

public class Motocicleta extends Vehicle{

        private int tmotor;
        private boolean cavallet;

    public Motocicleta(String matricula, String marca, String model, String combustible, int cilindrada, int tmotor, boolean cavallet){
        super(matricula, marca, model, combustible, cilindrada, 0.5);
        this.tmotor=tmotor;
        this.cavallet=cavallet;
    }

    public String toString(){
        return super.toString()+"\n Temps de motor: "+this.tmotor+"\n Té cavallet? "+ this.cavallet;
    }

}
