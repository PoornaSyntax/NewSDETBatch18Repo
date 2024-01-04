package class22HW;

public class Product {

    private String productID;
    private String productName;
    private double price;
    private int stockQuantity;

    public Product(String productID, String productName, double price, int stockQuantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName)
    {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public int getStockQuantity()
    {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity)
    {
        this.stockQuantity = stockQuantity;
    }

    public String getProductID()
    {
        return productID;
    }

    public void restock(int amount) {
        stockQuantity += amount;
        getStockQuantity();
    }

    public double sell(int amount) {
        if (amount <= stockQuantity) {
            stockQuantity -= amount;
            double totalPrice = amount*getPrice();
            System.out.println(amount+" units sold. Total sale price : $ "+totalPrice);

            return totalPrice;

        } else {
            System.out.println("Not enough stock to fulfill the sale request");
            return 0.0;
        }
    }
    public void productDetails(){
        System.out.println("Product ID     : "+productName);
        System.out.println("Price          : "+price);
        System.out.println("Stock Quantity : "+stockQuantity);
    }

}
class ProductTester{
    public static void main(String[] args) {
        Product p = new Product("PR_001","Laptop",1000,20);
        p.setProductName("Ultrabook Pro");
        p.setPrice(1499.99);

        p.restock(5);
        double salePrice = p.sell(3);
        p.productDetails();
        System.out.println(salePrice);


    }
}

