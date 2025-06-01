public class GeriSayimWhile {
}public class GeriSayimWhile {

    public static void main(String[] args) {
        int sayac = 10; // Başlangıç değerimizi 10 olarak ayarlıyoruz

        // while döngüsü: sayac 1'den büyük veya eşit olduğu sürece devam eder
        while (sayac >= 1) {
            System.out.println(sayac); // Sayacın o anki değerini yazdır
            sayac--; // Sayacı bir azalt (sayac = sayac - 1 ile aynı)
        }
    }
}
