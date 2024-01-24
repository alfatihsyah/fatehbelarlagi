import java.util.Scanner;

public class ProductTester {
  // atribut atau global variabel

  public static void main(String[] args) {

    int maxSize = -1;
    Scanner in = new Scanner(System.in);
    try {
      do {
        System.out.println("Masukkan jumlah barang");
        System.out.println("Masukkan 0 jika tidak menambahkan");
        maxSize = in.nextInt();
      } while (maxSize <= 0);
    } catch (Exception e) {
      System.out.println(e);
      System.out.println("input salah");
    }

    if (maxSize == 0) {
      System.out.println("produk tidak ada");
    } else {
      // aray product
      Product p[] = new Product[maxSize];
      for (int i = 0; i < maxSize; i++) {
        // lokal variabel
        in.nextLine();
        System.out.println("produk " + i);
        System.out.print("Nama : ");
        String name = in.nextLine();
        System.out.print("Item Number : ");
        int number = in.nextInt();
        System.out.print("Stock : ");
        int stock = in.nextInt();
        System.out.print("Price : ");
        double price = in.nextDouble();

        p[i] = new Product(number, name, price, stock);
        // System.out.println(p[i].toString());
      }
      // show product
     displayInventory(p);
     
    }
    in.nextLine();

    // Product p1 = new Product(number, name, price, stock);

    // Product p3 = new Product(3, "IPhone 20", 2000000, 20);
    // System.out.println(p3.toString());
  }

public static void displayInventory(Product[] p){
  for (Product pro : p) {
    System.out.println(pro.toString());
    System.out.println("----------------------------");
  }
}
}
