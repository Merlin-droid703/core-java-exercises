public class EnBuyukSayi {
}import java.util.Scanner;
import java.util.InputMismatchException;

public class EnBuyukSayi {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        double sayi1 = 0, sayi2 = 0, sayi3 = 0;
        boolean validInput;

        // Birinci sayıyı al
        validInput = false;
        while (!validInput) {
            try {
                System.out.print("Lütfen birinci sayıyı giriniz: ");
                sayi1 = klavye.nextDouble();
                klavye.nextLine(); // nextDouble() sonrası kalan newline'ı tüket
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Hatalı giriş! Lütfen geçerli bir sayı giriniz.");
                klavye.nextLine(); // Hatalı girişi buffer'dan temizle
            }
        }

        // İkinci sayıyı al
        validInput = false;
        while (!validInput) {
            try {
                System.out.print("Lütfen ikinci sayıyı giriniz: ");
                sayi2 = klavye.nextDouble();
                klavye.nextLine(); // nextDouble() sonrası kalan newline'ı tüket
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Hatalı giriş! Lütfen geçerli bir sayı giriniz.");
                klavye.nextLine(); // Hatalı girişi buffer'dan temizle
            }
        }

        // Üçüncü sayıyı al
        validInput = false;
        while (!validInput) {
            try {
                System.out.print("Lütfen üçüncü sayıyı giriniz: ");
                sayi3 = klavye.nextDouble();
                klavye.nextLine(); // nextDouble() sonrası kalan newline'ı tüket
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Hatalı giriş! Lütfen geçerli bir sayı giriniz.");
                klavye.nextLine(); // Hatalı girişi buffer'dan temizle
            }
        }

        double enBuyuk;

        // En büyük sayıyı belirle
        if (sayi1 >= sayi2 && sayi1 >= sayi3) {
            enBuyuk = sayi1;
        } else if (sayi2 >= sayi1 && sayi2 >= sayi3) {
            enBuyuk = sayi2;
        } else {
            enBuyuk = sayi3;
        }

        System.out.println("Girilen sayılar: " + sayi1 + ", " + sayi2 + ", " + sayi3);
        System.out.println("Bu sayılar arasında en büyük olan: " + enBuyuk);

        klavye.close();
    }
}
