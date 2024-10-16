package Exercise_5_to_6;

import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Scanner out=new Scanner(System.in);
        System.out.println("Enter your name please :");
        String name = out.nextLine();
        System.out.println("Welcome dear "+name);
    }
}
