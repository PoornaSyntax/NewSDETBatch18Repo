package review3;

public class SwitchAgain {
    public static void main(String[] args) {
        char choice ='Y';
        switch(choice){
            case 'y': //this logical operator wont work
                System.out.println("Means Yes");
                break;
            case 'n':
                System.out.println("Means no");
                break;
            case 'm':
                System.out.println("Means Maybe");
            default:
                System.out.println("I do not understand you");
        }

    }
}
