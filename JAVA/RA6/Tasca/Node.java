package Nodes2;

public class Node <Comodi>{

    private Comodi contingut;
    private Node<Comodi> seguent;

    public Node (Comodi obj){
        this.contingut=obj;
        this.seguent=null;
    }

    public void setContingut(Comodi obj){this.contingut=obj;}

    public Comodi getContingut() {return this.contingut;}


    public void setSeguent(Node seg){this.seguent=seg;}

    public Node getSeguent() {return this.seguent;}

}
