import java.util.*;

public class RecommendationSystem {

    static class Product {
        String name;
        String category;

        Product(String name, String category) {
            this.name = name;
            this.category = category;
        }
    }

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("iPhone", "Electronics"));
        products.add(new Product("Laptop", "Electronics"));
        products.add(new Product("Headphones", "Electronics"));
        products.add(new Product("T-shirt", "Clothing"));
        products.add(new Product("Jeans", "Clothing"));
        products.add(new Product("Shoes", "Clothing"));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter preferred category (Electronics / Clothing): ");
        String preference = sc.nextLine();

        System.out.println("\nRecommended Products:");
        for (Product p : products) {
            if (p.category.equalsIgnoreCase(preference)) {
                System.out.println("- " + p.name);
            }
        }
        sc.close();
    }
}
