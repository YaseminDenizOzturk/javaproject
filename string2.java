public class string2 {

    public static void main(String[] args) {
        String a = "Java " + "Programlama " + "Dili";

        System.out.println(a);

        String b = "Java " +
                "Programlama " +
                "Dili ";
        System.out.println(b);

        // uzun ifadelerde string kullanırken toplama işlemi alt alta da yapılabilir.

        // String a = "Java"+"Programlama"+"Dili"; daha uzun ifadelerde kod satırının
        // yana doğru genişlemesi yerine alt alta yazabiliriz.

        /*
         * \t bir tab boşluk bırakır.( 4 boşluk )
         * \n bir alt satıra geçer.
         */

        String x = "Java\tProgramlama\tDili";
        System.out.println(x);

        String y = "Java\nProgramlama\nDili";
        System.out.println(y);

    }
}
