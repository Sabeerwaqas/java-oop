class Person {
    private int age;
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

}


public class Human{

    public static void main(String[] args){

        Person person1 = new Person();

        person1.setName("Sabeer");
        person1.setAge(25);

        System.out.println(person1.getName());
        System.out.println(person1.getAge());


    }

}