import java.util.Scanner;

public class sayinindurumu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sayi;

        System.out.println("Lütfen bir sayı giriniz: ");
        sayi = scanner.nextInt();

        if (sayi > 0) {

            System.out.println("Sayınız pozitif");

        }
        else if ( sayi < 0){

            System.out.println("Sayınız negatif");

        }

        else {
            System.out.println("Sayınız sıfır");

        }


    
}

}