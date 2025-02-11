package presentacio2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Programa {
    public static void main(String[] args) {
        
        // Forma f1=new Forma("Quadrat", "blau", "negre");
        // Forma f2=new Forma("Redona", "Blanc", "Vermell");
        // Forma f3=new Forma("Triangle", "Rosa", "groc");
        
        
        // guardarForma("forma2.ext", f2);

        Forma obje=lecturaForma("forma.ext");
        System.out.println(obje.toString());
    }

    private static void guardarForma(String nomarxiu, Forma obj){
        try{

            FileOutputStream link=new FileOutputStream(nomarxiu);
            ObjectOutputStream oos = new ObjectOutputStream(link);
            oos.writeObject(obj);
            oos.close();
        } catch (IOException e) {
            System.out.println("Exepció: " + e);

        }
    }

    private static Forma lecturaForma(String nomarxiu) {
        
        Forma obj;
        try{
            FileInputStream link = new FileInputStream(nomarxiu);
            ObjectInputStream ois = new ObjectInputStream(link);
            obj=(Forma)ois.readObject();
            ois.close();
            return obj;

        } catch (IOException e) {
            System.out.println("Exepció: " + e);
            return new Forma("a", "a", "a");
        } catch (ClassNotFoundException c) {
            System.out.println("Exepció: " + c);
            return new Forma("a", "a", "a");
        }
    }

}