package review8;

public class Doctor {

    public static String hospital;
    public String firstName, lastName;
    protected String speciality;
    int yearsOfExperience;
    private double salary;

    public Doctor(String firstName, String lastName, String speciality, int yearsOfExperience){
        this.firstName=firstName;
        this.lastName=lastName;
        this.speciality=speciality;
        this.yearsOfExperience=yearsOfExperience;
    }

    public static void work(){
        System.out.println("Doctors work at "+hospital);
    }

    protected void checkVitals(){
        System.out.println(firstName+" "+lastName+" check vitals on every patient");
    }
    /*
    method overloading
    How to overload- changing number of the parameters or datatype or swquence
    In overloading the method signature MUST be different

     */


    void checkVitals(String patient){
        System.out.println(firstName+" "+lastName+"checks vitals on "+patient);
        patient.trim();
    }

    protected void prescribeMedication(String medication){
        System.out.println(firstName+" "+lastName+" prescribed "+medication);
    }


}

class Surgeon extends Doctor{
String location;
    Surgeon(String firstName, String lastName, String speciality, int yearsOfExperience,String location){
        super(firstName,lastName,speciality,yearsOfExperience);
        this.location = location;
    }

    /*
    Method overriding - if subclass (child class) and parent class we have mehtod
    with the same name

    How to override: we need inheritance
                     MUST keep same name. same parameters and same return type
                     In overriding Method signature MUST be SAME
                     Access Modifier MUST be same or have wider access
     */
    public void prescribeMedication(String patient){
        System.out.println("Surgeon "+lastName+" prescribed medication to "+patient);
    }

}