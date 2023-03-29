import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Stack te Kaç Eleman Olacak?");
        int n = scanner.nextInt();
        stackYapisi stack1 = new stackYapisi(n);

        int secim = -1;
        int sayi;
        while (secim != 0) {
            System.out.println("1)Stack e Ekle");
            System.out.println("2)Stack ten Çıkar");
            System.out.println("3)Top ı göster");
            System.out.println("4)Yazdır");
            System.out.println("5)Eleman Ara");
            System.out.println("0)Çıkış");
            System.out.println("Seçiminiz: ");
            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    System.out.println("Sayı: ");
                    sayi = scanner.nextInt();
                    stack1.push(sayi);
                    break;

                case 2:
                    stack1.pop();
                    break;

                case 3:
                    stack1.peek();
                    break;

                case 4:
                    stack1.print();
                    break;
                case 5:
                    System.out.println("Aradığınız Eleman: ");
                    sayi = scanner.nextInt();
                    stack1.search(sayi);
                    break;

                case 0:
                    System.out.println("Çıkış Yapılıyor...");
                    break;

                default:
                    System.out.println("Hatalı Seçim Yaptınız! ");
                    break;
            }

        }

    }
}
