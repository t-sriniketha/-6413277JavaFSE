package Week1_Algorithms_DataStructures.Ecommerce_Platform_Search_Function;

public class Product {
    private int productId;
    private String productName;
    private String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
    public int getProductId() {
        return productId;
    }
    public String getProductName() {
        return productName;
    }
    public String getCategory() {
        return category;
    }
    @Override
    public String toString() {
        return "Product[ID=" + productId + ", Name=" + productName + ", Category=" + category + "]";
    }
}
