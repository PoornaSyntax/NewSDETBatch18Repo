package review8;

import review8_1.Orthodontist;

public class Hospital {
    public static void main(String[] args) {

        Doctor.hospital="Inova";
        Surgeon surgeon = new Surgeon("John","Doe","Surgeon",20,"Fairfax  VA");
        surgeon.checkVitals();//Parent class
        surgeon.checkVitals("Jane SMith");//Parent class
        surgeon.prescribeMedication("Smith");//child class
        Doctor.work();
        Surgeon.work();//accessing static method from parent class in static way using child classname

        Orthodontist orthodontist=new Orthodontist("Josh","Smith","Orthodontist",15);
        Orthodontist.work();//parent
        orthodontist.checkVitals();//parent
        orthodontist.prescribeMedication("Pain Killers");//child
        orthodontist.printSpeciality();//child


        Doctor ortho1=new Orthodontist("Josh","Smith","Orthodontist",15);
        ortho1.checkVitals();
        ortho1.checkVitals("Michael");
        //we are achieving a run time polymorphism thru method overriding
        //during run time Java gives preference to the Object type (in this case it Object of child class)
        ortho1.prescribeMedication("Pills");//Java executed child class method
        Doctor sur=new Surgeon("John","Doe","Surgeon",20,"Fairfax  VA");
        sur.checkVitals();
        sur.checkVitals("Mohammed");
        sur.prescribeMedication("pills");


    }
}
