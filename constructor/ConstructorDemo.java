public class ConstructorDemo {

    String brand;
    String color;
    int speed;

    public ConstructorDemo(String brand, String color, int speed){
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    public void drive(){
        System.out.println(brand + " drives at " + speed);
    }
}