public class Switchcase {
}import java.util.Scanner;
import java.util.InputMismatchException;

public class HarfNotu {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        int not = -1; // Başlangıçta geçersiz bir değer atayalım
        char harfNotu = ' '; // Harf notunu saklamak için char
        boolean validInput = false;

        // Kullanıcıdan geçerli bir not alana kadar sormaya devam et (0-100 aralığında)
        while (!validInput) {
            try {
                System.out.print("Lütfen 0-100 arasında bir sayı notu giriniz: ");
                not = klavye.nextInt();
                klavye.nextLine(); // nextInt() sonrası kalan newline karakterini tüket

                if (not >= 0 && not <= 100) {
                    validInput = true; // Geçerli not girildi, döngüden çık
                } else {
                    System.out.println("Hatalı giriş! Not 0 ile 100 arasında olmalıdır.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Hatalı giriş! Lütfen sayısal bir değer giriniz.");
                klavye.nextLine(); // Hatalı girişi buffer'dan temizle
            }
        }

        // Notu 10'a bölerek switch-case için uygun bir değere dönüştür
        int anahtarDeger = not / 10;

        switch (anahtarDeger) {
            case 10: // 100 notu için
            case 9:  // 90-99 aralığı için
                harfNotu = 'A';
                break;
            case 8:  // 80-89 aralığı için
                harfNotu = 'B';
                break;
            case 7:  // 70-79 aralığı için
                harfNotu = 'C';
                break;
            case 6:  // 60-69 aralığı için
                harfNotu = 'D';
                break;
            default: // 0-59 aralığı için (anahtarDeger 0, 1, 2, 3, 4, 5 olur)
                harfNotu = 'F';
                break;
        }

        System.out.println("Girdiğiniz not: " + not);
        System.out.println("Harf notunuz: " + harfNotu);

        klavye.close(); // Scanner nesnesini kapat
    }
}

