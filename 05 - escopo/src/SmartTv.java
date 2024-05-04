public class SmartTv {
    boolean ligada = false;
    int canal=1;
    int volume =25;


    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void diminuirCanal(){
        //volume = volume -1;
        canal--;
        System.out.println("Diminuindo o canal para " + canal);
    }

    public void aumentarCanal(){
        //volume = volume +1;
        canal++;
        System.out.println("Aumnetando o canal para" + canal);
    }

    public void aumentarVolume(){
        //volume = volume +1;
        volume++;
        System.out.println("Aumnetando o volume para" + volume);
    }

    public void diminuirVolume(){
        //volume = volume -1;
        volume--;
        System.out.println("Diminuindo o volume para " + volume);
    }

public void ligar(){
    ligada = true;
}

}
