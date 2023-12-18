package class19;

public class ComputerTester {
    public static void main(String[] args) {
        Computer[] arr = {new Apple("MacBook Pro",1,16),new Lenovo("ThinkPad X1",512,8),new HP("Spectre",1,8),new Dell("Alienware M18",1,8)};

        for (int i = 0; i < arr.length ; i++) {
            Computer c = arr[i];
            c.printInfo();
            c.startUp();
            c.shutDown();

        }
    }
}
