package lec_1_arrays;

public class practice {
    
    public static void main(String[] args) {
        
        int arr[] = {-10,10,20,30,40};

        // sum and multipication of array
        int sum = 0;
        long mul = 1;
        for( int it : arr){
            sum += it;
            mul *= it;
        }

        System.out.println("sum = " + sum);
        System.out.println("multipication = " + mul);

        // minimum and maximum values in an array
        int min = arr[0];
        int max = arr[0];
        
        for( int num : arr){
            if( num > max){
                max = num;
            }
            if( num < min ){
                min = num;
            }
        }

        System.out.println("min value of integer = " + Integer.MIN_VALUE);
        System.out.println("max value of integer = " + Integer.MAX_VALUE);

        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
}
