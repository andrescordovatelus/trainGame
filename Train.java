public class Train {
    
    MainBagoon mainBagoon;

    public Train(MainBagoon mainBagoon){
        this.mainBagoon = mainBagoon;
    }

    public void accelerate(){
        mainBagoon.accelerate();
    }

    public void stop(){
        mainBagoon.stop();
    }

    public void soundClackson(){
        mainBagoon.soundClackson();
    }
}
