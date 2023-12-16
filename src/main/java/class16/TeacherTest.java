package class16;

public class TeacherTest {
    /*
    Write a java program called Teacher. Identify features and 4
    behaviour of that Class. Create 3 subclasses MathTeacher, ChemistryTeacher and PionoTeacher.
    Test all 4 classes.
     */
    String name;
    String subject;
    int hoursOfTeaching;

    public TeacherTest(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public TeacherTest(String name, String subject, int hoursOfTeaching) {
        this.name = name;
        this.subject = subject;
        this.hoursOfTeaching = hoursOfTeaching;
    }

    void teach(){
            System.out.println("teaching....");
        }
        void joke(){
            System.out.println("hahahha");
        }
    }

