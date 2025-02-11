package activitats1.activitats1;
import java.io.FileWriter;
import java.io.IOException;

public class RA5_1_1_escriptura {
    public static void main(String[] args) throws Exception {
        try{
            FileWriter arxiu = new FileWriter("Activitat1");
            arxiu.write("hola\n");
            arxiu.write("hola2\n");
            arxiu.write("hola3\n");
            arxiu.close();

            System.out.println("Escriptura realitzada");
        }
        catch (IOException e){
            System.out.println("Exepció: " + e.toString());
        }
        }
}
