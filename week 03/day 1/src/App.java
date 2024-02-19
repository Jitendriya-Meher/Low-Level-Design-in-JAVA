public class App {
    public static void main(String[] args) throws Exception {
        
        Student A = new Student();
        System.out.println(A.name);
        System.out.println(A.age);
        A.name = "Jitendriya";
        A.id = 1;
        A.age = 12;
        A.nos = 5;
        System.out.println(A.name);
        System.out.println(A.age);
        A.bunk();
        A.study();
        A.sleep();

        Student B = new Student(2,21,"amit",6);
        System.out.println(B.name);
        System.out.println(B.age);
        B.bunk();
        B.study();
        B.sleep();

        // copy ctor
        Student C = new Student(A);
        System.out.println(C.name);
        System.out.println(C.age);
        C.bunk();
        C.study();
        C.sleep();

    }
}
