import java.util.Scanner;

public class basithesapmakinesi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("********************************************");
        String islemler = "1.Toplama işlemi\n"
                        +"2.Toplama işlemi\n"
                        +"3.Toplama işlemi\n"
                        +"4.Toplama işlemi";
        System.out.println(islemler);
        System.out.println("********************************************");
        System.out.println("İşlemi Seçiniz:");
        String islem = scanner.nextLine();
        int a;
        int b;
    

        switch(islem){
            case "1":
                System.out.print("Birinci sayı:");
                a = scanner.nextInt();
                System.out.print("İkinci sayı:");
                b = scanner.nextInt();
                System.out.println("Toplam: " + (a+b));
                break;

            case "2":
                System.out.print("Birinci sayı:");
                a = scanner.nextInt();
                System.out.print("İkinci sayı:");
                b = scanner.nextInt();
                System.out.println("Fark: " + (a-b));
                break;

            case "3":
                System.out.print("Birinci sayı:");
                a = scanner.nextInt();
                System.out.print("İkinci sayı:");
                b = scanner.nextInt();
                System.out.println("Çarpım: " + (a*b));  
                break;  

            case "4":
                System.out.print("Birinci sayı:");
                a = scanner.nextInt();
                System.out.print("İkinci sayı:");
                b = scanner.nextInt();
                System.out.println("Bölüm: " + ((double)a/b));
                break;
            
            default:
                System.out.println("Geçersiz İşlem");
        }


        
        
}

}