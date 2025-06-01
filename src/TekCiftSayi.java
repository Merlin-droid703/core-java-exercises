public class TekCiftSayi {
}import java.util.Scanner;
import java.util.InputMismatchException;

public class TekCiftSayi {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        int sayi = 0; // Tek/çift kontrolü için tam sayı (int) daha uygundur
        boolean validInput = false;

        // Kullanıcıdan geçerli bir tam sayı alana kadar sormaya devam et
        while (!validInput) {
            try {
                System.out.print("Lütfen bir tam sayı giriniz: ");
                sayi = klavye.nextInt();
                klavye.nextLine(); // nextInt() sonrası kalan newline karakterini tüket
                validInput = true; // Geçerli giriş yapıldı, döngüden çık
            } catch (InputMismatchException e) {
                System.out.println("Hatalı giriş! Lütfen geçerli bir tam sayı giriniz (örneğin, 5 veya -10).");
                klavye.nextLine(); // Hatalı girişi buffer'dan temizle
            }
        }

        // Modulus operatörü (%) ile sayının tek mi çift mi olduğunu belirle
        if (sayi % 2 == 0) {
            System.out.println(sayi + " bir Çift sayıdır.");
        } else {
            System.out.println(sayi + " bir Tek sayıdır.");
        }

        klavye.close(); // Scanner nesnesini kapat
    }
}

