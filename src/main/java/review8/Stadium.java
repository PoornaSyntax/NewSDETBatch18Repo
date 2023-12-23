package review8;

public class Stadium {
    public static void main(String[] args) {

        Sport sport=new Sport("Soccer","Man city");
        System.out.println(sport.type);
        System.out.println(sport.type+ " "+sport.teamName);
        System.out.println(sport.numberOfPlayers);
        Sport sport1=new Sport("basket ball","Chicago Bulls",15,"Chicago","Billy Donavan");

    }
}
