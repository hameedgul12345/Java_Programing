package Module1.Exercise11;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner inPut=new Scanner(System.in);
        System.out.println("Enter Height and Base");
        int H=inPut.nextInt();
        int B=inPut.nextInt();
       // double areaOfTriangle=(H*B)/2;
        double areaOfTriangle=0.5*(H*B);

        System.out.println(areaOfTriangle);
    }
}
