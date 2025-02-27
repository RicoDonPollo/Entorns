package ArbreBinari;

public class Main {

    public static void main(String[] args) {
        ArbreBinari arbre=new ArbreBinari(33);

        arbre.afegir(23);
        arbre.afegir(44);
        arbre.afegir(23);
        arbre.afegir(24);
        arbre.afegir(66);
        arbre.afegir(34);
        arbre.afegir(86);
        arbre.afegir(43);
        arbre.afegir(123);
        arbre.afegir(65);
        arbre.afegir(32);
        arbre.afegir(98);

        System.out.println(arbre.toString());

        arbre.cerca(4);
        arbre.cerca(86);

        arbre.imprimeixOrdenat();

    }

}
