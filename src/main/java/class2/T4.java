package class2;
/*
Write a program to print the area and perimeter of
a rectangle with width = 5 and height = 8.
your program should say ."The perimeter of a rectangle with
 and height --- is equal to --- and the
  area is --"*/

public class T4 {
    public static void main(String[] args) {
        int width = 5;
        int height = 8;
        System.out.println("The perimeter of a rectangle with width "+width+" and");
        System.out.println("height "+height+" is equal to "+(2*(width+height))+ " and the area is "+(width*height));
        System.out.println();
    }
}
