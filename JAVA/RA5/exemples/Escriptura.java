import java.io.FileWriter;
import java.io.IOException;

public class Escriptura {

    //Crea un programa que escrigui 3 frases triades per tu en línies diferents. Crea un altre programa que llegeixi l’arxiu i imprimeixi per pantalla totes les frases que té
    public static void main(String[] args) throws Exception {
        String linia = "\"Nom\", 8.8\n";
        String linia2 = "\"Nom\", 7.7\n";
        String linia3 = "\"Nom\", 4.9\n";

        try{
            FileWriter arxiu = new FileWriter("Notes.txt");
            arxiu.write(linia);
            arxiu.write(linia2);
            arxiu.write(linia3);
            arxiu.write("Holaa");

            arxiu.close();

        }
        catch (IOException e){
            System.out.println("Exepció: " + e.toString());
        }
        }
}
