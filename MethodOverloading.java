class Calculator {

    public int add(int num1, int num2){
        return num1 + num2;
    }

    public int add(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

}


public class MethodOverloading {

    public static void main(String a[]){

        Calculator obj = new Calculator();
        int result1 = obj.add(1,2);

        System.out.println(result1);

        int result2 = obj.add(1,2,3);
        System.out.print(result2);

    }

}