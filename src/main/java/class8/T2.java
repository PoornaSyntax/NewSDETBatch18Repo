package class8;

public class T2 {
    public static void main(String[] args) {
        int[] numbers={10,15,20,18,9,60,22,30};
        //show the sum of even numbers and odd numbers
        //separately.

        int evenNumbers=0,oddNumbers=0;
        for(int num:numbers){
            if (num %2==0){
                evenNumbers= evenNumbers+num;
            }else{
                oddNumbers = oddNumbers+num;
            }

        }

        System.out.println("The sum of even numbers is "+ evenNumbers);
        System.out.println("The sum of odd numbers is  "+oddNumbers);
    }
}

