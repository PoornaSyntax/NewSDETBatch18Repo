package class25;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class E5ExcelFile {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\poorn\\IdeaProjects\\NewSDETBAtch18\\Files\\Batch18.xlsx";
        FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook excel = new XSSFWorkbook(fis);
        var sheet = excel.getSheet("Sheet1");
        int noOFRows = sheet.getPhysicalNumberOfRows();

        for(int i=0;i<noOFRows;i++){
           Row row = sheet.getRow(i);

           int noOfCol= row.getPhysicalNumberOfCells();
           for(int j=0; j<noOfCol;j++){
               System.out.print(row.getCell(j)+" ");
           }
            System.out.println();

        }

    }
}
