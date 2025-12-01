record Bike(String name, int speed) {}

public class Record {
    public static void main(String[] args){
        Bike seventy = new Bike("Unique", 70);
        System.out.println(seventy.name());
        System.out.println(seventy.speed());
    }
}