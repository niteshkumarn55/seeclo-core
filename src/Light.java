public class Light {

    public int cost = 2000;
    public String color = "Yellow";
    public int lenght = 30;
    public int width = 20;

    public void switchOn(){
        System.out.println("Switching on of the light");
    }

    public void switchOff(){
        System.out.println("switches off the light");
    }

    public  static void main(String[] agrs){
        Light l1 = new Light();
        l1.cost = 200;
        l1.color = "Green";
        l1.lenght = 20;


        System.out.println(l1.cost);
        System.out.println(l1.color);
        System.out.println(l1.lenght);
        System.out.println(l1.width);
        l1.switchOn();
        l1.switchOff();

        System.out.println("-----------------------------");
        Light l2 = new Light();
        l2.cost = -1000;
        l2.color = "Yellow";
        l2.lenght = 25;
        l2.width = 10;
        System.out.println(l2.cost);
        System.out.println(l2.color);
        System.out.println(l2.lenght);
        System.out.println(l2.width);
        l2.switchOn();
        l2.switchOff();
        System.out.println("----------------------");
        Light l3 = new Light();

        System.out.println(l3.cost);
        System.out.println(l3.color);
        System.out.println(l3.lenght);
        System.out.println(l3.width);
        l3.switchOn();
        l3.switchOff();


    }

}
