import java.util.Scanner;

public class Main {

    public static void main(String[] args){


        String contingut=new String(); //Contindrà la resposta del servidor API en format json.
        String[] cartes; //Contindrà totes les cadenes separades del json rebut. La informació dels futurs objectes
        CartaDigi coleccio[]; //Contrindrà les cartes generades en objecte
        char opcio='0'; //on desarem el 'char' que conté la opció a executar
        Partida partida;

        //Cridem al mètode que ens retornarà la cadena Strign amb el contingut de la crida
        contingut= Model.retornaInfo();

        //Efectuem l'split de separació de cartes
        cartes=contingut.split("\\}\\,\\{");
        //A la primera carta li treiem el primer simbol [
        cartes[0]=cartes[0].substring(1);

        //Creem tota la colecció de cartes en string a objectes
        coleccio=generaColeccio(cartes);

        //Menu.
        //Cridem mètode que mostra menu i després executem opció
        while(opcio!='S'){
            opcio=mostraMenu();
            switch (opcio){
                case 'J':
                    partida=new Partida(coleccio);
                    partida.iniciaPartida(3);
                    break;
                case 'M':
                    Model.mostraLog();
                    break;
                case 'R':
                    partida=Model.recuperaPartida();
                    if (partida!=null){
                        partida.continuaPartida();
                    }
                    break;
            }

        }

    }

    static char mostraMenu() {

        Scanner teclat = new Scanner(System.in);

        System.out.println("MENU PRINCIPAL");
        System.out.println("J - Juga una partida");
        System.out.println("M - Mostra historial de partides");
        System.out.println("R - Recupera una partida no acabada");
        System.out.println("S - Surt del joc");
        System.out.println("Tria una opció: ");
        return teclat.nextLine().toUpperCase().charAt(0);
    }

    static CartaDigi[] generaColeccio(String[] cartes){

        CartaDigi[] matriu=new CartaDigi[cartes.length];

        for(int i=0; i<cartes.length;i++){
            matriu[i]=stringACarta(cartes[i]);
        }
        return matriu;
    }

    static CartaDigi stringACarta(String carta){
        String nom=new String();
        String nivell=new String();
        String[] atributs=carta.split(",");
        nom=atributs[0].substring(8,atributs[0].length()-1);
        nivell=atributs[2].substring(9,atributs[2].length()-1);
        return new CartaDigi(nom,nivell);
    }

}
