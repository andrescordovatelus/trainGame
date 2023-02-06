import java.util.Scanner;

public class TrainGame {
    
    Train train;
    Track track;
    Player user;

    public TrainGame(Train train, Track track, Player user){
        this.train = train;
        this.track = track;
        this.user = user;
    }

    public void startGame(){
        int option = 0;

        do{
            System.out.println("> What would you like to do now!");
            System.out.println("> Please select an option...");
            System.out.println("> ---------------------------------------");
            System.out.println("> 1. MoveTrain");
            System.out.println("> 2. StopTrain");
            System.out.println("> 3. SoundClackson");
            System.out.println("> 4. Exit");
            System.out.println("> ---------------------------------------");
    
            Scanner entrada = new Scanner(System.in);
    
            option = Integer.parseInt(entrada.nextLine()) ;
            System.out.println("> ---------------------------------------");
    
            switch(option){
    
                case 1: {
                    System.out.println("> The train is being operated by " + user.getName());
                    user.moveTrain();
                    break;
                }
                case 2:{
                    user.stopTrain();
                    break;
                }
                case 3:{
                    user.soundClackson();
                    break;
                }
                default :{
                    System.out.println("> Leaving game...");
                }
            }

        }while(option != 4);

    }
}
