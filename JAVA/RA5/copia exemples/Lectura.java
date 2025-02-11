import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lectura {
    public static void main(String[] args){

        try{
            String[] mat;
            File arxiu = new File("Notes.txt");
            Scanner lectura = new Scanner(arxiu);
            
            while (lectura.hasNextLine()) {
                String linia=lectura.nextLine();
                System.out.println(linia);
                System.out.println();
            }

            lectura.close();
            
            System.out.println("Lectura realitzada");

        }
        catch (IOException e){

            System.out.println("Exepció: " + e.toString());

        }
    }
}


