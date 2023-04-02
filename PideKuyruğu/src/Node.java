public class Node {
    String isim;
    int pideAdedi;
    int ucret;
    Node next;

    public Node(String isim, int pideAdedi) {
        this.isim = isim;
        this.pideAdedi = pideAdedi;
        ucret = pideAdedi * 15;
        next = null;
    }

}
