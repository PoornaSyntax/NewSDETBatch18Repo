package class18;
/*
Create a class 'Degree' having a method getPrerequisite' that prints
"To get a degree you need high school diploma".
Class Degree has 2 subclasses namely Bachelors and Masters. In Masters class override method 'getPrewrequisite
Call the method by creating an object of each of the three classes
 */

public class Degree {
    public void getPrerequisite(){
        System.out.println("To get a degree you need have a high school diploma");
    }
}
class Bachelors extends Degree{

}
class Masters extends Degree{

    public void getPrerequisite(){
        System.out.println("To get a Masters degree we need to have Bachelor's degree");
    }
}
class DegreeTester{
    public static void main(String[] args) {


    Masters m = new Masters();
    m.getPrerequisite();
        Bachelors b=new Bachelors();
        b.getPrerequisite();
}}
