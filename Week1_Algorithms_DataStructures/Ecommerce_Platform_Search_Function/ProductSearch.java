package Week1_Algorithms_DataStructures.Ecommerce_Platform_Search_Function;

import java.util.Arrays;
import java.util.Comparator;

public class ProductSearch {

    public static Product linearSearch(Product[] products, String name) {
        for (Product product : products) {
            if (product.getProductName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String name) {
        Arrays.sort(products, Comparator.comparing(Product::getProductName));

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            String midName = products[mid].getProductName();
            int cmp = name.compareToIgnoreCase(midName);

            if (cmp == 0) {
                return products[mid];
            } else if (cmp < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shirt", "Clothing"),
            new Product(3, "Book", "Stationery"),
            new Product(4, "Phone", "Electronics"),
            new Product(5, "Shoes", "Footwear")
        };

        String searchName = "Shirt";
        System.out.println(" Linear Search ");
        Product result1 = linearSearch(products, searchName);
        System.out.println(result1 != null ? "Found: " + result1 : "Product not found.");
        System.out.println("\n Binary Search ");
        Product result2 = binarySearch(products, searchName);
        System.out.println(result2 != null ? "Found: " + result2 : "Product not found.");
    }
}