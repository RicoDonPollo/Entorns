package Nodes2;

import java.io.Serializable;

public class Pila<Comodin> implements Serializable{

    private Node<Comodin> top;
    private int comptador;

    public Pila(){
        this.top=null;
        this.comptador=0;
    }

    public Pila(Comodin obj){
        Node<Comodin> temp=new Node<Comodin>(obj);

        this.top=temp;
        this.comptador=1;
        
    }

    public void afegir(Comodin obj){
        Node<Comodin> temp=new Node<Comodin>(obj);
        temp.setSeguent(this.top);
        this.top=temp;
        this.comptador++;

    }

    public Comodin treu(){
        Node<Comodin> temp;

        if(comptador==0){
            return null;
        } else {
            temp=this.top;
            this.top=this.top.getSeguent();
            return temp.getContingut();
        }
    }

    public int getQuantitat(){
        return this.comptador;
    }

}
