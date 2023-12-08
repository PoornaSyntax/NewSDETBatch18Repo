package review2;

public class ElseIfBlock {
    public static void main(String[] args) {
        int worldCup=2002;

        if(worldCup==2002){
            System.out.println("Host country is Korea and Japan");
        }else if(worldCup==2006){
            System.out.println("Host country is Germany");
        }else if (worldCup==2010){
            System.out.println("Host country is South Africa");
        }else if(worldCup==2014) {
            System.out.println("Host country is Brazil");
        }else
        {
            System.out.println("Host country is unknown");
        }

        boolean allergy = true;
        String allergyType="peanut";
        if(allergy){
            System.out.println("Let's check what kind of allergy you have");
            if(allergyType.equals("peanut")){
                System.out.println("Please avoid food that contains peanut");
            } else if(allergyType.equals("dairy")){
                System.out.println("Please avoid food with dairy products");
            }else if(allergyType.equals("pollen")){
                System.out.println("Please stay indoor when trees are blooming");
            }
        }
    }
}
