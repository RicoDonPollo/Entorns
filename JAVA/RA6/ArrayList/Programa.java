package ArrayList;

import java.util.Scanner;

public class Programa {

    static Vehicle[] vehicles=new Vehicle[50];

    public static void main(String[] args){

        char opcio=' ';
        int trobat=0;
        Scanner teclat=new Scanner(System.in);
        Cotxe ve1= new Cotxe("4830 BYN", "Citröen", "Xsara Coupé", "Diesel", 1900,3,false);
        Camio ve2= new Camio("9815 HNP", "Iveco", "StarPlus", "Diesel", 4800,3, "Cuba liquids");
        Motocicleta ve3= new Motocicleta("4479 LLP", "Honda", "CBR-600", "Gasolina", 600, 4, true);
        Camio ve4= new Camio("5555 HHP", "MANN", "Supertrailer", "Diesel", 5800, 3, "Cuba purins");

        entraVehicle(ve1);
        entraVehicle(ve2);
        entraVehicle(ve3);
        entraVehicle(ve4);

        Parking pa1=new Parking(5);

        pa1.entraVehicle(ve1);
        pa1.entraVehicle(ve2);
        pa1.entraVehicle(ve3);
        pa1.entraVehicle(ve4);

        do{
            menu();
            opcio=teclat.nextLine().toUpperCase().charAt(0);
            switch (opcio){
                case '1':
                    entraVehicle(nouCotxe());
                    break;
                case '2':
                    entraVehicle(novaMoto());
                    break;
                case '3':
                    entraVehicle(nouCamio());
                    break;
                case 'V':
                    llistaVehicles();
                    break;
                case 'E':
                    trobat=buscaVehicle();
                    pa1.entraVehicle(vehicles[trobat]);
                    break;
                case 'S':
                    System.out.println(pa1.llistaVehicles());
                    trobat=buscaVehicle();
                    pa1.surtVehicle(vehicles[trobat]);
                    break;
                case 'I':
                    System.out.println(pa1.toString());

            }

        }while(opcio!='X');

    }

    static void entraVehicle(Vehicle obj){

        for(int i=0; i<vehicles.length;i++){
            if (vehicles[i]==null){
                vehicles[i]=obj;
                break;
            }
        }
    }

    static void llistaVehicles(){
        for(int i=0; i<vehicles.length;i++){
            if (vehicles[i]!=null){
                System.out.println(vehicles[i].getMatricula()+": "+vehicles[i].getMarca()+" "+ vehicles[i].getModel());
            }
        }
    }
    //retorna l'index del array vehicles on està el vehicle buscat
    static int buscaVehicle(){

        String matricula;
        Scanner teclat=new Scanner(System.in);
        System.out.println("Quina matricula busques? ");
        matricula=teclat.nextLine();
        for(int i=0; i<vehicles.length;i++){
            if (vehicles[i]!=null){
                if (matricula.equals(vehicles[i].getMatricula())){
                    return i;
                }
            }
        }
        System.out.println("Matricula no trobada.");
        return -1;
    }

    //impresió del menu i les seves opcions
    static void menu(){
        System.out.println();
        System.out.println("MENU GESTIO VEHICLES");
        System.out.println("Tria una opció:");
        System.out.println("1- Afegeix un COTXE");
        System.out.println("2- Afegeix una MOTO");
        System.out.println("3- Afegeix un CAMIO");
        System.out.println("V- Llista de VEHICLES coneguts");
        System.out.println("E- Vehicle ENTRA a Parking");
        System.out.println("S- Vehicle SURT de Parking");
        System.out.println("I- INFORMACIO d'estat del Parking");
        System.out.println("X- SORTIR del programa");
    }

    static Cotxe nouCotxe(){

        Cotxe obj;
        boolean adblue;
        //Integer.parseInt(myString)
        String[] resp=new String[7];
        Scanner teclat=new Scanner(System.in);
        System.out.println("Informació sobre NOU COTXE:");
        System.out.print("Matricula: ");
        resp[0]=teclat.nextLine();
        System.out.print("Marca: ");
        resp[1]=teclat.nextLine();
        System.out.print("Model: ");
        resp[2]=teclat.nextLine();
        System.out.print("Combustible: ");
        resp[3]=teclat.nextLine();
        System.out.print("Cilindrada: ");
        resp[4]=teclat.nextLine();
        System.out.print("Portes: ");
        resp[5]=teclat.nextLine();
        System.out.print("Adblue(S/N): ");
        resp[6]=teclat.nextLine();

        if(resp[6].toUpperCase().charAt(0)=='S'){
            adblue=true;
        }
        else{
            adblue=false;
        }

        return new Cotxe(resp[0], resp[1], resp[2], resp[3],Integer.parseInt(resp[4]),Integer.parseInt(resp[5]),adblue);

    }

    static Motocicleta novaMoto(){

        boolean cavallet;
        String[] resp=new String[7];
        Scanner teclat=new Scanner(System.in);
        System.out.println("Informació sobre NOVA MOTO:");
        System.out.print("Matricula: ");
        resp[0]=teclat.nextLine();
        System.out.print("Marca: ");
        resp[1]=teclat.nextLine();
        System.out.print("Model: ");
        resp[2]=teclat.nextLine();
        System.out.print("Combustible: ");
        resp[3]=teclat.nextLine();
        System.out.print("Cilindrada: ");
        resp[4]=teclat.nextLine();
        System.out.print("Temps motor: ");
        resp[5]=teclat.nextLine();
        System.out.print("Cavallet(S/N): ");
        resp[6]=teclat.nextLine();

        if(resp[6].toUpperCase().charAt(0)=='S'){
            cavallet=true;
        }
        else{
            cavallet=false;
        }

        return new Motocicleta(resp[0], resp[1], resp[2], resp[3],Integer.parseInt(resp[4]),Integer.parseInt(resp[5]),cavallet);

    }

    static Camio nouCamio(){

        String[] resp=new String[7];
        Scanner teclat=new Scanner(System.in);
        System.out.println("Informació sobre NOVA MOTO:");
        System.out.print("Matricula: ");
        resp[0]=teclat.nextLine();
        System.out.print("Marca: ");
        resp[1]=teclat.nextLine();
        System.out.print("Model: ");
        resp[2]=teclat.nextLine();
        System.out.print("Combustible: ");
        resp[3]=teclat.nextLine();
        System.out.print("Cilindrada: ");
        resp[4]=teclat.nextLine();
        System.out.print("Eixos: ");
        resp[5]=teclat.nextLine();
        System.out.print("Tipus remolc: ");
        resp[6]=teclat.nextLine();

        return new Camio(resp[0], resp[1], resp[2], resp[3],Integer.parseInt(resp[4]),Integer.parseInt(resp[5]),resp[6]);

    }
}
