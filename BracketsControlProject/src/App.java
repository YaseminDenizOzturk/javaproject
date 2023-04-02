import java.util.Scanner;
import java.util.Stack;

public class App {

    public static boolean checkBrackets(String str) {
        if (str.isEmpty()) {
            return true;
        }

        Stack<Character> stack = new Stack<Character>();

        char c;
        int i;
        for (i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            }
            if (c == '}' || c == ')' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char last;
                last = stack.peek();
                if (c == '}' && last == '{' || c == ')' && last == '(' || c == ']' && last == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str;
        String secim ="";
        while (true) {
            System.out.println("Kod Girmek İçin 1 e çıkış için 0 a basınız:");
            secim = scanner.nextLine();
            if (secim.equals("1")){
                System.out.print("Parantez Kontrolü Yapılacak Kodu Giriniz: ");
                str = scanner.nextLine();
                System.out.println(checkBrackets(str));
                
            }
            else if (secim.equals("0")) {
                System.out.println("Çıkış Yapılıyor...");
                break;
            }
            else {
                System.out.println("Hatalı Seçim!");
            }
            
           

        }
        scanner.close();
    }

}

