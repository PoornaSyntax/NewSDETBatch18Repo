package class21;
interface FileReader{
    public void read();

}
public class ExcelFile1 implements FileReader{
    public void read(){
        System.out.println("Reading an Excel File");
    }
}

class TxtFile implements FileReader{
    public void read(){

    }

}