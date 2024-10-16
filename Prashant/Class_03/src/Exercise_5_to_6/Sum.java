package Exercise_5_to_6;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner out=new Scanner(System.in);

        System.out.println("Enter your First no :");
        int num1 = out.nextInt();

        System.out.println("Enter your Second no :");
        int num2 = out.nextInt();

        int sum=num1+num2;
        System.out.println("Sum of Two Numbers is:"+sum);



    }
}
