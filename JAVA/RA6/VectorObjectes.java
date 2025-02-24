import org.omg.CORBA.Object;

public class VectorObjectes {
    
    private Object[] matriu;

    public VectorObjectes(){
        this.matriu=new Object[1];
    }

    public boolean  afegeix(Object obj){
        // matriu[0] = obj;

        try{

            if(matriu[0]==null){
                matriu[0]=obj;
                return true;
            } else {
                ampliaMatriu();
                matriu[matriu.length]=obj;
                return true;
            }
        } catch (Exception e){
            return false;
        }

    }

    private void ampliaMatriu(){

        Object[] comodin = new Object[matriu.length+1];

        for (int i = 0; i<mariu.length;i++){ comodin[i]=matriu[i]; }

        this.matriu=comodin;

    }

    public Object agafa(int index){

        if (index>=0 && index<matriu.length) {
            return matriu[index];
            
        } else {
            return null;
        }

    }

    public int tamany(){
        if((matriu.length==1)&&(matriu[0]==null)){
            return 0;
        }
        
            return matriu.length;
        
    }

    public int busca(Object obj){
        for(int i = 0; i<matriu.length;i++){
            if(Objec.equals(matriu[i],obj)){
                return i;
            }
        }

        return -1;
    }

    public boolean inserta(int index, Object obj){

        try{
            if((matriu.length==1)&&(index<matriu.length)){
                matriu[index]=obj;
                return true;
            } else {
                return false;

            }

        } catch (Exception e) {
                return false;
        }

    }
        

    public void elimina (int index){

        try{
            if (index>=0 && index<matriu.length) {
                if (matriu.length==1){
                    matriu[0]=null;

                } else {
                    Object[] comodin = new Object[matriu.length-1];
                    for(int i = 0; i<comodin.length;i++){
                        if(i>=index){
                            comodin[i]=matriu[i+1];

                        } else {
                            comodin[i] = matriu[i];
                        }
                    }
                    matriu = comodin;
                }
                
            } else {
                

            }

        } catch (Exception e) {

        }

    }

}

