public class StringClass {
    public static void main(String[] args){

        String name = "navin";
        name = name + "reddy";
        System.out.println(name);

        String s1 = "Navin";
        String s2 = "Navin";

        System.out.println(s1 == s2);

        StringBuffer dummyData = new StringBuffer();
        dummyData.append("Reddy");

        System.out.print(dummyData);

    }
}