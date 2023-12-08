package homework;

public class HomeworkAssignment1 {
    public static void main(String[] args) {
        boolean hasdegree = true;
        float gpa = 3.5f;

        if (hasdegree){
            System.out.println("Congratulations");
            if(gpa>=3.5)
            {
                System.out.println("You are eligible for scholarship");
            }else{
                System.out.println("You should have studied harder");
            }
        }else {
            System.out.println("You should get a degree");
        }
    }
}
