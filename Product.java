public class Product {
    // Instance Field Declarations
    int number;
    String name;
    double price;
    int stock;
    boolean status;

    // Constructor Default
    public Product() {
        number = 1;
        name = "TV";
        price = 1000000;
        stock = 100;
        status = true;
    }

    // Overload Constructor
    public Product(int number, String name, double price, int qty) {
        this.number = number;
        this.name = name;
        this.price = price;
        stock = qty;
        status = true;
    }

    // Getter(Accessor)
    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public boolean getStatus() {
        return status;
    }

    // Setter(Mutator)
    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void getStatus(boolean status) {
        this.status = status;
    }

    public double getInventoryvalue() {
        return this.price * this.stock;
    }

    // Override toString Method
    public String toString() {
        String st;
        if (status == true) {
            st = "aktif";
        } else {
            st = "mati";
        }
        return "Item Number: " + number
                + "\nName: " + name
                + "\nNumber in stock: " + stock
                + "\nPrice: " + price
                + "\nStock Value: " + getInventoryvalue()
                + "\nProsuct status: " + st;
    }

}