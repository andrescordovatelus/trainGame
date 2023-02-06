public class Player {
    private String name;
    private int age;
    private boolean license;
    private Train train;

    public Player(String name, int age, boolean license, Train train){
        this.name = name;
        this.age = age;
        this.license = license;
        this.train = train;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getLicense(){
        return license;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLicense(boolean license) {
        this.license = license;
    }

    //--------------------------------------
    public void moveTrain(){
        train.accelerate();
    }

    public void stopTrain(){
        train.stop();
    }

    public void soundClackson(){
        train.soundClackson();
    }
    //--------------------------------------

    public void getUserInformation(){
        if(license == true){
            System.out.println("> Driver " + name + " and is " + age + " years old and has a license.");
        }
        else{
            System.out.println("> Driver " + name + " and is " + age + " years old and doesn't have a license.");
        }
    }
}
