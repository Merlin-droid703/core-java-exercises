public class SayiToplami {
}import java.util.Scanner;
import java.util.InputMismatchException;

public class SayiToplami {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        int n = 0;
        long toplam = 0; // Toplam büyük bir sayı olabileceği için long kullanalım
        boolean validInput = false;

        // Kullanıcıdan pozitif bir tam sayı al
        while (!validInput) {
            try {
                System.out.print("Lütfen pozitif bir tam sayı (n) giriniz: ");
                n = klavye.nextInt();
                klavye.nextLine(); // nextInt() sonrası kalan newline karakterini tüket

                if (n > 0) {
                    validInput = true; // Geçerli pozitif giriş yapıldı
                } else {
                    System.out.println("Hatalı giriş! Lütfen pozitif bir tam sayı giriniz.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Hatalı giriş! Lütfen sayısal bir değer giriniz.");
                klavye.nextLine(); // Hatalı girişi buffer'dan temizle
            }
        }

        // 1'den n'e kadar olan sayıların toplamını hesapla
        for (int i = 1; i <= n; i++) {
            toplam += i; // toplam = toplam + i; ile aynı
        }

        // Toplamı ekranda göster
        System.out.println("1'den " + n + "'e kadar olan sayıların toplamı: " + toplam);

        klavye.close(); // Scanner nesnesini kapat
    }
}
