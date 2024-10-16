package Module1.Exercise13;

import java.util.Scanner;

public class CopundInterest {
    public static void main(String[] args) {
        System.out.println("Welcome to Compund Interest Calculater");
        Scanner inPut=new Scanner(System.in);
        System.out.println("Principle Amount");
        int p=inPut.nextInt();
        System.out.println("Rate of Interest");
        float rate = inPut.nextFloat();
        System.out.println("How many years do want borrow");
        float t=inPut.nextFloat();
        double interest=p*Math.pow((1+rate/100),t);
        System.out.println(interest);
    }
}
