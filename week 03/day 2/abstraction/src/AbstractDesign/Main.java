package AbstractDesign;

abstract class Bird{

    abstract void fly();
    abstract void eat();

    public void sleep(){
        System.out.println("Bird is sleeping");
    }
}

class Sparrow extends Bird{

    @Override
    void fly(){
        System.out.println("Sparrow is flying");
    }

    @Override
    void eat(){
        System.out.println("Sparrow is eating");
    }
}

class Crow extends Bird{

    @Override
    void fly(){
        System.out.println("Crow is flying");
    }

    @Override
    void eat(){
        System.out.println("Crow is eating");
    }
}


// interface
interface Bird2{

    void fly();
    void eat();

    default void sleep(){
        System.out.println("Bird sleep in interface");
    }
}

interface Walk{
    int legs = 4; // public, static, final
    void walking();
}

class Sparrow2 implements Bird2, Walk {

    public void eat(){
        System.out.println("Sparrow is eating in interface");
    }

    public void fly(){
        System.out.println("Sparrow is flying in interface");
    }

    public void walking(){
        System.out.println("Sparrow is walking in interface");
    }
}

public class Main {

    public static void doBirdStuff(Bird b) {

        b.fly();
        b.eat();
        b.fly();
        b.sleep();
        
    }

    public static void doBirdStuff2(Bird2 b) {

        b.fly();
        b.eat();
        b.fly();
        // b.walking();
        b.sleep();
        
    }

    public static void main(String[] args) {

        // can't make the object of abstract class
        // Bird b = new Bird();
        
        // up casting
        Bird bs = new Sparrow();
        // bs.eat();
        // bs.fly();
        doBirdStuff(bs);

        Bird bc = new Crow();
        // bc.eat();
        // bc.fly();
        doBirdStuff(bc);

        Bird2 s = new Sparrow2();
        doBirdStuff2(s);
        
    }
}
