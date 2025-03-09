import java.util.ArrayList;
import java.util.LinkedList;

public class Client {

    private String nom;
    private String cognom;
    private String direccio;
    private boolean rebutCaixa;

    static ArrayList<Ipad> client;
    
        public Client (String nom, String cognom, String direccio){
            this.nom=nom;
            this.cognom=cognom;
            this.direccio=direccio;
            this.rebutCaixa=false;
            LinkedList<Ipad> client = new LinkedList<Ipad>();
    
        }
    
        public String getNom() {
            return nom;
        }
    
        public void setNom(String nom) {
            this.nom = nom;
        }
    
        public String getCognom() {
            return cognom;
        }
    
        public void setCognom(String cognom) {
            this.cognom = cognom;
        }
    
        public String getDireccio() {
            return direccio;
        }
    
        public void setDireccio(String direccio) {
            this.direccio = direccio;
        }
    
        public boolean isRebutCaixa() {
            return rebutCaixa;
        }
    
        public  void setRebutCaixa(boolean rebutCaixa) {
                    this.rebutCaixa = rebutCaixa;
                }
            
        @Override
        public String toString() {
            return "Client [nom=" + nom + ", cognom=" + cognom + ", rebutCaixa=" + rebutCaixa + "]";
        }
    
        public static ArrayList<Ipad> enviarCaixes(LinkedList<ArrayList<Ipad>> caixaDeCaixes, Client c){
            ArrayList<Ipad> caixaClient;
            caixaClient = caixaDeCaixes.poll();
    
            client = caixaClient;

            c.setRebutCaixa(true);
        System.out.println("S'ha enviat la capsa " + caixaClient + " al client " + c.getNom());

        return caixaClient;
   
        

        }
   
        public static void mostrarClientsQueHanRebutCaixa(){
            for(int i = 0; i<client.size(); i++){
                
                c = client.get(i);
                if()
            }
        }

    }

