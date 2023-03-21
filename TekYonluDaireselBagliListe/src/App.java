import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
       TyDaireselBagliListe liste = new TyDaireselBagliListe();
       int secim = -1;
       while( secim != 0 ){
        System.out.println("1) Başa Ekle");
        System.out.println("2) Sona Ekle");
        System.out.println("3) Araya Ekle");
        System.out.println("4) Baştan Sil");
        System.out.println("5) Sondan Sil");
        System.out.println("6) Aradan Sil");
        System.out.println("0) Çıkış");
        System.out.println("Seçiminiz: ");

        secim = scanner.nextInt();
        scanner.nextLine();

        switch ( secim ){
            case 1: liste.basaEkleme();
            break;
            case 2: liste.sonaEkleme();
            break;
            case 3: liste.arayaEkleme();
            break;
            case 4: liste.bastanSil();
            break;
            case 5: liste.sondanSil();
            break;
            case 6: liste.aradanSil();
            break;
            case 0: System.out.println("Çıkış Yapılıyor...");
            break;
            default : System.out.println("Hatalı Seçim Yaptınız!!!");
        }
        liste.print();

        
       }
    }
}
