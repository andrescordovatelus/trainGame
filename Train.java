public class Train {

    private MainBagoon mainBagoon;
    private Bagoons[] bagoons = new Bagoons[5];
    private char trainCharacter;
    private int position;

    public Train(MainBagoon mainBagoon, char trainCharacter) {
        this.mainBagoon = mainBagoon;
        this.trainCharacter = trainCharacter;
    }

    public void setup(){
        position = 0;
        bagoons[0] = new PassengerBagoon(2);
        bagoons[1] = new PassengerBagoon(2);
        bagoons[2] = new PassengerBagoon(2);
        bagoons[3] = new PassengerBagoon(2);
        bagoons[4] = new PassengerBagoon(2);
    }

    public void accelerate() {
        int totalAccelerate = mainBagoon.getMotorForce() - getTotalSlowDown();
        position += totalAccelerate;
        System.out.println("We are movings... " + totalAccelerate);
    }

    private int getTotalSlowDown() {
       int totalSlowDown = 0;
       for (int i = 0; i < bagoons.length; i++) {
            totalSlowDown += bagoons[i].getSlowDown();
       }
       return totalSlowDown;
    }

    public void stop() {
        System.out.println("You are braking...");
    }

    public void clakson() {
        System.out.println("The clackson has sounded...");
    }
    
    public int getPosition(){
        return this.position;
    }

    public String getCharacter(){
        String representation = "";
        for (int i = 0; i < bagoons.length; i++) {
            representation += "o";
        }
        representation += this.trainCharacter;
        return representation;
    }
}
