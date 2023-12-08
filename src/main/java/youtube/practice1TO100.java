package youtube;

public class practice1TO100 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int number = (i - 1) * 10 + j;
                if (number <= 100) {
                    System.out.println(number);
                }
            }
            //System.out.println();
        }
    }
}
