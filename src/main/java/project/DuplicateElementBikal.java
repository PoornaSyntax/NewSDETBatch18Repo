package project;

public class DuplicateElementBikal {
    public static void main(String[] args) {
        String [] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter","Earth"};

        for (int i = 0; i < planets.length; i++) {
            for (int j = i+1; j <planets.length ; j++) {
                if(planets[i]==planets[j]){
                    System.out.println("Duplicate element from an Array is the planet " +planets[i]);
                }
            }
        }
    }
}

