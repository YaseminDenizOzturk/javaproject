import java.util.Scanner;

public class mekanagirebilmedurumu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen Yaşınızı Giriniz: ");
        int yas = scanner.nextInt();

        if( yas < 18 ){

            System.out.println("Bu mekana giremezsiniz...");
        }

        else {
            System.out.println("Bu mekana girebilirsiniz...");

        }
    
}

}