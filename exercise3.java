import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            int islem = scanner.nextInt();

            if (islem == -1){
                System.out.println("Döngüden çıkılıyor...");
                break;

            }
            System.out.println("İşlem: "+islem);


        }

        // continue kullanımı for döngüsünde nasıl olur?

        for ( int j = 0 ; j < 10 ;j++){
            if (j==3 || j==5){
                continue;
            }
            System.out.println("j= "+j);

        }


}

}