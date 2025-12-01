public class InheritanceDemo {
    public static void main(String[] args){
        Car car1 = new Car("Toyota", 100);
        car1.displayInfo();

        Bike bike1 = new Bike("Unique", 70);
        bike1.setEnginePower(70);
        bike1.displayInfo();
    }
}