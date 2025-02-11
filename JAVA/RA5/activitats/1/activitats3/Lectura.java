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
                
                mat=linia.split(",");

                mat[0]=mat[0].substring(1,mat[0].length()-1);

                mat[1]=mat[1].substring(1);

                System.out.println(mat[0]);

                double nota = Double.parseDouble(mat[1]);
                // System.out.println(nota);

                if(nota>=5){
                    mat[1]="Aprovat";
                } else {mat[1]="Suspes";}

                System.out.println(mat[1]);

                System.out.println();


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


