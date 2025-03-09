import java.util.LinkedList;
import java.util.Scanner;
public class Fabrica {

    private int num_carcassa;
    private int num_circuits_integrat;
    private int num_pantalles;
    private int num_embalatges_individuals;

    private static int min_peçes = 150;
    private static int max_peçes = 150;


    public Fabrica(int num_carcassa, int num_circuits_integrat, int num_pantalles, int num_embalatges_individuals){
        this.num_carcassa=num_carcassa;
        this.num_circuits_integrat=num_circuits_integrat;
        this.num_pantalles=num_pantalles;
        this.num_embalatges_individuals=num_embalatges_individuals;
    }


    public int getNum_carcassa() {
        return num_carcassa;
    }


    public void setNum_carcassa(int num_carcassa) {
        this.num_carcassa = num_carcassa;
    }


    public int getNum_circuits_integrat() {
        return num_circuits_integrat;
    }


    public void setNum_circuits_integrat(int num_circuits_integrat) {
        this.num_circuits_integrat = num_circuits_integrat;
    }


    public int getNum_pantalles() {
        return num_pantalles;
    }


    public void setNum_pantalles(int num_pantalles) {
        this.num_pantalles = num_pantalles;
    }


    public int getNum_embalatges_individuals() {
        return num_embalatges_individuals;
    }


    public void setNum_embalatges_individuals(int num_embalatges_individuals) {
        this.num_embalatges_individuals = num_embalatges_individuals;
    }

    public boolean hiHaPecaDisponible(){
        if (num_carcassa>0 && num_circuits_integrat>0 && num_embalatges_individuals>0 && num_pantalles>0){
            return true;
        }
        return false;
    }

    public void restarPeces() {
        if (num_carcassa > 0 && num_pantalles > 0 && num_circuits_integrat > 0 && num_embalatges_individuals > 0) {
            num_carcassa--;
            num_pantalles--;
            num_circuits_integrat--;
            num_embalatges_individuals--;
        } else {
            System.out.println("No hi ha suficients peces per crear més iPads.");
        }
    }


    @Override
    public String toString() {
        return "Fabrica [num_carcassa=" + num_carcassa + ", num_circuits_integrat=" + num_circuits_integrat
                + ", num_pantalles=" + num_pantalles + ", num_embalatges_individuals=" + num_embalatges_individuals
                + "]";
    }

    void assignarPeçes(){
        Scanner in = new Scanner(System.in);
        
        while (num_carcassa<150 || num_carcassa>250) {
            System.out.println("Quantes carcasses hi han?");
            this.num_carcassa=in.nextInt();

            if (num_carcassa<150 || num_carcassa>250){
                System.out.println("Només acceptem entre 150 i 250 peçes.");

            }
        }

        while (num_circuits_integrat<150 || num_circuits_integrat>250) {
            System.out.println("Quin és el numero de circuits integrats que hi han?");
            this.num_circuits_integrat=in.nextInt();

            if (num_circuits_integrat<150 || num_circuits_integrat>250){
                System.out.println("Només acceptem entre 150 i 250 peçes.");

            }
        }

        while (num_pantalles<150 || num_pantalles>250) {
            System.out.println("Quantes pantalles hi han?");
            this.num_pantalles=in.nextInt();

            if (num_pantalles<150 || num_pantalles>250){
                System.out.println("Només acceptem entre 150 i 250 peçes.");

            }
        }

        while (num_embalatges_individuals<150 || num_embalatges_individuals>250) {
            System.out.println("Quin és el numero de embalatges individuals que hi han?");
            this.num_embalatges_individuals=in.nextInt();

            if (num_embalatges_individuals<150 || num_embalatges_individuals>250){
                System.out.println("Només acceptem entre 150 i 250 peçes.");

            }
        }
        
        

    }

    public static LinkedList<Ipad> crearIpadsFinsEsgotarPeces(Fabrica fabrica) {
        LinkedList<Ipad> iPads = new LinkedList<>();

        while (fabrica.getNum_carcassa() > 0 && fabrica.getNum_circuits_integrat() > 0 &&
               fabrica.getNum_embalatges_individuals() > 0 && fabrica.getNum_pantalles() > 0) {
            iPads.add(new Ipad()); 
            fabrica.restarPeces();
        }

        return iPads;
    }


    

}
