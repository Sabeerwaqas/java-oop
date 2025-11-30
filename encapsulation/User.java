public class User {
    private String name;
    private String designation;
    private int age;

    public User(String name, String designation, int age){
        this.name = name;
        this.designation = designation;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDesignation(){
        return this.designation;
    }

    public void setDesignation(String designation){
        this.designation = designation;
    }

}