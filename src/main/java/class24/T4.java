package class24;

import java.util.LinkedHashMap;
import java.util.Map;

public class T4 {
    /*
    Create a Map that will store Employee name and salary.
    Write a logic to retrieve an employee who gets the highest salary.
    Output shoulkd be in the below format
    John Smith = $100,000
     */
    public static void main(String[] args) {

        Map<String, Integer> employee = new LinkedHashMap<>();
        employee.put("John Smith",100000);
        employee.put("Les Paul",150000);
        employee.put("David Gilmore",175000);
        employee.put("Tim Cook",75000);

        String empName="";
        int salary=0;

        for(var e:employee.entrySet()){
            if(e.getValue()>salary){
                empName=e.getKey();
                salary=e.getValue();
            }
        }
        System.out.println(empName+" = $"+salary);
            }
    }


