package Module1.Exercise08;

import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter Your First No:");
        int no1=input.nextInt();
        System.out.println("Enter Your First No:");
        int no2=input.nextInt();

        System.out.println("Before");
        System.out.println(no1+" "+no2);
        int tem;
        tem=no1;
        no1=no2;
        no2=tem;
        System.out.println("Before");
        System.out.println(no1+" "+no2);

    }
}
