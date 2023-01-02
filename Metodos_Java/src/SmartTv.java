public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume=25;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        //volume = volume +1; OU
        volume++;
        System.out.println("Aumentando o volume para: " +volume);
    }

    public void diminuirVolume(){
        //volume = volume -1; OU
        volume--;
        System.out.println("Diminuindo o volume para: " +volume);
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        //canal = canal +1; OU
        canal++;
        System.out.println("Aumentando canal para: " +canal);
    }

    public void diminuirCanal(){
        //canal = Canal -1; OU
        canal--;
        System.out.println("Diminuindo canal para: " +volume);
    }
}