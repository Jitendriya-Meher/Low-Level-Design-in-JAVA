public class Student {

    // attributes
    public int id;
    public int age;
    public String name;
    public int nos;
    private String gf;

    // default constructor ( ctor )
    // attributes -> garbage value 
    public Student() {
        System.out.println("Student default constructor called");
    }

    // parameterised constructor
    public Student( int id, int age, String name, int nos, String gf ) {
        System.out.println("Student parameterised ctor called");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
        this.gf = gf;
    }

    // copy ctor
    public Student( Student obj){
        System.out.println("Student copy constructor called");
        this.id = obj.id;
        this.age = obj.age;
        this.name = obj.name;
        this.nos = obj.nos;
        this.gf = obj.gf;
    }

    // methods / behaviors
    public void study(){
        System.out.println(name + " studying");
    }

    public void sleep(){
        System.out.println(name+" sleeping");
    }

    public void bunk(){
        System.out.println(name+" bunking");
    }

    private void gfChatting() {
        System.out.println(name+" gfChatting");
    }

    public String getGf(){
        return this.gf;
    }

    public void setGF(String gf){
        this.gf = gf;
    }
    
}
