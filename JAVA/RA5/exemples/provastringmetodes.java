public class provastringmetodes{

    public static void main(String[] args) {
        String[] mat;

        String linia = "\"Nom\", 8.8";
        String linia2 = "\"Nom\", 7.7";
        String linia3 = "\"Nom\", 4.9";


        
        
        

        mat=linia.split(",");
        mat[0]=mat[0].substring(1,mat[0].length()-1);
        mat[1]=mat[1].substring(1);
        System.out.println(mat[0]);
        System.out.println(mat[1]);

        double nota = Double.parseDouble(mat[1]);
        System.out.println(nota);

    }

}
