import java.util.Scanner;

public class gelismisnothesaplama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vize1: "); 
        int vize1 = scanner.nextInt();

        System.out.print("Vize2: ");
        int vize2 = scanner.nextInt();

        System.out.print("Final: ");
        int finalnot = scanner.nextInt();


        double toplamnot =  (vize1*3/10.0)+(vize2*3/10.0) +  (finalnot *4/10.0);

        if (toplamnot >= 90){

            System.out.println("AA");
        }
        else if (toplamnot >= 85){

           System.out.println("BA");
         
        }
        else if (toplamnot >= 80){
            System.out.println("BB");

        }
        else if (toplamnot >= 75){
            System.out.println("CB");
        }

        else if (toplamnot >= 70){
            System.out.println("CC");
            
        }
        else if (toplamnot >= 65){
            System.out.println("DC");
            
        }
        else if (toplamnot >= 60){
            System.out.println("DD");
            
        }
        else if (toplamnot >= 55){
            System.out.println("FD");
            
        }

        
}
}