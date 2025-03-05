package Tascaa;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Queue<Tasca> altaPrioritat=new LinkedList<Tasca>();
        Queue<Tasca> baixaPrioritat=new LinkedList<Tasca>();

        ArrayList<Tasca> tasques=new ArrayList<Tasca>();


        Tasca ta1=new Tasca("Fer Compra", 10);
        Tasca ta2=new Tasca("Practica programacio", 1000);
        Tasca ta3=new Tasca("Jugar al Lol", 2);
        Tasca ta4=new Tasca("Quedar amb amics", 20);
        Tasca ta5=new Tasca("Gastar pasta", 10);
        Tasca ta6=new Tasca("Anar de farra", 50);
        Tasca ta7=new Tasca("Fer els ex de Programació", 900);
        Tasca ta8=new Tasca("Preparar examen RA6", 950);

        tasques.add(ta1);
        tasques.add(ta2);
        tasques.add(ta3);
        tasques.add(ta4);
        tasques.add(ta5);
        tasques.add(ta6);
        tasques.add(ta7);
        tasques.add(ta8);

        for (Tasca temp:tasques){
            if(temp.getPrioritat()>100){
                altaPrioritat.add(temp);
                System.out.println("La tasca \"" + temp.getDescripcio() + "\" s'ha posat a la llista de alta prioritat");
            } else {
                baixaPrioritat.add(temp);
                System.out.println("La tasca \"" + temp.getDescripcio() + "\" s'ha posat a la llista de baixa prioritat");
            }

        }

        for(Tasca temp: altaPrioritat){
            System.out.println("Fem la tasca \"" + temp.getDescripcio() + "\".");

        }

        for(Tasca temp: baixaPrioritat){    
            System.out.println("Fem la tasca \"" + temp.getDescripcio() + "\".");

        }
        
    }

}
