package practice;

public class Regex1 {
    public static void main(String[] args) {
        String mix="3213Hello 89 World354545 *&***^&*^&*";
        System.out.println("1. "+mix.replaceAll("[0-9]", "").length());
        System.out.println(mix.replaceAll("[a-z]", ""));
        System.out.println(mix.replaceAll("[a-z A-Z]", ""));
        System.out.println("4. "+mix.replaceAll("[^A-Za-z0-9]", ""));
    }
}
