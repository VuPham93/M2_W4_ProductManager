import java.io.Serializable;

public class Product implements Serializable {
    private String code;
    private String name;
    private String brand;
    private String color;
    private double price;

    public Product() {
    }

    public Product(String code, String name, String brand, String color, double price) {
        this.code = code;
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.price = price;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Product: Code: " + getCode() + " | Name: " + getName() + " | Brand: " + getBrand() + " | Color: " + getColor() + " | Price: " + getPrice();
    }
}
