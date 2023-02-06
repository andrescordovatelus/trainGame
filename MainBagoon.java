public class MainBagoon extends Bagoons{
    
    public int enginePower;

    public MainBagoon(Double maxWeight, int nBagoons, int enginePower){
        super(maxWeight, nBagoons);
        this.enginePower = enginePower;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public void torqueForce(){
        System.out.println("> Torque force is " + (enginePower - (nBagoons * 5)));
    }

    public void accelerate(){
        System.out.println("> The train is acelerating at " + (enginePower - (nBagoons * 5)) + " km/h");
    }

    public void stop(){
        System.out.println("> The train is braking at " + (enginePower + (nBagoons * 5)) + " km/h");
    }

    public void soundClackson(){
        System.out.println("> Clackson sound");
    }
}
