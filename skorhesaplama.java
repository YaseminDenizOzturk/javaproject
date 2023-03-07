public class skorhesaplama {
    public static void selamlama() {
        System.out.println("Skor Sistemine Hoşgeldiniz ");
    }

    public static void skorhesapla(String isim, int puan) {
        System.out.println(isim + " adlı kişinin " + puan + " puanı var.");
    }

    public static void skorhesapla(int puan) {
        System.out.println("isimsiz kişinin " + puan + " puanı var.");
    }

    public static void skorhesapla(String isim) {
        System.out.println(isim + " adlı kişinin hiç puanı yok.");

    }

    public static void main(String[] args) {
        selamlama();
        skorhesapla("Yasemin", 1000);
        skorhesapla("Deniz");
        skorhesapla(1500);
        /*
         * public static void toplama(String a,String b) {
         * 
         * System.out.println(a + " " + b);
         * }
         * public static void toplama(int a,int b) {
         * System.out.println("Toplamları = " + (a+b));
         * 
         * }
         * public static void toplama(int a,int b,int c) {
         * 
         * System.out.println("Toplamları = " + (a+b+c));
         * 
         * }
         */

    }

}
