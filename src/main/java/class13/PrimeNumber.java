package class13;

public class PrimeNumber {
    boolean isPrime( int num) {

        int c = 0;

        if (num > 1) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0)
                    c++;
            }
        }else{
            return true;}
        if (c == 2){
                return true;
            } else {
                return false;
            }
        }


        }


