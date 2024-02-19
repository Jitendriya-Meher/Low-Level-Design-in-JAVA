//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        
        // boolean
        boolean found = false;
        System.out.print("found = ");
        System.out.println(found);
        // found = 1; // error
        found = true;
        System.out.print("found = ");
        System.out.println(found);

        // character
        char ch = '~';
        System.out.print("ch = ");
        System.out.println(ch);
        ch = 'j';
        System.out.print("ch = ");
        System.out.println(ch);

        // integers -> byte , short , int, long
        byte marks = 125;
        System.out.print("marks = ");
        System.out.println(marks);

        // short 
        short marks2 = 20000;
        System.out.print("marks2 = ");
        System.out.println(marks2);

        int marks3 = 100000;
        System.out.print("marks3 = ");
        System.out.println(marks3);

        long marks4 = 10000000000000L;
        System.out.print("marks4 = ");
        System.out.println(marks4);

        // float 
        float number = 123.14161234f;
        System.out.print("number = ");
        System.out.println(number);

        double number2 = 123.14161234;
        System.out.print("number2 = ");
        System.out.println(number2);

        // conversion
        byte conv1 = (byte)1234;
        System.out.print("conv1 = ");
        System.out.println(conv1);

    }
}