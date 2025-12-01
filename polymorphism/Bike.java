public class Bike extends Vehicle {

    public Bike(String brand, int speed){
        super(brand, speed);
    }

    private int enginePower;

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }
}