package class13;


public class Student {
    void getGrade(int score){
        char Grade;

        if(score>90){
            Grade ='A';
        }else if(score>80){
            Grade = 'B';
        }else if(score>70){
            Grade ='C';
        }else if(score>50){
            Grade ='D';
        }else{
            Grade='F';
        }
        System.out.println("The Grade for the score "+score+" is : "+Grade);



    }
}
