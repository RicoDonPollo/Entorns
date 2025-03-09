import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class Main {
    public static void main(String[] args) {
        //=====FABRICA=====//
        Fabrica f1 = new Fabrica(10, 10, 10, 10); 
        System.out.println(f1.toString());

        // f1.assignarPeçes();

        // Crear iPads
        LinkedList<Ipad> iPads = Fabrica.crearIpadsFinsEsgotarPeces(f1);

        // Mostrar els iPads creats
        for (int i = 0; i < iPads.size(); i++) {
            System.out.println(iPads.get(i));
        }
        
        //=====Llistes=====//
        //Creo les cues per emagatzemar els iPads
        Queue<Ipad> cua = new LinkedList<>();  
        Queue<Ipad> cua2 = new LinkedList<>();
        Queue<Ipad> cua3 = new LinkedList<>();
        Queue<Ipad> cfinal = new LinkedList<>();

        Deixalleria deixalleria = new Deixalleria();

        // Afegir iPads a la cua si n'hi ha
        if (!iPads.isEmpty()) {
            Cinta.afegirProducte(cua, iPads); // Afegir iPads a la primera cua
        } else {
            System.out.println("No hi ha iPads per afegir a la cua.");
        }

        // System.out.println("Cinta abans de processar: " + cua);


        //=====CINTES=====//
        Cinta.processarProducte(cua, cua2, deixalleria); // Processar cua1 i passar a cua2
        Cinta.processarProducte2(cua2, cua3, deixalleria); // Processar cua2 i passar a cua3
        Cinta.processarProducte3(cua3, cfinal, deixalleria); // Processar cua3 i passar a cfinal

        System.out.println(deixalleria.toString()); // Mostrar deixalleria


        //Caixes
        LinkedList<ArrayList<Ipad>> caixaDeCaixes = new LinkedList<ArrayList<Ipad>>();

        caixaDeCaixes = Caixa.crearCaixes(cfinal, caixaDeCaixes);

        Caixa.mostrarCaixes(caixaDeCaixes);
    
        Client c1= new Client("Nami", "nata", "casameva");
        Client c2= new Client("Nami2", "nata2", "casameva2");

        Client.enviarCaixes(caixaDeCaixes, c1);

    }

    

    

    


}