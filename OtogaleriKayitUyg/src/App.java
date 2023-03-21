import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        OtogaleriKayit otokayit = new OtogaleriKayit();
        Scanner scanner = new Scanner(System.in);

        int secim = -1;
        while (secim != 0) {
            System.out.println(" 1) Araç Ekleme ");
            System.out.println(" 2) Araç Silme ");
            System.out.println(" 3) Araç Bul ");
            System.out.println(" 4) Araç Bilgileri Yazdır ");
            System.out.println(" 0) Sistemden Çıkış ");
            System.out.println("İşlem Numarası Giriniz: ");
            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    otokayit.aracEkle();
                    break;
                case 2:
                    otokayit.aracSil();
                    break;
                case 3:
                    otokayit.aracıBul();
                    break;
                case 4:
                    otokayit.print();
                    break;
                case 0:
                    System.out.println("Sistemden Çıkılıyor...");
                    break;
                default:
                    System.out.println(" Geçersiz İşlem !");
                    break;
            }

        }

    }
}
