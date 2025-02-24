package Nodes1;

public class Main {

public static void main(String[] args) {
    
    Llista llista = new Llista();
    
    llista.afegeix("Tomates");
    llista.afegeix("Poma");
    llista.afegeix("Patates");
    llista.afegeix("Patates");
    llista.afegeix("Patates");
    
    System.out.println(llista.agafa(1));

    System.out.println(llista.tamany());



}
}
