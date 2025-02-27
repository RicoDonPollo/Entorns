package ArrayList;

public class Vehicle {
    
    private String matricula;
    private String marca;
    private String model;
    private String combustible;
    private int cilindrada;
    private double ocupa;
    
    public Vehicle(String matricula, String marca, String model, String combustible, int cilindrada, double ocupa){
        this.marca=marca;
        this.model=model;
        this.matricula=matricula;
        this.combustible=combustible;
        this.cilindrada=cilindrada;
        this.ocupa=ocupa;
    }

    public void setOcupa(double ocupa){
        this.ocupa=ocupa;
    }

    public double getOcupa(){
        return this.ocupa;
    }

    public void setMarca(String marca){
        this.marca=marca;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setModel(String model){
        this.model=model;
    }

    public String getModel(){
        return this.model;
    }

    public void setMatricula(String matricula){
        this.matricula=matricula;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public void setCombustible(String combustible){
        this.combustible=combustible;
    }

    public String getCombustible(){
        return combustible;
    }

    public void setCilindrada(int cilindrada){
        this.cilindrada=cilindrada;
    }

    public int getCilindrada(){
        return this.cilindrada;
    }

    public String toString(){
        return "Marca: "+this.marca+"\n Model: "+ this.model+"\nEspai ocupat: " + this.ocupa + "\n Matricula: "+this.matricula+"\n Tupis combustible: "+this.combustible+"\n Ciclindrada: "+this.cilindrada;
    }
}
