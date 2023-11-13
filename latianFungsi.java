package javaapplication2.senin1123;

import java.util.Scanner;

public class latianFungsi {
    
    static void tampilNama(int id){
        String namaPelanggan[]={"ali","Dani","Edi","Umar"};
        System.out.println(namaPelanggan[id -1]);

    }
    
    static int hitungTarif(int jumlahPakai){
        int harga=0;
            if (jumlahPakai >0 && jumlahPakai <10){
                jumlahPakai = 10;
                harga = jumlahPakai *2000;
            }
            else if (jumlahPakai >=11 && jumlahPakai <20){                
                harga = jumlahPakai *3000;
            }
            else if (jumlahPakai >=21 && jumlahPakai <30){                
                harga = jumlahPakai *4000;
            }
            else if (jumlahPakai >=31){                
                harga = jumlahPakai *5000;
            }
            System.out.println(harga);
            return harga;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Data penggunaan air");
        System.out.println("masukkan id anda");
        int p = input.nextInt();
        tampilNama(p);
        System.out.println("Masukkan berapa meter");
        int air = input.nextInt();
        System.out.println("total");
        hitungTarif(air);
    } 
}