import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

// import presentacio2.Forma;

public class Model {

    //server API
    private static final String API="https://digimon-api.vercel.app/api/digimon";

    

    public static String retornaInfo() {
        String resposta=new String();
        try {
            //Inicialització de la URL
            URL url=new URL(API);
            //Establir punt de connexió amb la URL
            HttpURLConnection conn=(HttpURLConnection) url.openConnection();
            //Establir el tipus de connexio a efectura - GET
            conn.setRequestMethod("GET");

            System.out.println(conn.getResponseCode());

            int connexio=conn.getResponseCode();

            if (connexio==HttpURLConnection.HTTP_OK) {
                BufferedReader lector=new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String linea=new String();
                while ((linea=lector.readLine())!=null) {
                    resposta=resposta+linea;
                }
                return resposta;
            }
        } catch (Exception e) {
            System.out.println("Excepció: " + e.toString());
        }
        return "hola";
    }

    public static void salvaPartida(Partida partida){
        try{
            File arxiu = new File("partida.partida");
            System.out.println(arxiu.getAbsolutePath());

            System.out.println("Hem pogut crear l'arxiu? " + arxiu.createNewFile());

            FileOutputStream link=new FileOutputStream("partida.partida");
            ObjectOutputStream oos = new ObjectOutputStream(link);
            oos.writeObject(partida);
            oos.close();
        } catch (IOException e) {
            System.out.println("Exepció: " + e);

        }
    }
    

    public static Partida recuperaPartida(){
        Partida partida = new Partida(null);
        try{
            FileInputStream link = new FileInputStream("partida.partida");
            ObjectInputStream ois = new ObjectInputStream(link);
            partida=(Partida)ois.readObject();
            ois.close();
            return partida;

        } catch (IOException e) {
            System.out.println("Exepció: " + e);
            return new Partida(null);
        } catch (ClassNotFoundException c) {
            System.out.println("Exepció: " + c);
            return new Partida(null);
        }
    }

    public static void logPartida(String log){

    }

    public static void mostraLog(){

    }
}

