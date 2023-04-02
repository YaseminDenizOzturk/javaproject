public class Node {
    String tc;
    String isim;
    String soyisim;
    String bolum;

    Node next;

    public Node(String tc, String isim, String soyisim, String bolum) {
        this.tc = tc;
        this.isim = isim;
        this.soyisim = soyisim;
        this.bolum = bolum;
        next = null; // varsayılan
        
    }

   
}
