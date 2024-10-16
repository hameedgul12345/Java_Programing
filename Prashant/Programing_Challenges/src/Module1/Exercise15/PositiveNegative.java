package Module1.Exercise15;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner inPut=new Scanner(System.in);
        System.out.println("Enter Number");
        int no=inPut.nextInt();
        if(no>0){
            System.out.println("The no is Positive");
        }
        else {
            System.out.println("The no is Negative");
        }
    }
}
