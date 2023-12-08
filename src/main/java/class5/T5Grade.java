package class5;
/* write a program that will read three inputs of
scores (quiz, mid term, and final scores)from 0 to 100  and determine
the grade bsed of the following rules:
if the average
 */

import java.util.Scanner;

public class T5Grade {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double quizMarks, midMarks,finalMarks,avgMarks;
    char grade;
        System.out.println("Please Enter the marks for  quiz from 0 to 100");
          quizMarks = sc.nextDouble();
        System.out.println("Please Enter the marks mid term from 0 to 100");
          midMarks = sc.nextDouble();
        System.out.println("Please Enter the marks for  final 0 to 100");
          finalMarks = sc.nextDouble();
        avgMarks=(quizMarks+midMarks+finalMarks)/3;
        if(avgMarks>=90){
            grade='A';

        }else if(avgMarks>=70 ){
            grade='B';
        }else if(avgMarks>=50){
            grade='C';
        }else{
            grade='F';
        }
        System.out.println(grade);

    }
}
