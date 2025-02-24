package Nodes2;

public class Main {

    public static void main(String[] args) {

        Cua<Integer> cueta=new Cua<Integer>();

        cueta.afegir(1);
        cueta.afegir(2);
        cueta.afegir(3);
        cueta.afegir(4);
        cueta.afegir(5);
        cueta.afegir(6);

        System.out.println();        
        
        System.out.println(cueta.getQuantitat());

        System.out.println(cueta.treure());




    }
}
