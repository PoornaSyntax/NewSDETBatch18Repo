package class11;

public class T2String {
    public static void main(String[] args) {
        String str = "Java is Fun";
        //count how many times letter a has appeared in the string

        char letter='a';
        int count =0;
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)==letter){
                count++;
            }
        }
        System.out.println("The letter 'a' appears "+count +" times in the string "+str);
    }
}
