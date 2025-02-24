import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Exemple {

    public static void main(String[] args) {
        
        String enllacurl="https://rickandmortyapi.com/api/character/18";
        String resposta=new String();

        resposta=llegeixURL(enllacurl);
        System.out.println(resposta);


    }
    public static String llegeixURL(String urlpassada){
        String resposta=new String();
        try {
            //Inicialització de la URL
            URL url=new URL(urlpassada);
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

}
