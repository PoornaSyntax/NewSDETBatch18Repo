package class19;

public class E2Poly {
    public static void main(String[] args) {
        Dog d1= new Dog("Jacky","Brown",10,25);
        Dog d2= new Dog("Macky","Black",10,25);
        Cat c1=new Cat("lovely","Black",10,25);
       Animal a1=new Cat("Animal","Black",10,25);
        Animal [] arr={d1,d2,c1,a1};

       Animal animal=arr[1];
       animal.printInfo();

       Cat c=(Cat)arr[2];

    }
}
