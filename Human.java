import java.util.Scanner;

public class Human extends Player {

    public Human(String name, int age, int id) {
        super(name, age, id);
    }
    
    @Override
    public int getOption(){

        int option = 0;
        Scanner scaner = new Scanner(System.in);
        option = scaner.nextInt();
        return option;
    }
}
