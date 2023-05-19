public class Node {
    char data;
    Node leftChild; // sol düğümü tanımladım.
    Node rightChild; // sağ düğümü tanımladım.

    public Node(char k) {
        this.data = k;
        this.leftChild = null; // varsayılan olarak sol düğüme null atadım.
        this.rightChild = null; // varsayılan olarak sağ düğüme null atadım.
    }

    public void displayNode() {
        System.out.print(this.data); 
    }

}
