public class TemelVeriTipleri {
}
public class TemelVeriTipleri {

    public static void main(String[] args) {
        // ✅ Temel veri tipleriyle değişken tanımlama ve değer atama
        int tamSayi = 10;
        double ondalikliSayiDouble = 20.5;
        float ondalikliSayiFloat = 30.5f; // float için sonda 'f' veya 'F'
        boolean dogruMu = true;
        char karakter = 'A'; // Tek tırnak
        String metin = "Merhaba Java!"; // String bir sınıf olsa da temel gibi kullanılır

        // ✅ Değerleri ekrana yazdırma
        System.out.println("--- Temel Veri Tipleri ---");
        System.out.println("int Değeri: " + tamSayi);
        System.out.println("double Değeri: " + ondalikliSayiDouble);
        System.out.println("float Değeri: " + ondalikliSayiFloat);
        System.out.println("boolean Değeri: " + dogruMu);
        System.out.println("char Değeri: " + karakter);
        System.out.println("String Değeri: " + metin);

        System.out.println("\n--- Sabit Değişken (final) ---");

        // ✅ final anahtar kelimesiyle sabit değişken tanımlama ve yazdırma
        final double PI_SAYISI = 3.14159;
        System.out.println("Sabit PI Değeri: " + PI_SAYISI);

        // PI_SAYISI = 3.14; // Bu satır hata verir çünkü PI_SAYISI final'dır ve değeri değiştirilemez.
    }


