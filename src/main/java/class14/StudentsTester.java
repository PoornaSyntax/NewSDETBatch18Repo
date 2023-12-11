package class14;

public class StudentsTester {
    public static void main(String[] args) {

        Students s1=new Students();
        Students.numberOfStudents++;
        s1.ID="123";
        s1.Name="John";

        Students s2 = new Students();
        Students.numberOfStudents++;
        s1.ID="456";
        s1.Name="Anna";

        System.out.println("Total number of students : "+Students.numberOfStudents);


    }
}
