package class9;

public class T5 {
    public static void main(String[] args) {
        /* Create 2D array of cars: american,german, korean, itralian
        Then retrieve all values from that array
        using two different loops
         */

        String[][] carsArray ={
                {"Chevrolet","Ford","Dodge"},
                {"Volkswagen","BMW","Mercedes"},
                {"Hyundai","Kia","Genesis"},
                {"Fiat","Ferrari","Lamborghini"}
        };

        for(int i=0;i<carsArray.length;i++){
            for(int j = 0;j<carsArray[i].length;j++){
                System.out.print(carsArray[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Using enhanced for loop");
        for(String[] arr:carsArray){
            for(String car:arr){
                System.out.print(car+" ");
            }
            System.out.println();
        }

    }
}
