import java.util.Date;
import java.util.Scanner;

public class Jugador{

    private String nom;
    private CartaDigi[] ma;
    private CartaDigi[] descartat;
    private int combats;
    private int rondes;

    public Jugador(String nom, CartaDigi[] ma){
        this.nom=nom;
        this.ma=ma;
        this.descartat=new CartaDigi[ma.length];
        this.rondes=0;
        this.combats=0;
    }

    public CartaDigi triaCarta() {

        Scanner teclat=new Scanner(System.in);
        while (true) {
            System.out.println("TRIA UNA CARTA DE LA TEVA MA");
            int seleccio;
            int disponibles = 0;
            for (int i = 0; i < ma.length; i++) {
                if (ma[i] != null) {
                    disponibles++;
                    System.out.println("Carta num: " + i);
                    System.out.println(ma[i].toString());
                }
            }
            if (disponibles > 0) {
                System.out.println("Tria la carta num: ");
                seleccio = teclat.nextInt();
                teclat.reset();
                if (seleccio >= 0 && seleccio < ma.length) {
                    if (ma[seleccio] != null) {
                        descartat[seleccio] = ma[seleccio];
                        ma[seleccio] = null;
                        System.out.println("L'USUARI HA TRIAT: \n" + descartat[seleccio].toString());
                        return descartat[seleccio];
                    }
                }
            } else iniciaRonda();
        }
    }

    public CartaDigi triaCartaMaq() {

            while (true) {
                int seleccio = (int) (Math.random() * ma.length);
                if (ma[seleccio] != null) {
                    descartat[seleccio] = ma[seleccio];
                    ma[seleccio] = null;
                    System.out.println("LA MAQUINA HA TRIAT: \n" + descartat[seleccio].toString());
                    return descartat[seleccio];
                }
                this.iniciaRonda();
            }
    }

    private void iniciaRonda() {

            this.combats=0;
            for (int i = 0; i < ma.length; i++) {
                if (ma[i] == null) {
                    ma[i] = descartat[i];
                    descartat[i] = null;
                }
            }
        }

    public void guanyaRonda(){
        rondes++;
    }

    public int getRondes(){
        return this.rondes;
    }

    public void guanyaCombat(){
        combats++;
    }

    public int getCombats(){
        return this.combats;
    }
}
