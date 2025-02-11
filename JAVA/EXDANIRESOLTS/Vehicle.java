package RA4.AC404.EX5;

public class Vehicle {
    
    private String matricula;
    private String marca;
    private String model;
    private String combustible;
    private int cilindrada;
    
    public Vehicle(String matricula, String marca, String model, String combustible, int cilindrada){
        this.marca=marca;
        this.model=model;
        this.matricula=matricula;
        this.combustible=combustible;
        this.cilindrada=cilindrada;
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
        return "Marca: "+this.marca+"\n Model: "+ this.model+"\n Matricula: "+this.matricula+"\n Tupis combustible: "+this.combustible+"\n Ciclindrada: "+this.cilindrada;
    }
}
