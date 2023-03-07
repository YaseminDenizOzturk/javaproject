import java.util.Scanner;

public class bedenkitleendeksi {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kilonuzu Giriniz: ");
        int kilo = scanner.nextInt();
        System.out.println("Boyunuzu Giriniz:(örnek = 1,72) "); 
        double boy = scanner.nextDouble();


        double bki = kilo /(boy*boy);
        System.out.println("Beden Kitle Endeksiniz: " + bki);

/*  System.out.println bir alt satıra geçmeyi sağlıyor ama System.out.print yazarsak değeri yanında alır. */
    scanner.close();

}
 }