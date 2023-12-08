package class9;

public class T7Countries {
    public static void main(String[] args) {
        /*
        Create 2D array of countries:north america countries, South America countries,europe
        countries, Asian countries,African countries. Then print
        all values from that array using 2 different loops
        and calculate how many total countries been stored.
         */
         String[][] countries ={
                 {"USA","Canada","Mexico"},
                 {"Argentina","Brazil","Colombia"},
                 {"United Kingdom","France","Spain"},
                 {"Taiwan","india","Japan"},
                 {"Nigeria","Egypt","Kenya"}
         };
        System.out.println("------Using Nested For Loop----");

        for(int i=0;i<countries.length;i++){
            for(int j=0;j<countries[i].length;j++){
                System.out.print(countries[i][j]+" ");
            }
            System.out.println();
        }
        int TotalNumCountries = 0;
        System.out.println("-----Using Enhanced for loop-----");
        for(String[] names:countries){
            TotalNumCountries=TotalNumCountries + names.length;
            for(String country : names){
                System.out.print(country+ " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Total number of countries "+TotalNumCountries);
    }
}
