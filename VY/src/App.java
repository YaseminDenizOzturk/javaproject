public class App {
    public static void main(String[] args) throws Exception {
       /* Node l1 = new Node();
        l1.yazdir();

        Node l2 = new Node(5);
        l2.yazdir();
        */

        Tlist tlist = new Tlist();
        tlist.listeleme(); // liste boş diyor mu test etmek için yazdım.
        tlist.basaEkle(10);
        tlist.sonaEkle(20);
        tlist.basaEkle(30);
        tlist.sonaEkle(40);
        tlist.listeleme();
        

    }
}
