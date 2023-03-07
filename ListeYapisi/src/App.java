import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        TekYonluListeYapisi tyList = new TekYonluListeYapisi();
        int sec = 1;
        int sayi=0;
        int indis=0;
        Scanner scanner = new Scanner(System.in);

        while (sec != 0) {
            System.out.println();
            System.out.println("Başa Ekleme: 1");
            System.out.println("Sona Ekleme: 2");
            System.out.println("Araya Ekleme: 3");
            System.out.println("Baştan Silme: 4");
            System.out.println("Sondan Silme: 5");
            System.out.println("Aradan Silme: 6");
            System.out.println("Çıkış: 0");
            System.out.println("Seçiminiz: ");
            sec = scanner.nextInt();

            if (sec == 1) {
                System.out.println("Sayı Giriniz :");
                sayi = scanner.nextInt();
                tyList.basaEkle(sayi);
            } else if (sec == 2) {
                System.out.println("Sayı Giriniz: ");
                sayi = scanner.nextInt();
                tyList.sonaEkle(sayi);

            } else if (sec == 3) {
                System.out.println("Sayı Giriniz: ");
                sayi = scanner.nextInt();
                System.out.println("İndisi Giriniz: ");
                indis = scanner.nextInt();
                    
                tyList.arayaEkle(indis, sayi);
            } else if (sec == 4) {
                tyList.bastanSilme();

            } else if (sec == 5) {
                tyList.sondanSilme();
            } else if (sec == 6) {
                System.out.println("İndis: ");
                indis = scanner.nextInt();
                tyList.aradanSilme(indis);
            } else if (sec == 0) {
                System.out.println("Çıkış Yapılıyor....");

            } else {
                System.out.println("Lütfen Geçerli Bir İşlem Seçiniz!");
  
            }
            tyList.yazdir();


        }
        scanner.close();

    }
}
