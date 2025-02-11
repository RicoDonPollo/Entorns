
import java.io.File;
import java.io.IOException;

public class Creacio {

    //Crea un programa que escrigui 3 frases triades per tu en línies diferents. Crea un altre programa que llegeixi l’arxiu i imprimeixi per pantalla totes les frases que té
    public static void main(String[] args) throws Exception {
        try{
            File arxiu = new File("Activitat.txt");
            System.out.println(arxiu.getAbsolutePath());

            System.out.println("Hem pogut crear l'arxiu? " + arxiu.createNewFile());
        }
        catch (IOException e){
            System.out.println("Exepció: " + e.toString());
        }
        }
}
