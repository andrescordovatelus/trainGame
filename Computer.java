import java.util.Random;

public class Computer extends Player{

    private int[] options = {1,2,3,4};

    public Computer(String name, int age, int id){
        super(name, age, id);
    }

    @Override
    public int getOption(){
        Random random = new Random();
        int enter = options[random.nextInt(4)];
        return enter;
    }
}