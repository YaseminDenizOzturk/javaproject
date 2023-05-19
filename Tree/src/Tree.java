public class Tree {
    Node root;

    public Tree() {
        root = null;
    }

    Node newNode(int data) {
        root = new Node(data);
        return root;
    }

    Node insert(Node root, int data) {
        if (root != null) {
            if (data < root.data) {
                root.left = insert(root.left, data);
            } else { // ekleyeceğim düğümün datası root datasından büyük ya da eşitse burası çalışır.
                root.right = insert(root.right, data);
            }

        } else {
            root = newNode(data);
        }
        return root;
    }

    void preOrder(Node root) { // başta kök
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    void inOrder(Node root) { // ortada kök
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    void postOrder(Node root) { // sonda kök
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    int height(Node root) { // en alttaki düğümün rotta'a olan uzaklığını bulur.
        if (root == null) {
            return -1; // sadece kök varsa ağacın yüksekliği sıfır diyecek. ama burayı return 0;
                       // yapsaydım sadece kök olsa ağacın yüksekliği 1 olacaktı.
        } else {
            int sol = 0;
            int sag = 0;

            sol = height(root.left);
            sag = height(root.right);

            if (sol > sag) {
                return sol + 1;
            } else {
                return sag + 1;
            }
        }

    }

    int size(Node root) {
        if (root == null) {
            return 0;
        } else {
            return size(root.left) + 1 + size(root.right);
        }
    }

}
