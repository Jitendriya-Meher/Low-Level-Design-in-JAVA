package Transport;

public class Main {
    
    public static void main(String[] args) {

        Car c = new Car("Maruti","800",4,4,"Automatic");
        c.startAC();
        c.stopEngine();

        MotorCycle m = new MotorCycle("Splender","Xline",2,"U","Soft");
        m.startEngine();
        m.wheelie();
        m.stopEngine();
    }
}
