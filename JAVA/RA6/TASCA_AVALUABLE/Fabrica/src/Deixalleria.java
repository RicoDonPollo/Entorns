import java.util.ArrayList;
import java.util.LinkedList;

public class Deixalleria {

    LinkedList<Ipad> deixalleria;
    private static int comp;
 

    public Deixalleria(){
        this.deixalleria=new LinkedList<Ipad>();
        
    }


    public void afegirProducteDefectuos(Ipad ip) {
        deixalleria.add(ip);
        comp++;
    }

    @Override
    public String toString() {
        return "Deixalleria \n [deixalleria=" + deixalleria + ", comp=" + comp + "]";
    }

    
    
}
