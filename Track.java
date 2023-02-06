public class Track {
    public int lenght;

    public Track(int lenght){
        this.lenght = lenght;
    }

    public void getLenght() {
        System.out.println("> The track lenght is " + lenght + " meters.");
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }
}
