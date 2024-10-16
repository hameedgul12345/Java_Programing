package Challenges;

import java.util.Scanner;

public class UserInputs {
    public static void main(String[] args) {
        Scanner out= new Scanner(System.in);
        System.out.println("Ennter Your Name");
        String name = out.nextLine();
        System.out.println("Hi"+name);
    }
}
