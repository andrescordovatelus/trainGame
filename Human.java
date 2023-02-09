import java.util.Scanner;

public class Human extends Player {

    public Human(String name, int age, int id) {
        super(name, age, id);
    }

    @Override
    public int getOption() {
        int option = 0;
        Scanner scaner = null;
        try {
            scaner = new Scanner(System.in);
            option = scaner.nextInt();

        } catch (Exception e) {
            if (scaner != null) {
                scaner.close();
            }
        }
        return option;
    }
}
