package homework;

public class HomeworkAssignment2 {
    public static void main(String[] args) {


    double mortgageRate = 3.5;
    double mortgagePrice = 70000;
    if(mortgageRate<4.5){
        System.out.println("Buyer will buy the house");
         if(mortgagePrice>10000)
         {
             System.out.println("Buyer will consider taking loan to buy the house");

        }else{
             System.out.println("Buyer will pay cash to buy the house");
         }
    }else {
        System.out.println("Buyer is not buying the house");
    }

    }}
