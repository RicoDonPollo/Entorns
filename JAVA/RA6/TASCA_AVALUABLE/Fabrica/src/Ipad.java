public class Ipad {

    private static int num_serie=0;
    private int num_serie_instancia;

    private boolean carcassa;
    private boolean circuits_integrat;
    private boolean pantalla;
    private boolean embalatges_individuals;
    private boolean defectuos;

    public Ipad(){
        this.num_serie_instancia = ++num_serie;
        this.carcassa=true;
        this.circuits_integrat=false;
        this.pantalla=false;
        this.embalatges_individuals=false;
        this.defectuos=false;

    }

    public int getNum_serie() {
        return num_serie_instancia;
    }

    public void setNum_serie(int num_serie) {
        this.num_serie = num_serie;
    }

    public boolean isCarcassa() {
        return carcassa;
    }

    public void setCarcassa(boolean carcassa) {
        this.carcassa = carcassa;
    }

    public boolean isCircuits_integrat() {
        return circuits_integrat;
    }

    public void setCircuits_integrat(boolean circuits_integrat) {
        this.circuits_integrat = circuits_integrat;
    }

    public boolean isPantalla() {
        return pantalla;
    }

    public void setPantalla(boolean pantalla) {
        this.pantalla = pantalla;
    }

    public boolean isEmbalatges_individuals() {
        return embalatges_individuals;
    }

    public void setEmbalatges_individuals(boolean embalatges_individuals) {
        this.embalatges_individuals = embalatges_individuals;
    }

    public boolean isDefectuos() {
        return defectuos;
    }

    public void setDefectuos(boolean defectuos) {
        this.defectuos = defectuos;
    }

    @Override
    public String toString() {
        return "Ipad " + num_serie_instancia + "\n" 
        + "\tcircuits_integrat=" + circuits_integrat + "\n"
        + "\tpantalla=" + pantalla + "\n"
        + "\tembalatges_individuals=" + embalatges_individuals + "\n"
        + "\tdefectuos=" + defectuos + "\n";
    }

}
