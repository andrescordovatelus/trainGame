public class User extends UserActions{
    private String name;
    private int age;
    private boolean license;

    public User(String name, int age, boolean license){
        super(100.00, 1, 100);
        this.name = name;
        this.age = age;
        this.license = license;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getLicense(){
        return license;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLicense(boolean license) {
        this.license = license;
    }

    public void getUserInformation(){
        if(license == true){
            System.out.println("> Driver " + name + " and is " + age + " years old and has a license.");
        }
        else{
            System.out.println("> Driver " + name + " and is " + age + " years old and doesn't have a license.");
        }
    }
}
