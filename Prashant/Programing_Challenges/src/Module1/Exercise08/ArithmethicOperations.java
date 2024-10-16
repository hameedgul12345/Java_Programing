package Module1.Exercise08;

import java.util.Scanner;

public class ArithmethicOperations {
    public static void main(String[] args) {
        Scanner inPut=new Scanner(System.in);
        System.out.println("Enter Two Numbers:");
        int num1=inPut.nextInt();
        int num2=inPut.nextInt();
        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println(num1/num2);
        System.out.println(num1%num2);


    }
}
