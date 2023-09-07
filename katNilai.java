
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SMK TELKOM 07
 */
public class katNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nama :");
       String nama = input.nextLine() ; 
        System.out.println("Masukkan Nilai "+nama);
        int nilai = input.nextInt();
        
        String predikat = null;
        String kategori = null;
        
        if (nilai >95 && nilai <=100){
            predikat =" A+";
            kategori = "sangat baik";
        }
       else if (nilai >90 && nilai <=95){
            predikat =" A";
            kategori = "sangat baik";
        }
       else if (nilai >85 && nilai <=90){
            predikat =" B+";
            kategori = "baik";
        }
       else  if (nilai >80 && nilai <=85){
            predikat =" B";
            kategori = "baik";
        }
       else if (nilai >75 && nilai <=80){
            predikat =" B-";
            kategori = "baik";
        }
       else  if (nilai >70 && nilai <=75){
            predikat =" c+";
            kategori = "cukup";
        }
      else  if (nilai >65 && nilai <+70){
            predikat =" c";
            kategori = "cukup";
        }
      else if (nilai >60 && nilai <=65){
            predikat =" c-";
            kategori = "cukup";
        }
      else if (nilai >55&& nilai <=65){
            predikat =" D+";
            kategori = "kurang";
        }
      else {
            predikat =" D";
            kategori = "kurang";
        }
        System.out.println("Nama "+ nama);
        System.out.println("Nilai "+ nilai );
        System.out.println("Predikat" + predikat);
        System.out.println("Kategori"+ kategori);
        
        } 
        
} 
        
    
    

