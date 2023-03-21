public class Node {
    int no;
    String isim;
    String soyisim;
    int vize;
    int fin;
    double ortalama;
    String durum;

    Node next; // bir sonraki öğrenciye bununla erişeceğim

    public Node(int no, String isim, String soyisim, int vize, int fin) {
        this.no = no;
        this.isim = isim;
        this.soyisim = soyisim;
        this.vize = vize;
        this.fin = fin;
        ortalama = vize * 0.4 + fin * 0.6;
        if (ortalama >= 50){
            durum = "Geçti";
        }
        else {
            durum = "Kaldı";

            next = null; // varsayılan
        }
    }
}
