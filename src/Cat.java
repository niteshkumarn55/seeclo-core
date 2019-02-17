import java.util.Scanner;

public class Cat {

    private  String name;
    private  int age;
    private  String color;


    public void setAge(int age){
        if(age<1){
            this.age  = 1;
        }else{
            this.age = age;
        }

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void sleep(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (scanner.hasNextInt())
        {
            // Read an int value
            int num = scanner.nextInt();
            sum += num;
        }

        System.out.println(sum);
        System.out.println("Cat is sleeping");
    }

    public void run(){
        System.out.println("cat is running");
    }

    public void eat(String food){
        System.out.println("cat is having "+food);
    }


    public static void main(String[] args){
     /*   Cat c1=new Cat();
        c1.name = "ramu";
        c1.age = 1;
        c1.color = "brown";

        System.out.println(c1.name);
        System.out.println(c1.color);
        System.out.println(c1.age);

        c1.sleep();
        c1.run();
        c1.eat("milk");

        System.out.println("---------------");

        Cat c2 = new Cat();
        c2.name = "samu";
        c2.color = "black";
        c2.age = -5;
//        c2.setAge(5);

        System.out.println(c2.name);
        System.out.println(c2.color);
        System.out.println(c2.age);
        c2.eat("bones");*/

        Cat c3 = new Cat();
        c3.sleep();


    }
}
