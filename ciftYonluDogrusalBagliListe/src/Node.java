public class Node {
    int data;
    Node next;
    Node prev; // göstericilerimizi sınıf tipinden oluşturuyoruz.(node dan yani)

    public Node(int data) {
        this.data = data;
        // Bu sınıftan nesne oluşturan kişi datasını da eklemek zorunda.
        next = null; // varsayılan olarak atandı.
        prev = null; // varsayılan olarak atandı.
    }

}

