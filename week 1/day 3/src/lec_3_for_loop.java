public class lec_3_for_loop {

    public static void main(String[] args) {
        
        for( int i = 0; i <5; i++ ) {
            System.out.println("for loop = " + i);
        }

        for( int i = 0; i < 10; i+=2 ) {
            System.out.println("for loop 2 = " + i);
        }

        System.out.println("14 table");

        for( int i=1; i <= 10; i++ ) {
            System.out.println("14 X "+i+" = "+(14*i));
        }

        // nested for loop
        System.out.println("table upto 1 to 5");

        for( int i=1; i<=5  ; i++){
            System.out.println(i+"'s table");

            for( int j=1; j<=10; j++){
                System.out.println(i+" * "+j+" = "+(i*j));
            }
        }

        // break and continue
        for( int i=0; i<10; i++){
            if( i==3){
                System.out.println("continue = "+i);
                continue;
            }
            if( i==7){
                System.out.println("break = "+i);
                break;
            }
            System.out.println("break and continue = " + i);
        }

    }
    
}
