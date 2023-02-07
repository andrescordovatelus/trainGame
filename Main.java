public class Main {
    
    public static void  main(String[] args) {
        
        // Calling the game
        TrainGame game = new TrainGame();
        game.setup();
        game.startGame();
        game.statistics();
    }
}