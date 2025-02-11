package RA4.AC404.EX5;

public class Parking {
    
    private String[] vehicles; 
    private int espai;
    private int vehiclestotals;

    public Parking(int espai){
        this.vehicles=new String[espai];
        this.espai=espai;
        this.vehiclestotals=0;
    }

    public boolean entraVehicle(Vehicle ve){
        if(vehiclestotals<(espai-1)){
            vehicles[vehiclestotals]=ve.getMatricula();
            vehiclestotals++;
            return true;
        }
        else{
            return false;
        }
    }

    public void surtVehicle(Vehicle ve){
        
        int lloc=-1;

        for(int i=0; i<espai;i++){
            if(vehicles[i]==ve.getMatricula()){
                lloc=i;
                break;
            }
        }
        if (lloc>-1){
            for(int i=(lloc+1);i<espai;i++){
                vehicles[i-1]=vehicles[i];
            }
            vehicles[espai-1]=null;
            vehiclestotals--;
        }
    }

    public String toString(){

        String llista=new String();
        for(int i=0; i<vehiclestotals;i++){
                llista=llista+vehicles[i]+"\n";
            }
        return "Parking amb capacitat per a: " + espai + " vehicles \nEspais ocupats: " + vehiclestotals + "\nMatricules\n"+llista;
    }


}
