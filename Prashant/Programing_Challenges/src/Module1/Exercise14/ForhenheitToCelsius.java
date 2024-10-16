package Module1.Exercise14;

import java.util.Scanner;

public class ForhenheitToCelsius {
    public static void main(String[] args) {
        System.out.println("Welcome to Temprature Convertor");
        Scanner inPut=new Scanner(System.in);
        System.out.println("Enter Your Tep in F");
        float forh=inPut.nextFloat();
        float cel=(forh-32)*5/9;
        System.out.println(cel);

    }
}
