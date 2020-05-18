import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    static String file = "Product.dat";

    public Manager() throws IOException {
    }

    public void addProduct (ArrayList<Product> products) throws IOException {
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file));
        outputStream.writeObject(products);
        outputStream.close();
    }

    public void getProductByID (String id) throws IOException, ClassNotFoundException {
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file));
        ArrayList<Product> products = (ArrayList<Product>) inputStream.readObject();

        for (Product e: products) {
            if (e.getCode().equals(id)) {
                System.out.println(e.toString());
            }
        }
        inputStream.close();
    }

    public void editProduct (String id) throws IOException, ClassNotFoundException {
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file));
        ArrayList<Product> products = (ArrayList<Product>) inputStream.readObject();
        Scanner scanner = new Scanner(System.in);

        for (Product e: products) {
            if (e.getCode().equals(id)) {
                System.out.println("Edit product: ");
                System.out.print("Name: ");
                e.setName(scanner.nextLine());
                System.out.print("Brand: ");
                e.setBrand(scanner.nextLine());
                System.out.print("Color: ");
                e.setColor(scanner.nextLine());
                System.out.print("Price: ");
                e.setPrice(scanner.nextInt());
            }
        }
        addProduct(products);
    }

}
