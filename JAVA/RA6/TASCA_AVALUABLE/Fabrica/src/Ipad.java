public class Ipad {

    private String num_serie;
    private boolean carcassa;
    private boolean circuits_integrat;
    private boolean pantalla;
    private boolean embalatges_individuals;
    private boolean defectuos;

    public Ipad(String num_serie){
        this.num_serie=num_serie;
        this.carcassa=false;
        this.circuits_integrat=false;
        this.pantalla=false;
        this.embalatges_individuals=false;
        this.defectuos=false;

    }

    public String getNum_serie() {
        return num_serie;
    }

    public void setNum_serie(String num_serie) {
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
        return "Ipad [num_serie=" + num_serie + ", carcassa=" + carcassa + ", circuits_integrat=" + circuits_integrat
                + ", pantalla=" + pantalla + ", embalatges_individuals=" + embalatges_individuals + ", defectuos="
                + defectuos + "]";
    }



    
    
}
