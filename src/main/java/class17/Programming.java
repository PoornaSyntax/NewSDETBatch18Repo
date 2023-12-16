package class17;

public class Programming {
    /*
    Create a class named 'Programming'. While creating an object of the class,
    if nothing is passed to it, then message "I love programming language" should be
    printed. IF some String is passed to it, then in place of "programming language"
    the value variable should be printed. Example, if we pass "Java", then
    "I love Java" should be printed.
     */
    private String str;
    public Programming() {

        System.out.println("I love programming language");
    }

    public Programming(String word) {
        this.str=word;
        System.out.println("I love " + str);
    }

}


