import java.util.Scanner;

public class fordongusu {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz :  ");

        int faktoriyel = 1;
        int sayi = scanner.nextInt();

        for(int i = 1; i<= sayi;i++){

            faktoriyel *= i;
            System.out.println("Faktöriyel = " + faktoriyel + " i = " + i);

        }

            System.out.println("Faktöriyel = "+ faktoriyel);







    
}

}