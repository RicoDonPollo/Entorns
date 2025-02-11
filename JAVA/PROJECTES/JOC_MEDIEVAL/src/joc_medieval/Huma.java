package joc_medieval;

public class Huma extends Personatge{

    public Huma (int vida, int força, int agilitat, int magia){
        super(vida, força, agilitat, magia);

        puntsDeVida=this.vida;
    }

    public String toString(){
        return "//=====Huma=====//" + "\n" + super.toString() + "\n" + "Total inventari: " + inventari();
    }

 //=========================//
    private Objecte[] inventari; 
    private int maxpes = 25;
    private int pesactual;

    public void Mochilla(int maxpes){
        this.inventari=new Objecte[maxpes];
        this.maxpes=maxpes;
        this.pesactual=0;
    }

    public boolean entraObjecte(Objecte objecte){
        if(pesactual<(maxpes-1)){
            for(int i = 0; i<maxpes;i++){
                if(inventari[i]!=null){
                    inventari[i]=objecte;
                    pesactual=pesactual+objecte.getPes();
                }
            }
            return true;
            }
        else{
            return false;
        }
    }

    public void treureObjecte(Objecte objecte){
        
        int lloc=-1;

        for(int i=0; i<maxpes;i++){
            if(inventari[i]==objecte){
                lloc=i;
                break;
            }
        }
        if (lloc>-1){
            for(int i=(lloc+1);i<maxpes;i++){
                inventari[i-1]=inventari[i];
            }
            inventari[maxpes-1]=null;
            pesactual--;
        }
    }

    public String toStringInventari(){

        String llista=new String();
        for(int i=0; i<pesactual;i++){
                llista=llista+inventari[i]+"\n";
            }
        return "Inventari de  " + maxpes + " kg max" + "\n" + "Pes actual: " + pesactual + "\n" + "Objectes" + "\n" + llista;
    }

}

