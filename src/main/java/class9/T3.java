package class9;

public class T3 {
    public static void main(String[] args) {
        /*Create a 2D array(shorter way) in which
        first array will consist of 4 names and
        second array will contain grades. Then
        your program should print name of the students
        that has A and B grade
         */
        String[][] students = {
                {"John", "Jack", "Sam", "David"},
                {"A", "B", "C", "A"}
        };
        for(int i=0;i<students[0].length;i++){
            if(students[1][i].equals("A")||students[1][i].equals("B"))
            System.out.println(students[0][i]+ " "+students[1][i]);
        }


    }
}
