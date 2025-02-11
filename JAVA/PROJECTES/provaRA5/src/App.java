import java.io.File;



public class App {
    public static void main(String[] args) throws Exception {
       
        File arxiu = new File("test.txt");

        System.out.println("Resultat eliminació arxiu: " + arxiu.delete());
        }
}
