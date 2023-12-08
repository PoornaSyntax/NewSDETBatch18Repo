package class13;

public class Email2 {

    String createEmail(String firstname, String lastname, String emailType){
        String emailAdd = firstname+lastname+"@"+emailType+".com";
        return emailAdd;
    }

    public static void main(String[] args) {
        Email2 id = new Email2();
        String emailid = id.createEmail("John","Snow","gmail");
        System.out.println(emailid);
    }
}
