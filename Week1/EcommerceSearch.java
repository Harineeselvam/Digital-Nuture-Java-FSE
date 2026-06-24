package week1;
class Product {
    int productId;
    String productName;
    String category;
    Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
}
public class EcommerceSearch {
    public static Product linearSearch(Product[] products, int id) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productId == id) {
                return products[i];
            }
        }
        return null;
    }
    public static Product binarySearch(Product[] products, int id) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (products[mid].productId == id) {
                return products[mid];
            }
            else if (products[mid].productId < id) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Product[] products = {
                new Product(101, "Mobile", "Electronics"),
                new Product(102, "Laptop", "Electronics"),
                new Product(103, "Watch", "Accessories"),
                new Product(104, "Shoes", "Fashion"),
                new Product(105, "Bag", "Fashion")
        };
        Product result1 = linearSearch(products, 104);
        if (result1 != null) {
            System.out.println("Linear Search Found : "
                    + result1.productName);
        }
        Product result2 = binarySearch(products, 104);

        if (result2 != null) {
            System.out.println("Binary Search Found : "+ result2.productName);
        }
    }
}
