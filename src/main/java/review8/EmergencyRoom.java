package review8;

import review8_1.Orthodontist;

public class EmergencyRoom {
    public static void main(String[] args) {
        Doctor[] doc={new Surgeon("John","Doe","Surgeon",20,"Fairfax  VA"),
        new Surgeon("John","Doe","Surgeon",20,"Fairfax  VA"),
        new Orthodontist("Josh","Smith","Orthodontist",15)};

        System.out.println("-----------------   Enhanced for Loop ------------------------------");

        for(Doctor doctor:doc){
            doctor.checkVitals();
            doctor.checkVitals("Jack");
            doctor.prescribeMedication("Pain Killer");
        }

        //doc[0].checkVitals();
        //doc[0].checkVitals("Jane");
        //doc[0].prescribeMedication("pills");

        for (int i = 0; i < doc.length; i++) {
            doc[i].checkVitals();
            doc[i].checkVitals("Jane");
            doc[i].prescribeMedication("pills");
            System.out.println("-----------------");
        }
    }
}
