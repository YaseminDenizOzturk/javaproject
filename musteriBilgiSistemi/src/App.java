import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);

       MusteriListe musteri = new MusteriListe();

       int secim = -1;
       while ( secim != 0 ){
        System.out.println("1) Müşteri Ekle");
        System.out.println("2) Müşteri Sil");
        System.out.println("3) Müşteri Bilgisi Güncelle");
        System.out.println("4) Müşteri Ara");
        System.out.println("5) Müşteri Bilgisi Yazdır");
        System.out.println("0) Çıkış");
        System.out.println("Seçiminiz: ");
        secim = scanner.nextInt();
        scanner.nextLine();

        switch( secim ){
            case 1: musteri.musteriEkleme();
            break;
            case 2: musteri.musteriSilme();
            break;
            case 3: musteri.musteriBilgileriGuncelleme();
            break;
            case 4: musteri.musteriArama();
            break;
            case 5: musteri.listele();
            break;
            case 0: System.out.println("Sistemden Çıkış Yapılıyor...");
            System.out.println("***************************************");
            break;
            default : System.out.println("Hatalı Seçim Yaptınız!");
            break;
            
        }

       }

       scanner.close();
    }
}
