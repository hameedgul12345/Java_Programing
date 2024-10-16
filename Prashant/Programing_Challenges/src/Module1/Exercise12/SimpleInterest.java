package Module1.Exercise12;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("Welcome to Simplo Interest Calculater");
        Scanner inPut=new Scanner(System.in);
        System.out.println("Principle Amount");
        int p=inPut.nextInt();
        System.out.println("Rate of Interest");
        float rate = inPut.nextFloat();
        System.out.println("How many years do want borrow");
        float t=inPut.nextFloat();
        float interest=(p*rate*t)/100;
        System.out.println(interest);
    }
}
