public class lec_4_while_loop {

    public static void main(String[] args) {
        
        System.out.println(" 14's table");

        int i=1;

        while( i<=10){
            System.out.println("14 * " + i + " = " +(14*i));
            i++;
        }

        // nested while loop
        i=1;
        
        System.out.println(" table upto 1 to 15");

        while( i<=15){
            System.out.println(" "+i+"'s table");

            int j=1;

            while( j<=10){
                System.out.println(i+" * " + j + " = "+(i*j));
                j++;
            }
            i++;
        }

    }
    
}
