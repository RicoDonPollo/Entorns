package joc_medieval;
public class App {
    public static void main(String[] args) throws Exception {
        // Personatge p1= new Personatge(40, 50, 4, 110);
        Huma h1 = new Huma(100, 100, 100, 90);
        // Elf e1 = new Elf(100, 43, 100, 43);
        // Nan n1=new Nan(99, 60, 100, 100);
        // MigElf me1=new MigElf(43, 50, 100, 80);
        
        System.out.println(h1.toString());
        h1.malPersonatge();
        System.out.println();
        // System.out.println(p1.toString());
        // System.out.println();
        // System.out.println(e1.toString());
        // e1.malPersonatge();
        // System.out.println();
        // System.out.println(n1.toString());
        // n1.malPersonatge();
        // System.out.println();
        // System.out.println(me1.toString());
        // me1.malPersonatge();
        System.out.println();


        // ObjectesActivacio oa1 = new ObjectesActivacio("Poccio petita", "Magia", 5, 100);
        
        h1.usObjecteActivacio(h1);

        System.out.println(h1.toString());
        h1.malPersonatge();

        //=====ARMES=====//

        Arma basto = new Arma("basto", "magia", 1, 2, 1);
        // Arma espasa = new Arma("espasa", "força", 2, 5,3);
        // Arma arco = new Arma("arco", "agilitat", 5, 7,4);
        // Arma pistola = new Arma("pistola", "força", 1, 10,5);

        // //=====POCIONS=====//

        // ObjectesActivacio pocio1 = new ObjectesActivacio("pocio I", "cura", 10, 5);
        // ObjectesActivacio pocio2 = new ObjectesActivacio("pocio II", "cura", 20, 5);
        // ObjectesActivacio pocio3 = new ObjectesActivacio("pocio III", "cura", 30, 5);
        // ObjectesActivacio pocio4 = new ObjectesActivacio("pocio IV", "cura", 50, 5);
        // ObjectesActivacio pocio5 = new ObjectesActivacio("pocio V", "cura", 99, 5);



        // //=====VERI=====//

        // ObjectesActivacio veri1 = new ObjectesActivacio("veri I", "veri", 10, 5);
        // ObjectesActivacio veri2 = new ObjectesActivacio("veri II", "veri", 15, 5);
        // ObjectesActivacio veri3 = new ObjectesActivacio("veri III", "veri", 20, 5);
        // ObjectesActivacio veri4 = new ObjectesActivacio("veri IV", "veri", 25, 5);
        // ObjectesActivacio veri5 = new ObjectesActivacio("veri V", "veri", 30, 5);

        h1.entraObjecte(basto);
        h1.toStringInventari();


    }




    
}
