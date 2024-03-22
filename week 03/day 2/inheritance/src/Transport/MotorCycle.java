package Transport;

public class MotorCycle extends Vehicle{

    public String handleBarStyle;
    public String suspensionType;
    
    // ctor
    MotorCycle( String name, String model, int noOfTyres, String handleBarStyle, String suspensionType){

        super(name, model, noOfTyres);

        this.handleBarStyle = handleBarStyle;
        this.suspensionType = suspensionType;

        super.startEngine();
    }
    
    public void wheelie(){
        System.out.println("wheelie started "+name+" , model "+model+"  , suspensionType "+suspensionType );
    }
}
