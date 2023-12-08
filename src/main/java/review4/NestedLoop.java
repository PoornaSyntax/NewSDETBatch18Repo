package review4;

public class NestedLoop {
    public static void main(String[] args) {
        for(int i=1;i<=3;i++){
            System.out.println("Hello");
            for(int j=1;j<3;j++){
                System.out.println("Bye");
            }
        }
        System.out.println("------------");

        for(int i=1;i<=3;i++){
            System.out.println("Hello");
            for(int j=1;j<3;j++){
                System.out.println("Bye");
            }
        }

    }
}
