import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       

        System.out.println("Lütfen bir işlem numarası giriniz: ");
        int islem = scanner.nextInt();


        switch ( islem ){

            case 1:
                System.out.println("1.işlem");
                break;
            
            case 2: 
                System.out.println("2.işlem"); 
                break;

            case 3:
                System.out.println("3.işlem");
                break;

            case 4:
                System.out.println("4.işlem");
                break; 

            default:
                System.out.println("Geçersiz işlem");
                break;

            
        











        }

    
}

}