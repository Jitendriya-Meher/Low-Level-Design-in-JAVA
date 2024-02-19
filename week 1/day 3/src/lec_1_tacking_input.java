import java.math.BigInteger;
import java.util.Scanner;

public class lec_1_tacking_input {
    public static void main(String[] args) {
        
        // create an object of Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name : ");
        // takes input from the keyboard
        String name = input.nextLine();

        System.out.print("Enter a number : ");
        int num1 = input.nextInt();

        System.out.print("Enter a float : ");
        float f1 = input.nextFloat();

        System.out.print("Enter a big integer : ");
        BigInteger b1 = input.nextBigInteger();

        System.out.println("My name is "+name);
        System.out.println("Your name is "+num1);
        System.out.println("Your Float is "+f1);
        System.out.println("Your big interger is "+b1);


        // close the scanner
        input.close();
    }
}
