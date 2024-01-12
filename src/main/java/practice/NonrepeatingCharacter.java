package practice;

public class NonrepeatingCharacter
{
    public  int count;
    public  char theWinner;
    public  char firstNRC(String str) {
        for (int i = 0; i < str.length(); i++) {
            int count=0;

            for (int j = i + 1; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
                this.count=count;
            }
            if (this.count==0){
                this.theWinner=str.charAt(i);
                break;
            }
        }
        return theWinner;
    }
    public static void main(String[] args) {
        String str="abracadabra";
        NonrepeatingCharacter first=new NonrepeatingCharacter();
        System.out.println(first.firstNRC(str));
}}
