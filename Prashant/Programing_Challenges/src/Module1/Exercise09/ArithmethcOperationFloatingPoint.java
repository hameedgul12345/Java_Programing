package Module1.Exercise09;

import java.util.Scanner;

public class ArithmethcOperationFloatingPoint {
    public static void main(String[] args) {
        Scanner inPut=new Scanner(System.in);
        System.out.println("Enter Two Numbers:");
        float num1=inPut.nextFloat();
        float num2=inPut.nextFloat();
        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println(num1/num2);
        System.out.println(num1%num2);
    }
}
