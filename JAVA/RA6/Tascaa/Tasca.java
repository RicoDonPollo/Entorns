package Tascaa;
public class Tasca {

    private String identificador;
    private String descripcio;
    private int prioritat;
    private boolean fet;

    public Tasca(String descripcio, int prioritat){

        this.identificador=String.valueOf(descripcio.hashCode());
        this.descripcio=descripcio;
        this.prioritat=prioritat;
        this.fet=false;

    }

    public int getPrioritat() {
        return prioritat;
    }

    public String getDescripcio(){
        return descripcio;
    }

    public String getIdentificador(){
        return identificador;
    }

    public boolean getFet(){
        return fet;
    }

    public void setFet(){
        this.fet=true;
    }
}
