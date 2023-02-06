public class Main {
    
    public static void  main(String[] args) {
        
        // Defining the variables.
        Track track = new Track(100);
        MainBagoon mainBagoon = new MainBagoon(100.0, 2, 200);
        Train train = new Train(mainBagoon, track);
        Player user =  new Player("Andres", 21, false, train);

        // Calling the game
        TrainGame game = new TrainGame(train, track, user);
        game.startGame();
    }
}
