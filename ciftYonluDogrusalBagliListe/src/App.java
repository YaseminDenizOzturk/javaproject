import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ciftyonludogrusalbagliliste cyl = new ciftyonludogrusalbagliliste();

        String islem;
        int sayi;
        int indis;

        while (true) {
            System.out.println("Lütfen İşlem Seçiniz:");
            System.out.println("1- basa ekle ");
            System.out.println("2- sona ekle ");
            System.out.println("3- Listeyi Göster");
            System.out.println("4-Listeyi Sondan Başa Yazdır");
            System.out.println("5-Araya Ekle");
            System.out.println("6-Baştan Sil");
            System.out.println("7-Sondan Sil");
            System.out.println("8-Aradan Sil");
            System.out.println("0 - Çıkış");
            System.out.println("Seçiminiz: ");
            islem = scanner.nextLine();

            /*
             * if ( secim == 1){
             * System.out.println("Sayı Giriniz: ");
             * sayi = scanner.nextInt();
             * cyl.basaEkleme(sayi);
             * 
             * }
             * else if ( secim == 2){
             * System.out.println("Sayı Giriniz: ");
             * sayi = scanner.nextInt();
             * cyl.sonaEkleme(sayi);
             * 
             * }
             * else if ( secim == 3){
             * cyl.listeyiGoster();
             * }
             * else if (secim == 0){
             * System.out.println("Program Sonlandırılıyor...");
             * break;
             * }
             * else {
             * System.out.println("Hatalı Giriş!");
             * 
             * }
             */

            if (islem.equals("1")) {
                System.out.println("Sayı Giriniz: ");
                sayi = scanner.nextInt();
                scanner.nextLine();
                cyl.basaEkleme(sayi);

            }

            else if (islem.equals("2")) {
                System.out.println("Sayı Giriniz: ");
                sayi = scanner.nextInt();
                scanner.nextLine();
                cyl.sonaEkleme(sayi);

            }

            else if (islem.equals("3")) {
                cyl.listeyiGoster();

            } else if (islem.equals("4")) {
                cyl.sondanBasaYazdir();

            } else if (islem.equals("5")) {

                System.out.println("İndis Giriniz");
                indis = scanner.nextInt();
                scanner.nextLine();

                if (indis > cyl.sizeOf()) {
                    System.out.println("Böyle bir indis değeri yok");
                } else {
                    System.out.println("Sayı Giriniz: ");
                    sayi = scanner.nextInt();
                    scanner.nextLine();
                    cyl.arayaEkleme(indis, sayi);
                }
            } else if (islem.equals("6")) {
                cyl.bastanSilme(); 

            } else if (islem.equals("7")) {
                cyl.sondanSilme();

            } else if (islem.equals("8")) {
                System.out.println("Silmek İstediğiniz Elemanın İndisini Giriniz: ");
                indis = scanner.nextInt();
                scanner.nextLine();

                if (indis > cyl.sizeOf()) {
                    System.out.println("Böyle bir indis değeri yok");
                } else {
                    cyl.aradanSilme(indis);
                }
            }

            else if (islem.equals("0")) {
                System.out.println("Programdan Çıkılıyor...");
                break;
            } else {
                System.out.println("Hatalı Giriş!");
            }

        }
        scanner.close();
    }
}
