package lec_2_methods;

public class methodBasics {

    public static void main(String[] args) {
        callMyName();
        int sum1 = getSum(101,20);
        System.out.println("sum = " + sum1);
        callMyName("Amit Meher");
    }

    public static void callMyName() {
        System.out.println("Jitendriya Meher");
    }

    public static void callMyName( String s) {
        System.out.println(s);
    }
    
    public static int getSum(int a, int b){
        int sum = a+b;
        return sum;
    }
    
}
