package homework;

public class Book {
    /*
    Create a base class Book with attributes like title, author, and ISBN.
Develop two subclasses: EBook and PrintBook. In EBook, add a property for download_link, and in PrintBook,
add a property for number_of_copies. Implement a method in each subclass that displays book details.
Instantiate objects from these classes and demonstrate the display functionality.
     */
    private String title;
    private String author;
    private String ISBN;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.ISBN = isbn;
    }
    public void printInfo(){
        System.out.println("Title  : "+title);
        System.out.println("Author : " +author);
        System.out.println("ISBN   : "+ISBN);
    }
}

class EBook extends Book{
    private String download_link;
    public EBook(String title,String author,String isbn, String download_link){
        super(title,author,isbn);
        this.download_link= download_link;
    }
    public void printInfo(){
        super.printInfo();
        System.out.println("Download Link : "+download_link);
    }
}
class PrintBook extends Book{
    private int no_of_copies;

    public PrintBook(String title, String author,String isbn,int no_of_copies){
        super(title,author,isbn);
        this.no_of_copies=no_of_copies;
    }
    public void printInfo(){
        super.printInfo();
        System.out.println("Number of Copies : "+no_of_copies);
    }


}