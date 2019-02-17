import java.util.Scanner;

public class FirstProgram {

    public void addCalc(int a, int b){
        int c =  a+b;
        System.out.println("The added value is "+c);
    }


    public static void main(String[] args) {
        FirstProgram f1 = new FirstProgram();
        f1.addCalc(5,5);
    }
}
