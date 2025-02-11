import java.io.FileWriter;
import java.io.IOException;

public class Escriptura {

    //Crea un programa que escrigui 3 frases triades per tu en línies diferents. Crea un altre programa que llegeixi l’arxiu i imprimeixi per pantalla totes les frases que té
    public static void main(String[] args) throws Exception {
        String linia = "Holaa";
        
        try{
            FileWriter arxiu = new FileWriter("Activitat.txt");
            arxiu.write("Holaaa");

            arxiu.write("Holaaa");

            arxiu.write(linia);
            
            arxiu.close();

        }
        catch (IOException e){
            System.out.println("Exepció: " + e.toString());
        }
        }
}
