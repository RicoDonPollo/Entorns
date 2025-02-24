import java.time.LocalDate;

public class Partida{

    static final int MAX_MA=5;
    private CartaDigi[] baralla;
    private boolean[] triada;
    private Jugador usuari;
    private Jugador maquina;
    private int ronda;
    private int rondas=0;

    public Partida(CartaDigi[] baralla){
        this.baralla=baralla;
        this.triada=new boolean[baralla.length];
        usuari=new Jugador("Usuari",generaMa());
        maquina=new Jugador("Màquina", generaMa());
        this.ronda=0;
    }

    private CartaDigi[] generaMa(){

        CartaDigi[] ma=new CartaDigi[MAX_MA];
        boolean continua=true;

        for (int i=0;i<MAX_MA;i++){
            while (continua){
                int pos=(int)(Math.random()*baralla.length);
                if (!triada[pos]){
                    triada[pos]=true;
                    ma[i]=baralla[pos];
                    continua=false;
                }
            }
            continua=true;
        }
        return ma;
    }


    public void iniciaPartida(int rondas){

        String log=new String();
        System.out.println("Al final de cada ronda es guarda la partida automàticament.");
        this.rondas=rondas;
        this.ronda=0;
        //sempre comença el jugador
        while (this.ronda<rondas){
            System.out.println("INICI RONDA: "+this.ronda);
            if (ronda%2==0){
                iniciaRonda(this.ronda,true);
            }
            else iniciaRonda(this.ronda,false);
            ronda++;
        }

        if (usuari.getRondes()>maquina.getRondes()){
            log="LA PARTIDA L'HA GUANYAT L'USUARI "+usuari.getRondes()+" a "+maquina.getRondes();
        }
        else{
            log="LA PARTIDA L'HA GUANYAT LA MAQUINA "+maquina.getRondes()+" a "+usuari.getRondes();
        }
        Model.logPartida(log);
        System.out.println(log);
    }

    public void continuaPartida(){

        String log=new String();
        while (this.ronda<rondas){
            System.out.println("INICI RONDA: "+this.ronda);
            if (ronda%2==0){
                iniciaRonda(this.ronda,true);
            }
            else iniciaRonda(this.ronda,false);
            ronda++;
        }

        if (usuari.getRondes()>maquina.getRondes()){
            log="LA PARTIDA L'HA GUANYAT L'USUARI "+usuari.getRondes()+" a "+maquina.getRondes();
        }
        else{
            log="LA PARTIDA L'HA GUANYAT LA MAQUINA "+maquina.getRondes()+" a "+usuari.getRondes();
        }
        Model.logPartida(log);
        System.out.println(log);
    }


    private void iniciaRonda(int ronda,boolean usu){

        for (int i=0;i<5;i++){
            if (usu){
                if (primerGuanya(usuari.triaCarta(),maquina.triaCartaMaq())){
                    usuari.guanyaCombat();
                }
                else maquina.guanyaCombat();
            }
            else{
                if (primerGuanya(maquina.triaCartaMaq(),usuari.triaCarta())){
                    maquina.guanyaCombat();
                }
                else usuari.guanyaCombat();
            }
        }
        if (usuari.getCombats()>maquina.getCombats()){
            System.out.println("LA RONDA "+ (ronda+1)+" L'HA GUANYAT L'USUARI "+usuari.getCombats()+" a "+maquina.getCombats());
            usuari.guanyaRonda();
        }
        else{
            System.out.println("LA RONDA "+ (ronda+1)+" L'HA GUANYAT LA MAQUINA "+maquina.getCombats()+" a "+usuari.getCombats());
            maquina.guanyaRonda();
        }

        Model.salvaPartida(this); //autoguardat al acabar ronda
    }

    public boolean primerGuanya(CartaDigi primer, CartaDigi segon){

        System.out.println("LA CARTA QUE GUANYA ES:");
        if (primer.getPoder()>=segon.getPoder()){
            System.out.println(primer.toString());
            return true;
        }
        else{
            System.out.println(segon.toString());
            return false;
        }
    }


}
