package homework;

public class ArrrayCharValues {
    public static void main(String[] args) {
        char[] charValues ={'1','2','3','4','5'};

        System.out.println();
        System.out.println("Printing in the order entered");
        for(int i= 0; i<=charValues.length-1;i++){

            System.out.print(charValues[i]+" ");
        }
           System.out.println();

           System.out.println("Printing the char values in reverse order");

           for(int i= charValues.length-1; i>=0;i--){
            System.out.print(charValues[i]+" ");

        }

    }
}

