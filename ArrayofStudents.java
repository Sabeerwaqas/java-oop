class Student{
    int rollNo;
    String name;
    int marks;
}


public class ArrayofStudents{
    public static void main(String[] args){

        Student s1 = new Student();
        s1.name = "ABC";
        s1.marks = 50;
        s1.rollNo = 1;

        Student s2 = new Student();
        s2.name = "DEF";
        s2.marks = 50;
        s2.rollNo = 2;

        Student s3 = new Student();
        s3.name = "GHI";
        s3.marks = 50;
        s3.rollNo = 3;

        Student arrayofStudents[] = new Student[3];

        arrayofStudents[0] = s1;
        arrayofStudents[1] = s2;
        arrayofStudents[2] = s3;

        for(int i = 0; i < arrayofStudents.length; i++){
            System.out.println(arrayofStudents[i].name);
        }


    }
}