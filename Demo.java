class Computer {
    public void createFile(){
        System.out.println("New file created...");
    }

    public String printContent(String content){
        return content;
    }
}

public class Demo{
    public static void main(String a[]){

        Computer obj = new Computer();
        obj.createFile();

        String printedContent = obj.printContent("Hello World");
        System.out.println(printedContent);

    }
}