import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yas1 = scanner.nextInt();
        int yas2 = scanner.nextInt();
        int yas3 = scanner.nextInt();
        scanner.nextLine();
        String isim = scanner.nextLine();

        System.out.println("Yas1=" + yas1 + " Yas2=" + yas2 + " Yas3=" + yas3);

        System.out.println("isim:" + isim);
    scanner.close();

    }
}