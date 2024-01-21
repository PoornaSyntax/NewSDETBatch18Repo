package class26;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.Constants;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class E3ExcelFile {
    public static void main(String[] args) throws IOException {


    FileInputStream fis =new FileInputStream(Constants.EXCEL_FILE_PATH);
    XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fis);
    Sheet sheet=xssfWorkbook.getSheet("Sheet1");
int noOfacutalRowsWithData = sheet.getPhysicalNumberOfRows();

        List<Map<String, String>> excelData = new ArrayList<>();
        Row headerRow=sheet.getRow(0);

       for (int i = 0; i <noOfacutalRowsWithData ; i++) {
            Row currentRow = sheet.getRow(i);
            Map<String, String> rowMap=new LinkedHashMap<>();
            int noOfActualCellsWithData= currentRow.getPhysicalNumberOfCells();
            for(int j=0;j<noOfActualCellsWithData;j++){
                String key = headerRow.getCell(j).toString();
                String value=currentRow.getCell(j).toString();
                //store these keys and values in the map
                rowMap.put(key,value);
            }
           //Store each map in the list
           excelData.add(rowMap);

        }
        System.out.println(excelData);



}}
