package class12;
/*
Write a program that reads two people's first names and if they
are expecting boy or girl?
Based on the input suggests a name for a baby:
Example Output
Mom's first name: Mary
Dad's first name: Daniel
Boy or Girl? boy
Suggested baby name " DANRY
EXAMPLE Output:
Boy or Girl? girl
Suggested bay name : MAIEL
 */

public class T4 {
    public static void main(String[] args) {
        String fatherName="Carlos";
        String motherName="Taylor swift";
        boolean isBoy= false;

        if(isBoy){
            String fatherFirstPart=fatherName.substring(0,fatherName.length()/2);
            String motherLastPart=motherName.substring(motherName.length()/2, motherName.length());
            System.out.println(fatherFirstPart.trim()+motherLastPart.trim());
        }else{
            String motherFirstPart= motherName.substring(0,motherName.length()/2);
            String fatherLastPart = fatherName.substring(fatherName.length()/2,fatherName.length());
            System.out.println(motherFirstPart.trim()+fatherLastPart.trim());
        }


    }
}
