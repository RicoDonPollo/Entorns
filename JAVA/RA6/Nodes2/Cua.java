package Nodes2;

public class Cua <Comodi>{

    private Node<Comodi> primer;
    private Node<Comodi> ultim;

    private int comptador;

    public Cua(){
        this.primer=null;
        this.ultim=null;
        this.comptador=0;
    }

    public Cua(Comodi obj){
        Node<Comodi> temp = new Node<Comodi>(obj);

        this.primer=temp;
        this.ultim=temp;
        comptador=1;
    }

    public void afegir(Comodi obj){
        Node<Comodi> temp = new Node<Comodi>(obj);

        if(comptador==0){
            this.primer=temp;
            this.ultim=temp;
        } else {                                                        
            this.ultim.setSeguent(temp);
            this.ultim=temp;
        }

        comptador++;
    }

    public Comodi treure(){

        Node <Comodi> temp=this.primer;

        if(temp.getSeguent()==null){
            this.primer=null;
            this.ultim=null;
            comptador=0;
        } else {
            this.primer=temp.getSeguent();
            comptador--;
        }
        
        return temp.getContingut();
    }

    public int getQuantitat(){
        return this.comptador;
    }

    // public Comodi getPrimerComodi(){

        
    // }

}
