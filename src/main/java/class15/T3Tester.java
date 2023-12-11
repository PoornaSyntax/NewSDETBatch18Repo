package class15;

public class T3Tester {




        public static void main(String[] args) {
            T3 publicConstructorObj = new T3();


            T3 DefaultConstructorObj = new T3("Jim");


            T3 privateConstructorObj = new T3("Mary",23);

            // Protected constructor can be accessed inside the same class
            T3 protectedConstructorObj = new T3("Anna",23);
        }

    }

