package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        
        Queue <Integer> tanda = new LinkedList<Integer>();
        

        char opcio=',';
        
        int numero=0;

        while (opcio!='E') {
            opcio=menu();
            switch (opcio) {
                case '1':
                    System.out.println("El teu número és el - " + numero);
                    tanda.add(numero);
                    numero++;
                    break;
    
                case '2':
                    System.out.println("Pot ser atès el numero - " + tanda.poll());
    
                    break;
            
                default:
                    break;
            }
        }
        
        


    }

    public static char menu(){
        Scanner teclat = new Scanner(System.in);
        System.out.println("MENU TANDA BOTIGA");
        System.out.println(" 1 - AGAFA NÚMERO");
        System.out.println(" 2 - NÚMERO A SER ATÈS");
        System.out.println(" E - SORTIR DEL PROGRAMA");
        return teclat.nextLine().charAt(0);

    }

}
