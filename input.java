import java.util.Scanner;

public class input {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter your age: ");

        int age = scanner.nextInt();
        System.out.println("Your age: " + age);

        
        System.out.println("Please enter decimal number: ");

        double decimalnumber = scanner.nextDouble();
        System.out.println("The decimal number you entered: " + decimalnumber);


}
   }