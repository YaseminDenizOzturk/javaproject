public class App {
    public static void main(String[] args) throws Exception {

        dortgen d1 = new dortgen();
        d1.boyutlariGoster();

        d1.setGenislik(12);
        d1.boyutlariGoster();
        System.out.println("Dörtgenin Alanı: " + d1.alanHesabi());
        System.out.println("Dörtgenin Çevresi: " + d1.cevreHesabi());

        dortgen d2 = new dortgen(8);
        d2.boyutlariGoster();
        d2.setYukseklik(5);
        d2.boyutlariGoster();
        System.out.println("Dörtgenin Alanı: " + d2.alanHesabi());
        System.out.println("Dörtgenin Çevresi: " + d2.cevreHesabi());

        dortgen d3 = new dortgen(6, 18);
        d3.boyutlariGoster();
        System.out.println(d3.getYukseklik());
        System.out.println("Dörtgenin Alanı: " + d3.alanHesabi());
        System.out.println("Dörtgenin Çevresi: " + d3.cevreHesabi());

    }
}
