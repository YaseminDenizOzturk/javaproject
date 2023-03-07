import java.util.Scanner;

public class sayininrakamlaritoplami {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");

        int sayi = scanner.nextInt();

        int toplam = 0;

        do{
            toplam += sayi%10;
            sayi = sayi / 10;
          }while (sayi > 0);

          System.out.println("Sayınızın rakamları toplamı : "+toplam);
   
}

}
