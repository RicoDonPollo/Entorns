package joc_medieval;
public class Personatge {
private final int VIDAMAX = 100;
private final int VIDAMIN = 40;
protected int vida;

private final int FORÇAMAX = 100;
private final int FORÇAMIN = 40;
protected int força;

private final int AGILITATMAX = 100;
private final int AGILITATMIN = 40;
protected int agilitat;

private final int MAGIAMAX = 100;
private final int MAGIAMIN = 40;
protected int magia;


private final int MALMAXIM = vida;
protected int puntsDeVida = vida;
protected int mal = 0;

// protected Objecte[] inventari;





public Personatge (int vida, int força, int agilitat, int magia){
    
    
    if (vida<=VIDAMAX && vida>=VIDAMIN){
        this.vida=vida;
    }else if (vida<VIDAMIN){
        this.vida=VIDAMIN;
    }else if(vida>VIDAMAX){
        this.vida=VIDAMAX;
    }

    if (força<=FORÇAMAX && força>=FORÇAMIN) {
        this.força=força;
    }else if (força<FORÇAMIN){
        this.força=FORÇAMIN;
    }else if(força>FORÇAMAX){
        this.força=FORÇAMAX;
    }

    if (agilitat<=AGILITATMAX && agilitat>=AGILITATMIN) {
        this.agilitat=agilitat;
    }else if (agilitat<AGILITATMIN){
        this.agilitat=AGILITATMIN;
    }else if(agilitat>AGILITATMAX){
        this.agilitat=AGILITATMAX;
    }

    if (magia<=MAGIAMAX && magia>=MAGIAMIN) {
        this.magia=magia;
    }else if (magia<MAGIAMIN){
        this.magia=MAGIAMIN;
    }else if(magia>MAGIAMAX){
        this.magia=MAGIAMAX;
    
    }

    //=====INVENTARI=====//
    // inventari = new Objecte[10];

    
 
}



//=====TOSTRING=====//

public String toString(){
    return "VidaMax: " + vida + "\n" + "Punts de vida: " + puntsDeVida + "\n" + "Força: " + força + "\n" + "Agilitat: " + agilitat + "\n" + "Magia: " + magia;
}

//=====IMPRIMIR INVENTARI====//

public String inventari(){
    return "Pots portar fins " + força/4 + " de pes al inventari.";
}

public void malPersonatge () {
    if (puntsDeVida==mal) {
        System.out.println("¡Has mort!");
    } else {
        System.out.println("¡Estas viu!");
    }
}

//=====GETTERS=====//
public int getPuntsVida () {
    return this.puntsDeVida;
}

public int getVida () {
    return this.vida;
}

public int getForça () {
    return this.força;
}

public int getAgilitat () {
    return this.agilitat;
}

public int getMagia () {
    return this.magia;
}




//=====SETTERS=====//

public void setPuntsVida(int puntsDeVida) {
    this.puntsDeVida=puntsDeVida;
}

public void setVida(int vida) {
    this.vida=vida;
}

public void setForça(int força) {
    this.força=força;
}

public void setAgilitat(int agilitat) {
    this.agilitat=agilitat;
}

public void setMagia(int magia) {
    this.magia=magia;
}

public void usObjecteActivacio (Huma h1) {
    this.magia=getMagia();
    h1.setMagia(magia+5);
    
}



//=====ARMESSET=====//


public void setArmaBasto(Objecte[] inventari, Arma basto){
    inventari[1]=basto;

}


//=====MOCHILA=====//

    


}
