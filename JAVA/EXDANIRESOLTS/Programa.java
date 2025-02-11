package RA4.AC404.EX5;

public class Programa {
    
    public static void main(String[] args){

        Cotxe ve1= new Cotxe("4830 BYN", "Citröen", "Xsara Coupé", "Diesel", 1900,3,false);
        Camio ve2= new Camio("9815 HNP", "Iveco", "StarPlus", "Diesel", 4800,3, "Cuba liquids");
        Motocicleta ve3= new Motocicleta("4479 LLP", "Honda", "CBR-600", "Gasolina", 600, 4, true);
        Camio ve4= new Camio("5555 HHP", "MANN", "Supertrailer", "Diesel", 5800, 3, "Cuba purins");

        Parking pa1=new Parking(5);

        System.out.println(ve1.toString());
        System.out.println(ve2.toString());       
        System.out.println(ve3.toString());
        System.out.println(ve4.toString()); 

        pa1.entraVehicle(ve1);
        pa1.entraVehicle(ve3);
        pa1.entraVehicle(ve2);
        System.out.println(pa1.toString());
        pa1.surtVehicle(ve1);
        System.out.println(pa1.toString());
        pa1.entraVehicle(ve4);
        pa1.surtVehicle(ve2);
        System.out.println(pa1.toString());

    
    }
}
