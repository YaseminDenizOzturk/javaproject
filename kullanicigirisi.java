import java.util.Scanner;

public class kullanicigirisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int giris_hakki = 3;

        String sys_kullanici_adi = "Yasemin Deniz";
        String sys_parola = "12345";

        System.out.println("*****************************************");
        System.out.println("Kullanıcı Girişine Hoşgeldiniz...");
        System.out.println("*****************************************");

        while (true){

            System.out.print("Kullanıcı Adınız: ");
            String kullanici = scanner.nextLine();
            System.out.print("Parolanız: ");
            String parola = scanner.nextLine();

            if (kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)){
                System.out.println("Hoşgeldiniz, " +kullanici);
                break;
            }

            else if (kullanici.equals(sys_kullanici_adi) && !parola.equals(sys_parola)){
                System.out.println("Parolanız Yanlış!");
                giris_hakki = giris_hakki - 1;
                System.out.println("Kalan Giriş Hakkınız: "+giris_hakki);
            }

            else if (!kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)){
                System.out.println("Kullanıcı Adınız Yanlış!");
                giris_hakki -=1;
                System.out.println("Kalan Giriş Hakkınız: "+giris_hakki);

            }
            else {
                System.out.println("Kullanıcı Adınız ve Parolanız Yanlış!");
                giris_hakki -=1;
                System.out.println("Kalan Giriş Hakkınız: "+giris_hakki);

            }

            if ( giris_hakki ==0){
                System.out.println("Giriş Hakkınız Bitti. Daha sonra tekrar deneyiniz...");
                break;
            }
        }

   
}
}