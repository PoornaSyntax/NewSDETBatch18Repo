package class15;

public class Students {
    private String name;
    private double Mathgrade1;
    private double Sciencegrade2;
    private double Englishgrade3;

    public Students(String sName, double sGrade1, double sGrade2, double sGrade3) {
        name = sName;
        Mathgrade1 = sGrade1;
        Sciencegrade2 = sGrade2;
        Englishgrade3 = sGrade3;

    }

    public void printAverage() {
        double avg;
        avg = (Mathgrade1 + Sciencegrade2 + Englishgrade3) / 3;
        System.out.println(name + " " + "Avg :" + avg);


    }


    public static void main(String[] args) {
        Students s1= new Students("John",75,89,90);
        Students s2 = new Students("Anna",75,99,92);
        s1.printAverage();
        s2.printAverage();


    }
}
