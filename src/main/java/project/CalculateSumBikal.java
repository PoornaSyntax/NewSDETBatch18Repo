package project;

public class CalculateSumBikal {
    public static void main(String[] args) {
        int [][] numbers = {
                {5, 10, 15, 20, 25},
                {3, 2, 9, 14, 28,},
                {50, 55, 60, 65, 70},
                {23, 34, 46, 47, 100}
        };
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                int evenNum = numbers[i][j];
                int oddNum = numbers[i][j];
                if (evenNum %2==0) {
                    sum1 = sum1 + evenNum;
                }else if (oddNum %2!=0){
                    sum2 = sum2 +oddNum;
                }
            }
        }
        System.out.println("The sum of even num is " +sum1);
        System.out.println("The sum of odd num is " +sum2);
    }
}
