package joc_medieval;

public class Elf extends Personatge{

    //bonus de +10 a la agilitat i un +10 a la màgia. Tindrà un -10 a la vida i a la força.


    public Elf (int vida, int força, int agilitat, int magia){
        super(vida, força, agilitat, magia);
        //minus de -10
        if (this.vida>=50){
            this.vida=vida-10;
        } else {
            this.vida=40;
        }

        //minus de -10
        if (this.força>=50 ){
            this.força=força-10;
        } else {
            this.força=40;
        }

        //bonus de +10
        if (this.agilitat<=90 ){
            this.agilitat=this.agilitat+10;
        } else {
            this.agilitat=100;
        }

        //bonus de +10
        if (this.magia<=90 ){
            this.magia=this.magia+10;
        } else {
            this.magia=100;
        }

        puntsDeVida=this.vida;
        }

//=====TOSTRING=====//

public String toString(){
return "//=====Elf=====//" + "\n" + super.toString() + "\n" + "Total inventari: " + inventari();
}
}
