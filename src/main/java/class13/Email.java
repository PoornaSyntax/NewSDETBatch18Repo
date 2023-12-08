package class13;

public class Email {
    /*
    Create a method createEmail(). Based on values of users firstName, lastName
    and email type, your method should return complete email
    Address. Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
     */
    void createEmail(String fName,String lName,String type){
        System.out.println(fName+lName+"@"+type+".com");

    }
}
