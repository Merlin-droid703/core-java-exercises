public class AritmetikIslemler {
}import java.util.Scanner;
import java.util.InputMismatchException;

public class DortIslem {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);

        double sayi1 = 0;
        double sayi2 = 0;
        boolean validInput = false;

        // Birinci sayıyı al
        while (!validInput) {
            try {
                System.out.print("Lütfen birinci sayıyı giriniz: ");
                sayi1 = klavye.nextDouble();
                klavye.nextLine(); // nextDouble() sonrası kalan newline karakterini tüket
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Hatalı giriş! Lütfen geçerli bir sayı giriniz.");
                klavye.nextLine(); // Hatalı girişi buffer'dan temizle
            }
        }

        validInput = false; // İkinci sayı için flag'i sıfırla

        // İkinci sayıyı al
        while (!validInput) {
            try {
                System.out.print("Lütfen ikinci sayıyı giriniz: ");
                sayi2 = klavye.nextDouble();
                klavye.nextLine(); // nextDouble() sonrası kalan newline karakterini tüket
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Hatalı giriş! Lütfen geçerli bir sayı giriniz.");
                klavye.nextLine(); // Hatalı girişi buffer'dan temizle
            }
        }

        // Toplama işlemi
        double toplam = sayi1 + sayi2;
        System.out.println(sayi1 + " + " + sayi2 + " = " + toplam);

        // Çıkarma işlemi
        double fark = sayi1 - sayi2;
        System.out.println(sayi1 + " - " + sayi2 + " = " + fark);

        // Çarpma işlemi
        double carpim = sayi1 * sayi2;
        System.out.println(sayi1 + " * " + sayi2 + " = " + carpim);

        // Bölme işlemi
        if (sayi2 == 0) {
            System.out.println("Bölme hatası: Bir sayı sıfıra bölünemez!");
        } else {
            double bolum = sayi1 / sayi2;
            System.out.println(sayi1 + " / " + sayi2 + " = " + bolum);
        }

        klavye.close(); // Scanner nesnesini kapat
    }
}

