public class TrainGame {
    
    Train train;
    Track track;
    User user;

    public TrainGame(Train train, Track track, User user){
        this.train = train;
        this.track = track;
        this.user = user;
    }

    public void startGame(){
        System.out.println("> Welcome to the train game!");
        System.out.println("> You are driving a train with " + train.mainBagoon.nBagoons + " bagoons and a main bagoon with " + train.mainBagoon.enginePower + " engine power in a track with" + track.lenght + " meters");
    }
}
