public class Train {
    
    MainBagoon mainBagoon;
    Track track;

    public Train(MainBagoon mainBagoon, Track track){
        this.mainBagoon = mainBagoon;
        this.track =  track;
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
