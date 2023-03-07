public class operatorler {

    public static void main(String[] args) {

/*      + --> Toplama Operatörü
        - --> Çıkarma Operatörü
        / --> Bölme Operatörü
        * --> Çarpma Operatörü
        % --> Kalan Operatörü

 */

        System.out.println(3 + 4.2);
        System.out.println(3 - 5f);
        System.out.println(10 / 4.0);
        System.out.println(3 * 4.5);
        System.out.println(10 % 4);


        // Atama ve Artırma operatörleri

        int a = 4;
         a = a + 2;
         System.out.println(a);

         int b = 3;
         b = b * 3;
         System.out.println(b);

        
// a = a + 2 ve a += 2 aynı şeyi ifade eder.

        int c = 60;
        c += 5;
        c *= 2;
        System.out.println(c);



        int x = 400;
        
        x++;

        int y = 176;

        y--;

        System.out.println(x);
        System.out.println(y);


// Postfix ve Prefix farkı : Postfixte güncellenmeyen o anki ifade yazılır. Prefixte güncellenmiş ifade yazılır.


        int z = 89;
        System.out.println(z++); //Postfix
        
        int t = 87;
        System.out.println(++t);  //Prefix






        
    }
}
