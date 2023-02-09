public class TrainGame {

    private Player player;
    private Train train;
    private Track track;

    public void setup() {
        player = new Computer("Andres", 21, 1);
        train = new Train(new MainBagoon(16), 'O');
        train.setup();
        player.setTrain(train);
        track = new Track(30);
        track.setTrain(train);
    }

    public void startGame() {
        int option = 0;
        do{
            System.out.println("> It's your turn!");
            track.paint();
            System.out.println("\n> ---------------------------------");
            System.out.println("> 1. MoveTrain.");
            System.out.println("> 2. StopTrain.");
            System.out.println("> 3. Clakson.");
            System.out.println("> 4. Exit.");
            System.out.println("> ---------------------------------");

            option = player.getOption();
            System.out.println("> ---------------------------------");

            switch(option){
                case 1:{
                    player.moveTrain();
                    break;
                }
                case 2:{
                    player.stopTrain();
                    break;
                }
                case 3:{
                    player.soundClackson();
                    break;
                }
                default:{
                    System.out.println("> Leaving game...");
                }
            }

        }while(option != 4);
    }

    public void statistics() {
        System.out.println("Thank you for playing.");
        track.paint();
    }
    
    
}
