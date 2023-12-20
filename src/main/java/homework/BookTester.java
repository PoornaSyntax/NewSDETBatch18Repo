package homework;

  public class BookTester {
    public static void main(String[] args) {
        EBook eb=new EBook("Java Programming","Scott Brandt", "12345","TeachYourselfJava.com");
        PrintBook pb = new PrintBook("Computer Basics", "Jane Smith", "987654321", 100);
        System.out.println("EBook Details");
        eb.printInfo();
        System.out.println();
        System.out.println("PrintBook Details");
        pb.printInfo();
    }
}
