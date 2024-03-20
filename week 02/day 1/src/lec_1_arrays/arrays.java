package lec_1_arrays;

public class arrays {

    public static void main(String[] args) {
        
        // declaration
        int arr[];
        // int[] arr;

        // allocation
        arr = new int[10];

        // initialization
        int marks[] = {91,92,93,94,95};

        // accessing elements of the array
        System.out.print("Array : ");
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" , ");
        }

        System.out.print("\nDefault Array : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" , ");
        }

        // ArrayIndexOutOfBoundsException
        // System.out.println(arr[10]);

        // for each loop
        System.out.print("\nFor Each Loop : ");
        for( int mark : marks){
            System.out.print(mark+" , ");
        }

    }
    
}
