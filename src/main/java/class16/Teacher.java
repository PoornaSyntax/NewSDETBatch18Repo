package class16;

public class Teacher {
    /*
    Write a java program called Teacher. Identify features and 4
    behaviour of that Class. Create 3 subclasses MathTeacher, ChemistryTeacher and PionoTeacher.
    Test all 4 classes.
     */
    String name;
    String subject;
    int hoursOfTeaching;


        void teach(){
            System.out.println("teaching....");
        }
        void joke(){
            System.out.println("hahahha");
        }
    }

    class MathTeacher extends Teacher{
    void teachMath(){

        System.out.println("Teaching Math");
    }
    }

class ChemistryTeacher extends Teacher{
    void teachChem(){

        System.out.println("HCL is Salt");
    }
}
class PionoTeacher extends Teacher{
    void teachPiano(){

        System.out.println("Teaching Piano");
    }
}