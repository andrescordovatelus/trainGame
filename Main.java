public class Main {
    
    public static void  main(String[] args) {
        
        // Defining the variables.
        Track track = new Track(100);
        User user =  new User("Andres", 21, false);
        MainBagoon mainBagoon = new MainBagoon(100.0, 2, 100);
        Train train = new Train(mainBagoon);

        //Calling the methods.
        track.getLenght();
        user.getUserInformation();
        mainBagoon.torqueForce();

        user.accelerate();

        // Calling the game
        TrainGame game = new TrainGame(train, track, user);
        game.startGame();
    }
}
