import java.util.Scanner;

public class RelationalOperators {
    public static void main(String[] args) {
          // Licence issue System
//        Scanner inPut=new Scanner(System.in);
//        System.out.println("Enter Your Age:");
//        int age=inPut.nextInt();
//        if(age>=18){
//            System.out.println("Eligible");
//        }
//        else {
//            System.out.println("Not Eligible");
//        }
// BRT Ticket Relaxation Syste
        Scanner inPut=new Scanner(System.in);
        System.out.println("Enter Your Age:");
        int age=inPut.nextInt();
        System.out.println("Enter Your Gender");
        String gender=inPut.nextLine();
        if ((age >= 60 || age <= 5) && gender="Female")) {
            System.out.println("You meet the conditions.");
        } else {
            System.out.println("You do not meet the conditions.");
        }
    }
}
