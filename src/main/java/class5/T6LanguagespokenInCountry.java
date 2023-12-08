package class5;

import java.util.Scanner;

public class T6LanguagespokenInCountry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String countryName;
        System.out.println("Please Enter the country you are from");
        countryName = sc.next();

        switch(countryName.toLowerCase()){
            case "tajikistan":
                System.out.println("Tajik");
                break;
            case "russia":
                System.out.println("Russian");
                break;
            case  "iran":
                System.out.println("Persian");
                break;
            case "spain":
                System.out.println("Spanish");
                break;
            case "afganistan":
                System.out.println("Farsi");
                break;
            default:
                System.out.println("Invalid country");
        }

    }
}
