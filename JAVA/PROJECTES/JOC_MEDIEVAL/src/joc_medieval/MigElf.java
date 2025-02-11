package joc_medieval;

public class MigElf extends Personatge{

    // bonus de +5 a l’agilitat i la màgia, però un -5 a la vida i la força.


    public MigElf (int vida, int força, int agilitat, int magia){
        super(vida, força, agilitat, magia);
        if (this.vida>=45){
            this.vida=vida-5;
        } else {
            this.vida=40;
        }

        if (this.força>=45 ){
            this.força=força-5;
        } else {
            this.força=40;
        }

        if (this.agilitat<=95 ){
            this.agilitat=agilitat+5;
        } else {
            this.agilitat=100;
        }

        if (this.magia<=95 ){
            this.magia=magia+5;
        } else {
            this.magia=100;
        }

        puntsDeVida=this.vida;
    }

    //=====TOSTRING=====//

public String toString(){
    return "//=====Mig-Elf=====//" + "\n" + super.toString() + "\n" + "Total inventari: " + inventari();
}

}
