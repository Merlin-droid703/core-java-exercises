public class SayiDurumu {
}import java.util.Scanner;
import java.util.InputMismatchException;

public class SayiDurumu {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        double sayi = 0; // Kullanıcının ondalıklı sayı girmesine izin vermek için double
        boolean validInput = false;

        // Kullanıcıdan geçerli bir sayı alana kadar sormaya devam et
        while (!validInput) {
            try {
                System.out.print("Lütfen bir sayı giriniz: ");
                sayi = klavye.nextDouble();
                klavye.nextLine(); // nextDouble() sonrası kalan newline karakterini tüket
                validInput = true; // Geçerli giriş yapıldı, döngüden çık
            } catch (InputMismatchException e) {
                System.out.println("Hatalı giriş! Lütfen geçerli bir sayı giriniz (örneğin, 5 veya -3.2).");
                klavye.nextLine(); // Hatalı girişi buffer'dan temizle
            }
        }

        // Sayının durumunu if-else if-else yapısıyla belirle
        if (sayi > 0) {
            System.out.println("Pozitif sayı");
        } else if (sayi < 0) {
            System.out.println("Negatif sayı");
        } else {
            System.out.println("Sayı sıfır");
        }

        klavye.close(); // Scanner nesnesini kapat
    }
}

