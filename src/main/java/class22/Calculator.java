package class22;

public interface Calculator {

    int add(int num1, int num2);

    int subtract(int num1,int num2);

}

class Math implements Calculator{
    public int add(int num1, int num2){
        return num1+num2;
    }
    public int subtract(int num1, int num2){
        return num1-num2;
    }

}
