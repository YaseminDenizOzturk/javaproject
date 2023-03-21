public class Node {
    int id;
    String isim;
    String soyisim;
    String telefonNo;
    String adresBilgisi;
    String urunBilgisi;

    Node next;
    Node prev;

    public Node(int id, String isim, String soyisim, String telefonNo, String adresBilgisi, String urunBilgisi) {
        this.id = id;
        this.isim = isim;
        this.soyisim = soyisim;
        this.telefonNo = telefonNo;
        this.adresBilgisi = adresBilgisi;
        this.urunBilgisi = urunBilgisi;
        next = null; // varsayılan
        prev = null; // varsayılan

    }

}
