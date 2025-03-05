public class DNIValidator {

    // Taula de lletres que corresponen als valors mod 23
    private static final char[] LLETRES_DNI = {
        'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
    };

    // Funció per validar el DNI
    public static boolean validarDNI(String dni) {
        // Comprovar que el DNI tingui exactament 9 caràcters
        if (dni == null || dni.length() != 9) {
            return false;
        }

        // Comprovar que els 8 primers caràcters siguin números
        String numPart = dni.substring(0, 8);
        char lletra = dni.charAt(8);

        if (!numPart.matches("[0-9]+")) {
            return false;
        }

        // Convertir els 8 primers caràcters a un número
        int numeroDNI = Integer.parseInt(numPart);

        // Obtenir la lletra corresponent al DNI
        char lletraCalculada = LLETRES_DNI[numeroDNI % 23];

        // Comprovar si la lletra calculada coincideix amb la lletra introduïda
        return lletra == lletraCalculada;
    }

    public static void main(String[] args) {
        // Prova de validació
        String dni = "12345678Z"; // Substitueix per qualsevol DNI que vulguis validar
        if (validarDNI(dni)) {
            System.out.println("El DNI és vàlid.");
        } else {
            System.out.println("El DNI no és vàlid.");
        }
    }
}