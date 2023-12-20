package homework;

public class Product2 {

        private double price;
        private String name;
        private String SKU;

        public Product2(double price, String name, String SKU) {
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
            // Default tax calculation for generic products
            return 0.1 * price; // Assuming a 10% tax rate
        }
    }

    class Electronics2 extends Product2 {
        private int warrantyYears;

        public Electronics2(double price, String name, String SKU, int warrantyYears) {
            super(price, name, SKU);
            this.warrantyYears = warrantyYears;
        }

        public void applyWarranty() {
            System.out.println("Warranty applied for " + warrantyYears + " years on " + getName());
        }

        @Override
        public double calculateTax() {
            // Override tax calculation for electronics
            return 0.15 * getPrice(); // Assuming a 15% tax rate for electronics
        }
    }

    class Clothing2 extends Product2 {
        public Clothing2(double price, String name, String SKU) {
            super(price, name, SKU);
        }

        // No need to override calculateTax for clothing (using the default from the Product class)
    }

    class Furniture2 extends Product2 {
        public Furniture2(double price, String name, String SKU) {
            super(price, name, SKU);
        }

        // No need to override calculateTax for furniture (using the default from the Product class)
    }

    class Books2 extends Product2 {
        public Books2(double price, String name, String SKU) {
            super(price, name, SKU);
        }

        // No need to override calculateTax for books (using the default from the Product class)
    }

     class Main {
        public static void main(String[] args) {
            // Create objects of each subclass
            Electronics2 laptop = new Electronics2(1200, "Laptop", "E123", 2);
            Clothing2 shirt = new Clothing2(30, "T-Shirt", "C456");
            Furniture2 chair = new Furniture2(150, "Chair", "F789");
            Books2 novel = new Books2(20, "Mystery Novel", "B101");

            // Store them in an array
            Product2[] products2 = { laptop, shirt, chair, novel };

            // Loop through to display or calculate prices and taxes
            for (Product2 product : products2) {
                System.out.println("Product: " + product.getName());
                System.out.println("Price: $" + product.getPrice());
                System.out.println("Tax: $" + product.calculateTax());
                System.out.println();

                // Check if the product is an instance of Electronics to apply warranty
                if (product instanceof Electronics2) {
                    ((Electronics2) product).applyWarranty();
                    System.out.println();
                }
            }
        }
    }


