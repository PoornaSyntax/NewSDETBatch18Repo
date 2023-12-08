package class13;

public class Hello {
    void sayHello(String country) {
        String hi = "";
        if (country.equals("USA")) {
            hi = "Hello";
        } else if (country.equalsIgnoreCase("Mexico")) {
            hi = "Hola";
        } else if (country.equalsIgnoreCase("France")) {
            hi = "Bonjour";
        } else if (country.equalsIgnoreCase("India")) {
            hi = "Namaste";
        } else if (country.equalsIgnoreCase("China")) {
            hi = "Ni Hao";
        }
        System.out.println("In " + country + " they say " + hi);
    }

    public static void main(String[] args) {
        Hello obj= new Hello();
        obj.sayHello("France");
    }
}
