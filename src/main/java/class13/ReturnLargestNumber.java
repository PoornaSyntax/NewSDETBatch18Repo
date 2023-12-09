package class13;

public class ReturnLargestNumber {
    int max(int numA, int numB){
        int result;
        if(numA>numB){
            result = numA;
        }else{
                result=numB;
    }
        return result;
    }

    public static void main(String[] args) {
        ReturnLargestNumber obj = new ReturnLargestNumber();
        int r = obj.max(5,10);
        System.out.println("The Result is : "+r);
    }
}
