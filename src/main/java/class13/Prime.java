package class13;

public class Prime {
    boolean isPrime(int num) {
        if (num <=1){
            return false;
        }
        for (int i=2;i<=num/2;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Prime number = new Prime();
        int n=9;

        if(number.isPrime(n)){
            System.out.println(n+ " is a prime number");
        }else {
            System.out.println(n+ " is not a prime number");
        }
    }
}
