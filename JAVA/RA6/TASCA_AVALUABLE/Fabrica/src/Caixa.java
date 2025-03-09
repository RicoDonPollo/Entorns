import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Caixa {

    ArrayList<Ipad> caixa;
    private static int comp;
 

    public Caixa(){
        this.caixa=new ArrayList<Ipad>(7);
        
    }

    @Override
    public String toString() {
        return "Deixalleria \n [deixalleria=" + caixa + ", comp=" + comp + "]";
    }

    public static LinkedList<ArrayList<Ipad>> crearCaixes(Queue<Ipad> cua, LinkedList<ArrayList<Ipad>> caixaDeCaixes) {

        if (cua.isEmpty()) {
            return caixaDeCaixes; 
        }
    
        while (!cua.isEmpty()) {
            ArrayList<Ipad> caixa = new ArrayList<Ipad>(7); 
    

            for (int i = 0; i < 7 && !cua.isEmpty(); i++) {
                caixa.add(cua.poll()); 
            }
    
            caixaDeCaixes.add(caixa); 
        }
    
        return caixaDeCaixes;
    }
    

    public static void mostrarCaixes(LinkedList<ArrayList<Ipad>> caixaDeCaixes){

        System.out.println("Caixes creades:");

        for (int i = 0; i < caixaDeCaixes.size(); i++) {
            System.out.println("Caixa " + (i + 1) + ": " + caixaDeCaixes.get(i));
        }
        
    }
    
}