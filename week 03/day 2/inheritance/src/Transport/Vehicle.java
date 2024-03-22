package Transport;

public class Vehicle {
    
    public String name;
    public String model;
    public int noOfTyres;

    // ctor
    Vehicle(String name, String model, int noOfTyres) {
        this.name = name;
        this.model = model;
        this.noOfTyres = noOfTyres;
    }

    public void startEngine(){
        System.out.println("Engine is starting "+name+" , model= "+model);
    }
    public void stopEngine(){
        System.out.println("Engine is Stopping "+name+" , model= "+model);
    }

}
