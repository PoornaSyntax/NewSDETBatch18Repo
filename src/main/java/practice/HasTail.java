package practice;

 interface HasTail {


  int getTailLength();

 }

 abstract class Puma implements HasTail {}

 class Cougar extends Puma {

 //protected int getTailLength() {
     public int getTailLength(){

             return 4;}

 public int getTailLength(int length) {

             return 2;}

}

