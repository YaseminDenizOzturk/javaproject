import java.util.Scanner;

public class input2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("lütfen bir yazı giriniz: ");
        String yazi = scanner.nextLine();
        System.out.println("Yazı: "+yazi);

        System.out.println("Lütfen bir sayı giriniz");
    
        if (scanner.hasNextInt()) {
            int sayi = scanner.nextInt();
            System.out.println("Sayı: "+sayi);
        }
        else {

            System.out.println("Lütfen bir sayı giriniz...!");
            
         }







}
   }