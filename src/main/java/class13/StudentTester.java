package class13;

import java.util.Scanner;

/*
Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
score > 90 - A
score >80 - B
score >70 - C
score > 50 - D
anything else - F
 */
public class StudentTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Score of the student");
        int mark=scanner.nextInt();
        Student obj=new Student();
        obj.getGrade(mark);



    }
}
