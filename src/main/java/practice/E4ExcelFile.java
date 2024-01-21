package practice;

import utils.Constants;
import utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class E4ExcelFile {
    public static void main(String[] args) throws IOException, IOException {
        List<Map<String, String>> data= ExcelReader.read(Constants.EXCEL_FILE_PATH,"Sheet");
        System.out.println(data.get(1));//prints the whole map2
        System.out.println(data.get(3).get("FirstName"));//prints Kat
        //write code to print all the information from this excel use Read method from ExcelReader
        //data.forEach((r)-> System.out.println(r+" "));//first option
        //data.forEach(x->x.forEach((k,v)->{//second option
        //    System.out.println(k+" "+v);
        // }));
        data.forEach(System.out::println);//third option
}}
