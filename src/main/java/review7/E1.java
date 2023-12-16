package review7;

public class E1 {

    static int arr(int[] number){
        int sum =0;
        for(int i=0;i<number.length;i++){
            sum = sum+number[i];
        }
        System.out.println(sum);
        return sum;

    }

    public static void main(String[] args) {
        int[] ar = new int[]{10,20,56};
        System.out.println(arr(ar));
    }
}
