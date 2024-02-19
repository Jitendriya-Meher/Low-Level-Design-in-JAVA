public class main {
    public static void main(String[] args) {

        // arithmetic operators
        System.out.println("arithmetic operators");
        System.out.println(5+7);        
        System.out.println(5-7);
        System.out.println(5*7);
        System.out.println(5/7);
        System.out.println(7%5);

        // relational operators
        System.out.println("relational operators");
        System.out.println(5>6);
        System.out.println(5<6);
        System.out.println(5<=6);
        System.out.println(5>=6);
        System.out.println(5==5);
        System.out.println(5!=5);

        // logical operators
        System.out.println("logical operators");
        boolean logic1 = false;
        boolean logic2 = true;
        System.out.println(logic1&&logic2);
        System.out.println(logic1||logic2);
        System.out.println(!logic1);

        // assignment operators
        int age = 12;
        System.out.println("age  = " + age);
        age+=5;
        System.out.println("age  = " + age);
        age-=5;
        System.out.println("age  = " + age);
        age*=5;
        System.out.println("age  = " + age);
        age/=5;
        System.out.println("age  = " + age);
        age%=2;
        System.out.println("age  = " + age);

        // unary operators
        // increment and decrement
        int a = 5;
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(--a);
        System.out.println(a--);
        System.out.println(a);

    }    
}