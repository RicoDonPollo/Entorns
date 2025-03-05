public class ParSenar {

    public static String verificarParSenar(int numero) {
        if (numero % 2 == 0) {
            return "Par";
        } else {
            return "Senar";
        }
    }

    public static void main(String[] args) {
        System.out.println(verificarParSenar(4)); // Ha de retornar "Par"
        System.out.println(verificarParSenar(7)); // Ha de retornar "Senar"
    }
}