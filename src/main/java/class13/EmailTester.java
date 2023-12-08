package class13;

public class EmailTester
{
/*
Create a method createEmail(). Based on values of users firstName, lastName
and email type, your method should return complete email Address.
Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com{
 */

    public static void main(String[] args) {
        Email obj = new Email();
        obj.createEmail("John","Snow","gmail");
    }
}
