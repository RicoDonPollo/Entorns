package ArbreBinari;

public class NodeBinari {

    private int contingut;
    private NodeBinari dreta;
    private NodeBinari esquerra;

    public NodeBinari (int contingut){
        this.contingut=contingut;
        this.dreta=null;
        this.esquerra=null;
    }

    public int getContingut() {
        return contingut;
    }

    public NodeBinari getDreta() {
        return dreta;
    }

    public void setDreta(NodeBinari dreta) {
        this.dreta = dreta;
    }

    public NodeBinari getEsquerra() {
        return esquerra;
    }

    public void setEsquerra(NodeBinari esquerra) {
        this.esquerra = esquerra;
    }

    @Override
    public String toString() {
        String dret;
        String esquerrat;
        if (this.dreta==null) {
            dret="null";
            
        } else {
            dret=this.dreta.toString();
        }

        if (this.esquerra==null) {
            esquerrat="null";
            
        } else {
            esquerrat=this.esquerra.toString();
        }

        return "NodeBinari [contingut=" + contingut + ", dreta=" + dret + ", esquerra=" + esquerrat + "]";
    }

    

    


}
