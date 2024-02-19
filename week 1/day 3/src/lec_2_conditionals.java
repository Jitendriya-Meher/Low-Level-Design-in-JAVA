import java.util.Scanner;

public class lec_2_conditionals {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your income : ");
        long income = sc.nextLong();

        // if else if statement

        if( income > 100000 ) {
            System.out.println("Main Amer Hu");
        }
        else if( income > 10000){
            System.out.println("Main Amer nahi hu");
        }
        else{
            System.out.println("Main Gareeb hu");
        }

        // if else statement 

        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        if( age > 18){
            System.out.println("You are eligible for voting");
        }
        else{
            System.out.println("You are not eligible for voting");
        }

        // if statement

        if( age > 100){
            System.out.println("you are dead");
        }

        // ternary operator
        System.out.println( (age<20) ? "You are a teenager" : "You are not a teenager" );

        // nested if else
        if( age > 18){
            if( age > 100){
                System.out.println("You are already dead?"); 
            }
            else{
                System.out.println("you can vote now");
            }
        }
        else{
            if( age < 0){
                System.out.println("you are not born yet");
            }
            System.out.println("you cannot vote for now");
        }

        // switch case statement
        System.out.println("switch case");

        System.out.print("Enter the day number : ");
        int day = sc.nextInt();

        switch( day){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("tuesday");
                break;
            case 3 :
                System.out.println("wednesday");
                break;
            case 4 :
                System.out.println("thursday");
                break;
            case 5 :
                System.out.println("friday");
                break;
            case 6 :
                System.out.println("saturday");
                break;
            case 7 :
                System.out.println("sunday");
                break;
            default :
                System.out.println("enter a valid day");
                break;
        }

        sc.close();
    }
    
}
