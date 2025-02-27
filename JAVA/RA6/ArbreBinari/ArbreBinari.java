package ArbreBinari;

public class ArbreBinari {

    private NodeBinari arrel;
    private int comptador;

    public ArbreBinari(int arrel){
        NodeBinari nodeArrel=new NodeBinari(arrel);
        this.arrel=nodeArrel;
        comptador=1;
    }

    public void afegir(int valor){
        NodeBinari temp=arrel;
        int flag=0;

        while (flag==0){
            if (valor>temp.getContingut()){
                if (temp.getDreta()!=null) {
                    temp=temp.getDreta();
                    
                } else { 
                    temp.setDreta(new NodeBinari(valor)); 
                    comptador++;
                }
            }
            else if(valor<temp.getContingut()){
                if (temp.getEsquerra()!=null) {
                    temp=temp.getEsquerra();
                    
                } else { 
                    temp.setEsquerra(new NodeBinari(valor));
                    comptador++;
                }

            } else {flag = 1;}

        }
    }

    public void cerca(int valor){
        NodeBinari temp=arrel;
        int flag=0;
        while (flag==0) {
            
            if (valor>temp.getContingut()){
                if (temp.getDreta()!=null) {
                    temp=temp.getDreta();
                    System.out.println("Passem a la Dreta");
                    
                } else { 
                    System.out.println("No s'ha trobat!!");
                    flag = 1;
                }
            }
            else if(valor<temp.getContingut()){
                if (temp.getEsquerra()!=null) {
                    temp=temp.getEsquerra();
                    System.out.println("Passem a la Esquerra");
                    
                } else { 
                    System.out.println("No s'ha trobat!!");
                    flag = 1;
                }
    
            } else {
                System.out.println("SIIIII Trobat!!");
    
                flag = 1;
            }
        }

    }


    public void imprimeixOrdenat(){
        this.recursiuOrdenat(arrel);
    }

    private void recursiuOrdenat(NodeBinari temp){
        if(temp!=null){
            recursiuOrdenat(temp.getEsquerra());
            System.out.println(temp.getContingut());
            recursiuOrdenat(temp.getDreta());
        }
    }

    @Override
    public String toString() {
        return "ArbreBinari [arrel=" + arrel + ", comptador=" + comptador + "]";
    }
    
    

}
