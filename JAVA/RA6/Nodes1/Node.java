package Nodes1;

public class Node {
    //objecte que tindra el congingut que guardarem a la llista
    private Object contingut;

    //el seguent nodes que tindra el seguent Objecte de la llista
    private Node seguent;

    public Node(Object obj){
        this.contingut=obj;
        this.seguent=null;
    }
    
    public void setContingut (Object obj){
        this.contingut=obj;
    }

    public Object getContingut (){
        return this.contingut;
    }

    public void setSeguent(Node seg){
        this.seguent=seg;
    }

    public Node getSeguent(){
        return this.seguent;
    }
}
