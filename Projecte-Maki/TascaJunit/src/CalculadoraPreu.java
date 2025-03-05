
public class CalculadoraPreu {

    public static double calcularPreuFinal(double preuBase, boolean aplicaDescompte, boolean aplicaImpost) {
        double preuFinal = preuBase;

        // Aplicar descompte
        if (aplicaDescompte) {
            preuFinal = preuBase - (preuBase * 0.10);  // Descompte del 10%
        }

        // Aplicar impost
        if (aplicaImpost) {
            preuFinal = preuFinal + (preuFinal * 0.21);  // Impost del 21%
        }

        // Si el preu és massa baix, s'afegeix un cost mínim
        if (preuFinal < 5) {
            preuFinal = 5;
        }

        return preuFinal;
    }

    public static void main(String[] args) {
        System.out.println("S'ha de provar el mètode");

    }
}