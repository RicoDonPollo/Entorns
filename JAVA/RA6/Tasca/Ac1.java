package Tasca;

public class Ac1<Comodi> {
    //Utilitzant la Classe Cuaque hem codificat a classe, fes un programa que gestioni l’ordre de tanda d’una botiga. El primer que entra és el primer en ser atès.

        private Node<Comodi> primer;
        private Node<Comodi> ultim;
    
        private int comptador;
    
        public Ac1(){
            this.primer=null;
            this.ultim=null;
            this.comptador=0;
        }
    
        public Ac1(Comodi obj){
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
    

}
