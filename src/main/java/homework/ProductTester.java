package homework;

  class Product {
    /*
    Online Shopping Cart:

Construct a class Product with attributes like product_name, price, and quantity.
Create a subclass DiscountedProduct that extends Product and includes an additional discount_rate attribute.
Override a method in DiscountedProduct to calculate the price after applying the discount.
Create instances of both classes and show how prices are calculated
     */

      private String productName;
      private double price;
      private int quantity;

      public Product(String productName, double price, int quantity) {
          this.productName = productName;
          this.price = price;
          this.quantity = quantity;
      }

      public double calcTotalPrice() {
          return price * quantity;
      }
      public String getProductName() {
          return productName;
      }
      public double getPrice() {
          return price;
      }
      public int getQuantity() {
          return quantity;
      }
  }

    class DiscountedProduct extends Product {
        double discount_rate;

        DiscountedProduct(String a, double b, int c,double discount_rate) {
            super(a, b, c);
            this.discount_rate=discount_rate;
        }
        public double calcTotalPrice() {
            //this.discount_rate=discount_rate;
            double total = super.calcTotalPrice();
            total = total-(total *(discount_rate/100));
            return total;
        }}



     public class ProductTester {
        public static void main(String[] args) {
            Product product = new Product("Cereal", 7, 2);
            System.out.println("Total Price for "+product.getProductName()+" is $ "+product.calcTotalPrice());
             DiscountedProduct dp=new DiscountedProduct("Milk",7,2,20);
            System.out.println("Total Price for "+dp.getProductName()+" is $ "+dp.calcTotalPrice());



         }}

