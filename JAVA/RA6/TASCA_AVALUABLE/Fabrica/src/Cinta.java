
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Cinta {

    
    public static void afegirProducte(Queue<Ipad> queue, LinkedList<Ipad> iPads) {
        while (!iPads.isEmpty()) { // Mentre hi hagi iPads a la llista
            Ipad ip = iPads.pollFirst(); // Treure el primer iPad de la llista
            if (ip != null) { // Comprovar que l'iPad no sigui null
                queue.add(ip); // Afegir l'iPad a la cua
                System.out.println("S'ha afegit: " + ip);
            }
        }
    }


    public static void processarProducte(Queue<Ipad> cua, Queue<Ipad> cua2, Deixalleria deixalleria) {
        while (!cua.isEmpty()) { // Mentre hi hagi iPads a la cua
            int prob = (int)(Math.random() * 10) + 1; // Generar un número aleatori entre 1 i 10

            Ipad ip = cua.poll(); // Treure el primer iPad de la cua

            if (ip != null) { // Comprovar que l'iPad no sigui null
                if (prob == 2) { // Si el número aleatori és 2, hi ha un fallo
                    System.out.println("FALLO CICLE1");
                    System.out.println("FALLO CICLE2");
                    System.out.println("FALLO CICLE3");
                    System.out.println("FALLO CICLE4");
                    System.out.println("FALLO CICLE5");

                    ip.setDefectuos(true); // Marcar l'iPad com a defectuós
                    System.out.println("S'ha processat PERO ha fallat ara està defectuós: " + ip);
                    System.out.println("Passa a la deixalleria");

                    deixalleria.afegirProducteDefectuos(ip); // Afegir l'iPad defectuós a la deixalleria
                } else { // Si no hi ha fallo
                    ip.setCircuits_integrat(true); // Marcar els circuits integrats com a completats
                    cua2.add(ip); // Afegir l'iPad a la següent cua
                    System.out.println("S'ha processat l'iPad, passa a la cinta següent. \n" + ip);
                }
            } else {
                System.out.println("Error: S'ha intentat processar un iPad null."); // Missatge d'error
            }
        }
        System.out.println("No hi ha més productes per processar a aquesta cua."); // Missatge final
    }

    public static void processarProducte2(Queue<Ipad> cua, Queue<Ipad> cua2, Deixalleria deixalleria) {
        while (!cua.isEmpty()) { // Mentre hi hagi iPads a la cua
            int prob = (int)(Math.random() * 10) + 1; // Generar un número aleatori entre 1 i 10

            Ipad ip = cua.poll(); // Treure el primer iPad de la cua

            if (ip != null) { // Comprovar que l'iPad no sigui null
                if (prob == 2) { // Si el número aleatori és 2, hi ha un fallo
                    System.out.println("FALLO CICLE1");
                    System.out.println("FALLO CICLE2");
                    System.out.println("FALLO CICLE3");
                    System.out.println("FALLO CICLE4");
                    System.out.println("FALLO CICLE5");

                    ip.setDefectuos(true); // Marcar l'iPad com a defectuós
                    System.out.println("S'ha processat PERO ha fallat ara està defectuós: " + ip);
                    System.out.println("Passa a la deixalleria");

                    deixalleria.afegirProducteDefectuos(ip); // Afegir l'iPad defectuós a la deixalleria
                } else { // Si no hi ha fallo
                    ip.setPantalla(true); // Marcar els circuits integrats com a completats
                    cua2.add(ip); // Afegir l'iPad a la següent cua
                    System.out.println("S'ha processat l'iPad, passa a la cinta següent. \n" + ip);
                }
            } else {
                System.out.println("Error: S'ha intentat processar un iPad null."); // Missatge d'error
            }
        }
        System.out.println("No hi ha més productes per processar a aquesta cua."); // Missatge final
    }

    public static void processarProducte3(Queue<Ipad> cua, Queue<Ipad> cua2, Deixalleria deixalleria) {
        while (!cua.isEmpty()) { // Mentre hi hagi iPads a la cua
            int prob = (int)(Math.random() * 10) + 1; // Generar un número aleatori entre 1 i 10

            Ipad ip = cua.poll(); // Treure el primer iPad de la cua

            if (ip != null) { // Comprovar que l'iPad no sigui null
                if (prob == 2) { // Si el número aleatori és 2, hi ha un fallo
                    System.out.println("FALLO CICLE1");
                    System.out.println("FALLO CICLE2");
                    System.out.println("FALLO CICLE3");
                    System.out.println("FALLO CICLE4");
                    System.out.println("FALLO CICLE5");

                    ip.setDefectuos(true); // Marcar l'iPad com a defectuós
                    System.out.println("S'ha processat PERO ha fallat ara està defectuós: " + ip);
                    System.out.println("Passa a la deixalleria");

                    deixalleria.afegirProducteDefectuos(ip); // Afegir l'iPad defectuós a la deixalleria
                } else { // Si no hi ha fallo
                    ip.setEmbalatges_individuals(true);// Marcar els circuits integrats com a completats
                    cua2.add(ip); // Afegir l'iPad a la següent cua
                    System.out.println("S'ha processat l'iPad, passa a la cinta següent. \n" + ip);
                }
            } else {
                System.out.println("Error: S'ha intentat processar un iPad null."); // Missatge d'error
            }
        }
        System.out.println("No hi ha més productes per processar a aquesta cua."); // Missatge final
    }

}
