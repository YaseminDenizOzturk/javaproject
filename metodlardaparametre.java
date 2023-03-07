import java.util.Scanner;

public class metodlardaparametre {
    
       public static void toplama(int a,int b,int c){
        System.out.println("Toplamları = "+(a+b+c));
       }
       public static void giris(String isim){
        System.out.println("İşlem Servisimize Hoşgeldin, "+isim);

       } 
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Lütfen İsminizi Giriniz : ");
            String isim = scanner.nextLine();
            giris(isim);

            toplama(3,4,5);
            toplama(24,12,15);

}

}