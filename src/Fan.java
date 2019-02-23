public class Fan {

    private String name;

    public String getName() {
        return name;
    }

    public Fan(){
        System.out.println("The Fan constructor is called");
    }

    public Fan(String name){
        System.out.println("The Fan parameterized constructor is called");
        this.name = name;
    }

    public void switchOn(){
        System.out.println("Switching On the fan");
    }
}
