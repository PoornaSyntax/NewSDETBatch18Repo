package class21;

public abstract class File {
    /*
    Create a class File that will have following behavior:
    open(),edit(),close() and fields like name and size. Edit and
    close are implemented method while open ia an abstract. Create 3 subclasses:
    Java file ,WordFile,PdfFile that will provide specific
    implementaion of open behavior. Example:to open .java file we need notepad++ or sublime text, to open
    doc file we need Microsoft word to be installed etc.
    Create a tester class and call all of the methods from these classes.
     */
    private String name;
    private int size;
    public File(String name,int size){
        this.name=name;
        this.size=size;
    }

    public abstract void open();

    public void edit()
    {
        System.out.println("editing enabled");
    }
    public void close()
    {
        System.out.println("Close the file");
    }
}
class JavaFile extends File{
    public JavaFile(String name, int size){
        super(name,size);
    }
    public void open(){
        System.out.println("We need Notepad++ or sublime text to open JavaFile");
    }
}
class WordFile extends File {
    public WordFile(String name, int size) {
        super(name, size);
    }
    public void open(){
        System.out.println("We need Microsoft Word to open  word file");
    }

}
class PdfFile extends File{
    public PdfFile(String name, int size){
        super(name,size);}
    public void open(){
        System.out.println("Opening pdf file");
    }
}

