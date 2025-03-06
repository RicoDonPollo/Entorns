
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Cinta {

    
    public static void main(String[] args) {

        Queue <Ipad> tanda = new LinkedList<Ipad>();

        char opcio=',';
        
        Ipad i1Ipad = new Ipad();
        Ipad i2Ipad = new Ipad();
        Ipad i31Ipad = new Ipad();
        Ipad i4Ipad = new Ipad();
        Ipad i5Ipad = new Ipad();

    public void cinta1(){
        
    }
        while (opcio!='E') {
            opcio=menu();
            switch (opcio) {
                case '1':
                    System.out.println("Ha entrar l'iPad - " + i1Ipad);
                    tanda.add(i1Ipad);
                    // numero++;
                    break;
    
                case '2':
                    System.out.println("Ha sortit el primer iPad de la cua - " + tanda.poll());
    
                    break;
            
                default:
                    break;
            }
        }
        
        


    }

    public static char menu(){
        try (Scanner teclat = new Scanner(System.in)) {
            System.out.println("MENU TANDA BOTIGA");
            System.out.println(" 1 - Entrar iPad");
            System.out.println(" 2 - Sortir iPad");
            System.out.println(" E - SORTIR DEL PROGRAMA");
            return teclat.nextLine().charAt(0);
        }

    }

}
