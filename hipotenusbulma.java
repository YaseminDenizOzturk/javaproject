import java.util.Scanner;

public class hipotenusbulma {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a;
        int b;

        System.out.println("Birinci Kenar: ");
        a = scanner.nextInt();

        System.out.println("İkici Kenar: ");
        b = scanner.nextInt();

        double hipotenus = Math.sqrt(a * a + b * b) ;

        System.out.println("Hipotenüs: " + hipotenus);


// Math.sqrt ile karekök alıyoruz.





    
}
}