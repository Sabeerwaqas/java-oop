public class Car extends Vehicle{

    public Car(String brand, int speed) {
        super(brand, speed);
    }
    private int doors;

    @override
    public void start(){
        System.out.println("Car starting");
    }

}