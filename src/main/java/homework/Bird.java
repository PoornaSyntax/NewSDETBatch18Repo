package homework;
/*
reate a Bird class create 4 fields and use the
Bird class as parent class and create 2 classes
Using it one sparrow and one parrot use constructors make fields private
and define printInfo methods as well create the object of each class and call the methods

 */

public class Bird {
    private String name;
    private String color;
    private int speed;
    private double size;
    public Bird(String name, String color,int speed,double size){
        this.name=name;
        this.color=color;
        this.speed=speed;
        this.size=size;
    }
    void printInfo(){
        System.out.println(name+" "+color+" "+speed+" "+size);
    }

}

class Sparrow extends Bird{
    Sparrow(String name, String color,int speed,double size){
        super(name, color, speed, size);
    }

}

class Parrot extends Bird{
    private String specialFeature="Mimics";
    Parrot(String name, String color,int speed,double size) {
        super(name, color, speed, size);
        this.specialFeature = specialFeature();
    }
        public String  specialFeature(){
            return specialFeature;
        }


    }


