
import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("program hitung biaya pengirima");
        System.out.println("Masukkan berat paket (kg): ");
        double berat = input.nextDouble();

        System.out.println("masukkan jarak tempuh(km): ");
        double jarak = input.nextDouble();

        System.out.println("Masukkan panjang paket (cm): ");
        double panjang = input.nextDouble();

        System.out.println("Masukkan lebar paket (cm): ");
        double lebar = input.nextDouble();

        System.out.println("Masukkan tinggi paket (cm): ");
        double tinggi = input.nextDouble();

        //hitung volume 
        double volume = panjang*lebar*tinggi;

        //biaya per kg berdasarkan jarak
        double biayaPerkg;
        if (jarak <=10){
            biayaPerkg = 4250;
        }else {
            biayaPerkg = 6000;
        }
        //total biaya 
        double Totalbiaya = berat*biayaPerkg;

        //biaya tambahan jika volume > 100cm
        if (volume > 100){
            Totalbiaya +=50000;
        }
        //tampilkan hasil
        System.out.println("volume paket: " + volume + "cm");
        System.out.println("total biaya pengiriman: Rp " + Totalbiaya);
    }
}