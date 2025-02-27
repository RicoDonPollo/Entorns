package LinkedList;

import java.util.LinkedList;

public class Parking{
    
    private LinkedList<Vehicle> vehicles; 
    private int espai;
    private double ocupat;
    // private int vehiclestotals;


    
    public Parking(int espai){
        this.vehicles=new LinkedList<Vehicle>();
        this.espai=espai;
        this.ocupat=0;
        
    }

    public boolean entraVehicle(Vehicle ve){
        if(ve.getOcupa()<=(espai-ocupat)){
            if(vehicles.add(ve)){
                System.out.println("El vehicle " + ve.getMatricula() + " ha entrat.");
            } else {
                System.out.println("El vehicle " + ve.getMatricula() + "NO ha entrat.");

            }
            ocupat=ocupat+ve.getOcupa();
            return true;
        }
        else{
            return false;
        }
    }

    public void surtVehicle(Vehicle ve){
    
        if(vehicles.remove(ve)){
            ocupat=ocupat-ve.getOcupa();
        }

    }

    public String llistaVehicles(){

        String llista=new String();
        for(Vehicle temp : vehicles){
            llista=llista+temp.getMatricula() + "\n";
        }
        return llista;
    }

    public String toString(){

        return "Parking amb capacitat per a: " + espai + " vehicles \nEspais ocupats: " + ocupat + "\nVehicles : " + vehicles.size() + "\nMatricules\n"+llistaVehicles();
    }


}
