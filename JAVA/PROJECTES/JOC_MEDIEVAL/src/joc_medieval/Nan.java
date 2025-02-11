package joc_medieval;

public class Nan extends Personatge{

    //bonus de +10 a la força i a la vida, però un mínus de -20 a la màgia.



    public Nan (int vida, int força, int agilitat, int magia){
        super(vida, força, agilitat, magia);
        //bonus de +10
        if (this.vida<=90){
            this.vida=this.vida+10;
        } else {
            this.vida=100;
        }
        //bonus de +10
        if (this.força<=90 ){
            this.força=this.força+10;
        } else {
            this.força=100;
        }

        //no va el minus -20
        if (this.magia>=60 ){
            this.magia=this.magia-20;
        } else {
            this.magia=40;
        }

        puntsDeVida=this.vida;
    }

    //=====TOSTRING=====//

public String toString(){
    return "//=====Nan=====//" + "\n" + super.toString() + "\n" + "Total inventari: " + inventari();


}

//=====INSTANCEOF=====//

}
