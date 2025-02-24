public class CartaDigi{

    private String nom;
    private String nivell;
    private int poder;

    public CartaDigi(String nom, String nivell){
        this.nom=nom;
        this.nivell=nivell;
        this.poder=assignaPoder(nivell);
    }

    private int assignaPoder(String nivell){

        switch (nivell){
            case "In Training":
                return ((int)(Math.random()*40)+0);
            case "Rookie":
                return ((int)(Math.random()*40)+10);
            case "Fresh":
                return ((int)(Math.random()*40)+20);
            case "Champion":
                return ((int)(Math.random()*40)+30);
            case "Ultimate":
                return ((int)(Math.random()*40)+40);
            case "Armor":
                return ((int)(Math.random()*40)+50);
            case "Mega":
                return ((int)(Math.random()*40)+60);
            default:
                return 0;
        }
    }

    public int getPoder(){
        return this.poder;
    }

    public boolean guanya(CartaDigi rival){
        return this.poder>=rival.getPoder();
    }

    public String toString(){
        return "Nom: "+this.nom+"\nNivell: "+nivell+"\nPoder: "+poder;
    }

}
