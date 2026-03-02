/*Wahyu Adi Novresa - 255150707111003 - Kelas-A*/

import java.util.Scanner;
public class MainMobil {
public static void main(String[] args) {
    System.out.println();
    Mobil m1 = new Mobil();
    m1.setKecepatan(50);
    m1.setManufaktur("Toyota");
    m1.setNoPlat("AB 1231 UA");
    m1.displayMassage();
    System.out.println("==================================");
    
    Mobil m2 = new Mobil();
    m2.setKecepatan(100);
    m2.setManufaktur("Mitsubishi");
    m2.setNoPlat("N 1134 AG");
    m2.setWarna("Pink");
    m2.displayMassage();
    System.out.println("==================================");

    System.out.println("mobil pada objek m1 di rubah menjadi warna hijau");
    m1.setWarna("Hijau");
    m1.displayMassage();
    
    Scanner scan = new Scanner(System.in);
    Mobil m = new Mobil();

    System.out.println();

    System.out.print("Masukan Merk Mobil : ");
    m.setManufaktur(scan.nextLine());

    System.out.print("Masukan Plat Nomer : ");
    m.setNoPlat(scan.nextLine());

    System.out.print("Masukan Warna Mobil : ");
    m.setWarna(scan.nextLine());

    System.out.print("Masukan Kecepatan Km/h : ");
    m.setKecepatan(scan.nextInt());

    System.out.print("Masukan Waktu Tempuh Dalam Jam : ");
    m.setWaktu(scan.nextDouble());

    System.out.println(); // jarak rapih

    m.displayMassage();

    System.out.println(); // jarak rapih
    }
}