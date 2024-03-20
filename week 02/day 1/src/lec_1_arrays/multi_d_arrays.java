package lec_1_arrays;

public class multi_d_arrays {

    public static void main(String[] args) {

        // 2d arrays
        int arr[][] = new int[3][3];

        // initialize arrays
        int arr2[][] = {
            {1,2,3},
            {2,3,4},
            {3,4,5},
            {8,9,0}
        };

        System.out.println("Default Array: ");
        for( int i = 0; i < arr.length; i++){
            for( int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("Array: ");
        for( int i = 0; i < arr2.length; i++){
            for( int j=0; j<arr2[0].length; j++){
                System.out.print(arr2[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("For-each Array: ");
        for(int[] temp: arr2){
            for( int num: temp){
                System.out.print(num+" ");
            }
            System.out.println();
        }

        int sum =0;
        int i=0;

        for(int[] temp: arr2){
            int currSum = 0;
            for( int num: temp){
                currSum += num;
            }
            System.out.println("sum of "+(i+1)+" row is "+ currSum);
            i++;
            sum += currSum;
        }
        System.out.println("overall sum = "+sum);
        
    }
    
}
