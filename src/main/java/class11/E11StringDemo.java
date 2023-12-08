package class11;

public class E11StringDemo {
    public static void main(String[] args) {
        String str ="nfskf  ASDB  SH@  #$#$123";
        System.out.println("A - Z " + str.replaceAll("[A-Z]","*"));
        System.out.println("a-z "+str.replaceAll("[a-z]","*"));
        System.out.println("0-9 "+str.replaceAll("[0-9]","*"));
        System.out.println( "A-D "+str.replaceAll("[A-D]","*"));
        System.out.println("A-Z and a-z " +str.replaceAll("[A-Za-z]","*"));
        System.out.println("A-Z a-z 0 - 9 "+str.replaceAll("[A-Za-z0-9]","*"));
        System.out.println("^A-Z " +str.replaceAll("[^A-Z]","*"));
        System.out.println(str.replaceAll("[^A-Za-z]","*"));
        System.out.println(str.replaceAll("[A-z]",""));
        System.out.println((int)'A');
        System.out.println(str.replaceAll("[!-?]",""));
        System.out.println(str.replaceAll("[\\d]",""));

        System.out.println(str.replaceAll("[\\s]",""));










    }
}
