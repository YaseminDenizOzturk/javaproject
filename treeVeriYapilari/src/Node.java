public class Node {
    int x; // alınan veriye x dedim.
    Node leftChild;
    Node rightChild;

    public Node(int deger) {
        this.x = deger;
        this.leftChild = null;
        this.rightChild = null;
    }

    public void print() {
        System.out.println(this.x);
    }

}
