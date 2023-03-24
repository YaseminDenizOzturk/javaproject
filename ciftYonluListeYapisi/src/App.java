import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        ciftYonluListeYapisi cydl = new ciftYonluListeYapisi();
        int secim = -1; // varsayılan
        while (secim != 0) {
            System.out.println("\n1)Başa Ekle");
            System.out.println("2)Sona Ekle");
            System.out.println("3)Araya Ekle");
            System.out.println("4)Yazdır ");
            System.out.println("5)Tersten Yazdır");
            System.out.println("6)Baştan Silme");
            System.out.println("7)Sondan Silme");
            System.out.println("8)Aradan Silme");
            System.out.println("0)Çıkış");
            System.out.println("Seçiminiz: ");
            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    cydl.basaEkle();
                    break;
                case 2:
                    cydl.sonaEkle();
                    break;
                case 3:
                    cydl.arayaEkle();
                    break;
                case 4:
                    cydl.print();
                    break;
                case 5:
                    cydl.terstenYazdir();
                    break;
                case 6:
                    cydl.bastanSilme();
                    break;
                case 7:
                    cydl.sondanSilme();
                    break;
                case 8:
                    cydl.aradanSilme();
                    break;
                case 0:
                    System.out.println("Çıkış Yapılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz Giriş!");
                    break;

            }
            cydl.print();

        }
        scanner.close();
    }
   
}
