package class15;
/*
Write aBook class that will have 5 instance variables and
2 constructors. While creating an object make sure:
Instance variables are being initialized
Both constructors are being executed
Create print info method and callit.
 */

public class Book1 {
    private String title;
    private String isbn;
    private String subject;
    private String author;
    private int pages;

    public Book1(String title, String subject, String isbn, String author) {
        this.title = title;
        this.subject = subject;
        this.isbn = isbn;
        this.author=author;
    }
//    public Book(title,subject,isbn,author,pages){
//        this(title,subject,isbn,author);
//        this.pages=pages;
//    }
    public void printInfo(){
      //  System.out.println("Title "+title+" Genre "+subject+);
    }
}
