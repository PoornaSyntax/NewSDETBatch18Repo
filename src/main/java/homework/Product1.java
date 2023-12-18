package homework;

public class Product1 {

        private String productName;
        private double price;
        private int quantity;

        public Product1 (String productName, double price, int quantity) {
            this.productName = productName;
            this.price = price;
            this.quantity = quantity;
        }

        public double calculateTotalPrice() {
            return price * quantity;
        }

        // Getters for properties
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

    class NewDiscountedProduct extends Product1 {
        private double discountRate;

        public NewDiscountedProduct(String productName, double price, int quantity, double discountRate) {
            super(productName, price, quantity);
            this.discountRate = discountRate;
        }

        @Override
        public double calculateTotalPrice() {
            double discountedPrice = getPrice() * (1 - discountRate / 100);
            return discountedPrice * getQuantity();
        }
    }

     class ShoppingCart {
        public static void main(String[] args) {
            // Create instances of both classes
            Product1 regularProduct = new Product1("Cereal", 7.0, 3);
            NewDiscountedProduct discountedProduct = new NewDiscountedProduct("Milk", 7.0, 2, 20.0);

            // Calculate and display total prices
            System.out.println("Total price for " + regularProduct.getProductName() +
                    ": $" + regularProduct.calculateTotalPrice());

            System.out.println("Total price for " + discountedProduct.getProductName() +
                    ": $" + discountedProduct.calculateTotalPrice());
        }
    }


