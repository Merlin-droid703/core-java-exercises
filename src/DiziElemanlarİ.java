public class DiziElemanlarİ {
}public class DiziElemanlari {

    public static void main(String[] args) {
        // 1. 5 elemanlı bir int dizisi oluştur ve değer ata
        int[] sayilar = new int[5]; // 5 elemanlı bir dizi için yer ayırır

        // Diziye elemanları atayalım (isteğe bağlı, farklı değerler de atanabilir)
        sayilar[0] = 10;
        sayilar[1] = 20;
        sayilar[2] = 30;
        sayilar[3] = 40;
        sayilar[4] = 50;

        // Alternatif olarak, diziyi doğrudan değerlerle de oluşturabilirsiniz:
        // int[] sayilar = {10, 20, 30, 40, 50};

        System.out.println("Dizinin elemanları:");

        // 2. Dizinin tüm elemanlarını for döngüsü ile ekrana yazdır
        // sayilar.length dizinin eleman sayısını verir (bu durumda 5)
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println("Dizinin " + i + ". indeksi: " + sayilar[i]);
        }
    }
}

