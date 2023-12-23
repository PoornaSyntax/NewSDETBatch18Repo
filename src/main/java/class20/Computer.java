package class20;
//abstract  means something is incompleted
//Every abstract class must participate in inheritance
//we cannot create object of abstract class.
public abstract class Computer {
    public static String type;
    public String name;
    protected int memory;
    String color;

    public Computer(String name,int memory,String color){
        this.name = name;
        this.memory= memory;
        this.color=color;
    }

    abstract void executeCode();

    public abstract void readEmails();

}
class Apple extends Computer{

    public Apple(String name,int memory,String color) {
        super(name, memory, color);
    }
    //when we provide implementation to the abstract classes we MUST follow rules of Overriding
    //same method name and parameters must be same- method signature must be the same
    //return type must be same
    //Access modifier must be same or wider
        void executeCode(){
            System.out.println("Executing codeon "+type+" "+name);
        }
        public void readEmails(){

        }

    }
