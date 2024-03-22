package Transport;

public class Car extends Vehicle{

    public int noOfDoors;
    public String transmissionType;
    
    // ctor
    public Car( String name, String model, int noOfTyres, int noOfDoors, String transmissionType){

        super(name, model, noOfTyres);

        this.noOfDoors = noOfDoors;
        this.transmissionType = transmissionType;

        super.startEngine();
    }
    
    public void startAC(){
        System.out.println("AC started "+name+" , model "+model+"  , transmissionType "+transmissionType);
    }
}
