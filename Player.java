public abstract class Player {
    
    private String name;
    private int age;
    private int id;
    private Train train;

    public Player(String name, int age, int id){
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Player [name=" + name + ", age=" + age + ", id=" + id + "]";
    }

    public void setTrain(Train train){
        this.train = train;
    }

    public void moveTrain(){
        train.accelerate();
    } 

    public void stopTrain(){
        train.stop();
    }

    public void soundClackson(){
        train.clakson();
    }

    public abstract int getOption();
}
