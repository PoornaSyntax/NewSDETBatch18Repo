package homework;

public class Product_1 {
    /*
    Build a Product class with subclasses like Electronics, Clothing, Furniture, and Books.

    Define attributes like price, name, and SKU in the Product class.
    Override methods such as calculateTax based on product category.
    Introduce unique methods like applyWarranty in Electronics.
    Create objects of each subclass, store them in an array, and loop through to display or calculate prices and taxes
    */

        private double price;
        private String name;
        private String SKU;
        public Product_1(double price, String name, String SKU) {
            this.price = price;
            this.name = name;
            this.SKU = SKU;
        }
        public double getPrice() {
            return price;
        }
        public String getName() {
            return name;
        }
        public String getSKU() {
            return SKU;
        }
        public double calculateTax() {
             return 0.1 * price; //  10% tax rate
        }
    }
    class Electronics extends Product_1 {
        private int warrantyYears;

        public Electronics(double price, String name, String SKU, int warrantyYears) {
            super(price, name, SKU);
            this.warrantyYears = warrantyYears;
        }

        public void applyWarranty() {
            System.out.println("Warranty applied for " + warrantyYears + " years on " + getName());
        }

        @Override
        public double calculateTax() {
              return 0.15 * getPrice(); //  a 15% tax rate for electronics
        }
    }

    class Clothing extends Product_1 {
        public Clothing(double price, String name, String SKU) {
            super(price, name, SKU);
        }

    }

    class Furniture extends Product_1 {
        public Furniture(double price, String name, String SKU) {
            super(price, name, SKU);
        }


    }
    class Books extends Product_1 {
        public Books(double price, String name, String SKU) {
            super(price, name, SKU);
        }
    }

     class Product_1Tester {
        public static void main(String[] args) {

            Product_1[] vArr = {new Electronics(1200, "Laptop", "E123", 2),
            new Clothing(30, "T-Shirt", "C456"),
                    new Furniture(150, "Chair", "F789"),
                    new Books(20, "Mystery Novel", "B101")};

            for (Product_1 product : vArr) {
                System.out.println("Product: " + product.getName());
                System.out.println("Price: $" + product.getPrice());
                System.out.println("Tax: $" + product.calculateTax());
                System.out.println();

                // Check if the product is an instance of Electronics to apply warranty
                if (product instanceof Electronics) {
                    ((Electronics) product).applyWarranty();
                    System.out.println();
                }
            }
        }}

