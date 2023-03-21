import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        String secim = ""; // varsayılana -1 verdim.
        ogrkayit teknolojiFakultesi = new ogrkayit();

        Scanner scanner = new Scanner(System.in);

        while( true ){
            System.out.println("Teknoloji Fakültesi Öğrenci Bilgileri Kayıt Sistemi");
            System.out.println("****************************************************");
            System.out.println("Yeni Öğrenci Kaydı İçin 1'e Basınız");
            System.out.println("Öğrenci Kaydını Silmek İçin 2'ye Basınız");
            System.out.println("Tüm Öğrenci Kayıtlarını Lİstelemek İçin 3'e Basınız");
            System.out.println("Okul Birincisi Öğrenci Bilgileri İçin 4'e Basınız");
            System.out.println("Çıkış için q'a  Basınız");//
            System.out.println("****************************************************");
            System.out.println("Seçiminiz: ");

            secim = scanner.nextLine();
            

            if ( secim.equals("1") ){
                teknolojiFakultesi.bilgiEkle();
            }
            else if ( secim.equals("2")){
                teknolojiFakultesi.bilgiSil();

            }
            else if ( secim.equals("3")){
                teknolojiFakultesi.bilgileriGoster();

            }
            else if ( secim.equals("4")){
                teknolojiFakultesi.okulBirincisi();
            }
            else if ( secim.equals("q")){
                System.out.println("Program Sonlandırılıyor");
                break;
            }
            else {
                System.out.println("Geçersiz İşlem Seçtiniz!");
            }
                


        }
        scanner.close();
    }
    
    
}
