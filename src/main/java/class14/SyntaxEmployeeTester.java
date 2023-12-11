package class14;

public class SyntaxEmployeeTester {
    public static void main(String[] args) {

        SyntaxEmployee se = new SyntaxEmployee();
        se.empID="1234";
        se.salary=6000;
        System.out.println(se.empID+ " "+se.salary);
        System.out.println(SyntaxEmployee.CEO);

        SyntaxEmployee se2 = new SyntaxEmployee();
        se2.empID="5678";
        se2.salary=4000;
        System.out.println(se2.empID+ " "+se2.salary);
        System.out.println(SyntaxEmployee.CEO);

    }
}
