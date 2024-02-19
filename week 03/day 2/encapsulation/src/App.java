public class App {
    public static void main(String[] args) throws Exception {
        
        Student A = new Student(1,12,"bf",3,"gf");
        System.out.println(A.name);
        // System.out.println(A.gf);
        A.bunk();
        A.study();
        A.sleep();
        // A.gfChatting();
        System.out.println(A.getGf());
        A.setGF("new GF");
        System.out.println(A.getGf());

    }
}
