package lec_3_strings;

import java.util.Scanner;

public class stringBasics {
    
    public static void main(String[] args) {
        
        // string literals
        String name = "amit";
        System.out.println(name);

        // string using new keyword
        String name2 = new String("amit2");
        System.out.println(name2);

        System.out.println(name+name2);

        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        String s4 = new String("abc");
        String s5 = new String("ABC");

        // == check reference
        if( s1==s2){
            System.out.println("same 1");
        }
        else{
            System.out.println("not same 1");
        }

        if( s3==s4){
            System.out.println("same 2");
        }
        else{
            System.out.println("not same 2");
        }

        if( s1==s3){
            System.out.println("same 3");
        }
        else{
            System.out.println("not same 3");
        }

        // equals check the values
        if( s1.equals(s2)){
            System.out.println("same 4");
        }
        else{
            System.out.println("not same 4");
        }

        if( s3.equals(s4)){
            System.out.println("same 5");
        }
        else{
            System.out.println("not same 5");
        }

        if( s1.equals(s3)){
            System.out.println("same 6");
        }
        else{
            System.out.println("not same 6");
        }

        if( s1.equalsIgnoreCase(s5)){
            System.out.println("same 7");
        }
        else{
            System.out.println("not same 7");
        }

        if( s3.equalsIgnoreCase(s5)){
            System.out.println("same 8");
        }
        else{
            System.out.println("not same 8");
        }


        // string input
        // next and nextLine
        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter your name : ");
        // String n1 = sc.nextLine();

        // System.out.print("Enter your name 2 : ");
        // String n2 = sc.next();

        // System.out.println(n1+n2);

        // string methods
        String str = "Jitendriya Meher";

        System.out.println(str.length());

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(3));

        System.out.println(str.substring(2,5));
        System.out.println(str.substring(5));

        System.out.println(str.contains("ten"));
        System.out.println(str.contains("nine"));

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        System.out.println(str.trim());

        String sen = "This is my home";
        String[] words = sen.split(" ");
        for( String it : words ){
            System.out.println(it);
        }
        System.out.println(sen);

        System.out.println(sen.startsWith("This"));
        System.out.println(sen.startsWith("That"));

        System.out.println(sen.endsWith("home"));
        System.out.println(sen.endsWith("school"));

        int num = 4321;
        String numStr = String.valueOf(num);
        System.out.println(num+2);
        System.out.println(numStr+2); 

        String rep = "Love";
        System.out.println(rep);
        rep = rep.replace('o', 'i');
        System.out.println(rep);

        char chars[] = rep.toCharArray();
        for( char c : chars ){
            System.out.println(c);
        }

        String dumy = "";
        String dumy2 = "    ";

        if( dumy.isEmpty()){
            System.out.println("string is empty");
        }else{
            System.out.println("String is not empty");
        }

        if( dumy2.isEmpty()){
            System.out.println("string is empty");
        }else{
            System.out.println("String is not empty");
        }

        // if( dumy.isBlank()){
        //     System.out.println("string is blank");
        // }else{
        //     System.out.println("String is not blank");
        // }

        // if( dumy2.isBlank()){
        //     System.out.println("string is blank");
        // }else{
        //     System.out.println("String is not blank");
        // }
    }
}
