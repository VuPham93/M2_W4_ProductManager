import java.io.*;
import java.util.ArrayList;

public class ProductManager {
    public static void main(String[] args) {
        try {
            ArrayList<Product> products = new ArrayList<Product>();
            products.add(new Product("ST01", "Iphone", "Apple", "Gray",100000));
            products.add(new Product("ST02", "Nokia", "Nokia", "Black",80000));
            products.add(new Product("ST03", "Galaxy", "Samsung", "Black",80000));
            products.add(new Product("ST04", "Bphone", "BKAV", "White",60000));

            Manager manager = new Manager();
            manager.addProduct(products);

            System.out.println("Find product with id = ST03");
            manager.getProductByID("ST03");

            System.out.println("Edit product with id = ST02");
            manager.editProduct("ST02");
            System.out.println("Product with id = ST02 after edit: ");
            manager.getProductByID("ST02");

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
