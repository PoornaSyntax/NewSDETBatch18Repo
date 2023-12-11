package class15;

public class Student {

    String name;
    double s1Marks;
    double s2Marks;
    double s3Marks;

    public Student(String sName, double m1, double m2, double m3){
        name = sName;
        s1Marks=m1;
        s2Marks=m2;
        s3Marks=m3;

    }

    public void calcAvg(){
        double avg=(s1Marks+s2Marks+s3Marks)/3;
        System.out.println(name+ " "+avg);
    }
}
