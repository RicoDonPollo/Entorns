package Nodes1;

import java.util.Objects;

public class Llista {
        private Node primer;
        private Node ultim;

        public Llista(){
            this.primer=null;
        }

        public Llista(Object obj){
            Node temp=new Node(obj);
            this.primer=temp;
            this.ultim=temp;
            
        }

        public void afegeix(Object obj){
            Node temp = new Node(obj);

            if(this.primer==null){
                this.primer=temp;
                this.ultim=temp;
            } else {
                this.ultim.setSeguent(temp);
                this.ultim=temp;
            }
        }

        public Object agafa(int index){
            Node temp=this.primer;
            
            for(int i=0; i<=index; i++){
                if(temp.getSeguent()!=null){
                    temp=temp.getSeguent();
                } else {
                    return null;
                }
            }

            return temp.getContingut();

        }

        public int tamany(){
            Node temp=this.primer;
            int comp=0;
                while (temp !=null){
                    comp++;
                    temp=temp.getSeguent();
                }
                return comp;
        }

        public int busca(Object obj){
            int index=0;
            Node temp=this.primer;
            while(temp != null){
                if(Objects.equals(temp.getContingut(), obj)){
                    return index;
                }
                index++;
                temp=temp.getSeguent();

            }
            return -1;
        }

        public boolean afegir(int index){

            
        }

        }


