import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int n;
        int secim = -1;
        System.out.println("Kurs Kontenjanını Belirleyiniz: ");
        n = scanner.nextInt();

        kursKayitStack stack1 = new kursKayitStack(n);

        while( secim != 0 ){
            System.out.println("1-)Kursa Kayıt İşlemi");
            System.out.println("2-)En Son Kaydı Silme İşlemi");
            System.out.println("3-)Tüm Kurs Kayıtlarını Listeleme İşlemi");
            System.out.println("4-)En Son Kayıtlı Kişi Bilgilerini Gösterme İşlemi");
            System.out.println("5-)Kalan Kontenjan Bilgilerini Gösterme İşlemi");
            System.out.println("0-)Çıkış Yapmak İçin");
            System.out.println("İşlem Seçiminiz: ");
            secim = scanner.nextInt();

            switch( secim ){
                case 1: stack1.push();
                break;
                case 2: stack1.pop();
                break;
                case 3: stack1.print();
                break;
                case 4: stack1.sonKayıt();
                break;
                case 5: stack1.kalanKont();
                break;
                case 0: System.out.println("Çıkış Yapılıyor...");
                break;
                default: System.out.println("Geçersiz Giriş!!!");
                

            }
















        }
        
    }
}
