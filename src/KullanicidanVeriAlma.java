public class KullanicidanVeriAlma {
}import java.util.Scanner; // Scanner sınıfını kullanabilmek için bu satırı ekliyoruz.

public class KullanicidanVeriAlma {

    public static void main(String[] args) {
        // 1. Scanner nesnesi oluşturma
        // System.in, klavyeden veri girişi yapılacağını belirtir.
        Scanner klavye = new Scanner(System.in);

        // 2. Kullanıcıdan isim bilgisini isteme ve alma
        System.out.print("Lütfen isminizi giriniz: ");
        String isim = klavye.nextLine(); // Satır sonuna kadar olan tüm metni alır.

        // 3. Kullanıcıdan yaş bilgisini isteme ve alma
        System.out.print("Lütfen yaşınızı giriniz: ");
        int yas = klavye.nextInt(); // Girilen tam sayıyı alır.

        // 4. Alınan bilgileri ekranda gösterme
        System.out.println("\n--- Girilen Bilgiler ---");
        System.out.println("İsim: " + isim);
        System.out.println("Yaş: " + yas);

        // 5. Scanner nesnesini kapatma (kaynak sızıntısını önlemek için önemlidir)
        klavye.close();
    }
}

