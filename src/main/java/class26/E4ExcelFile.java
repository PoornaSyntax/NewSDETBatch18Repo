package class26;

import utils.Constants;
import utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class E4ExcelFile {
    public static void main(String[] args) throws IOException {
        List<Map<String,String>> data =ExcelReader.read(Constants.EXCEL_FILE_PATH,"Sheet1");
        data.forEach(x-> System.out.println(x));

        }
    }

