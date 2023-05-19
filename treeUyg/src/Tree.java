import java.util.Stack;

public class Tree {
    Node root; // kök düğümünü tanımladım.

    public Tree() {
        this.root = null;
    }

    public void binaryTreeyeDonusum(String expression) {
        Stack<Node> stack1 = new Stack<>();
        expression = expression + "#";
        int i = 0;
        char sembol = expression.charAt(i);
        Node newNode;

        while (sembol != '#') { // char olduğu için tek tırnak içinde yazmalıyız . çift tırnak içinde yazarsam
                                // string olarak algılar ve hata verir. bu işareti görene kadar while çalışacak.
            if ((sembol >= '0' && sembol <= '9') || (sembol >= 'a' && sembol <= 'z')) {
                // işlenen bir elemanla karşılaştığında(operand) düğüm oluşturup stack e atacak.
                newNode = new Node(sembol);
                stack1.push(newNode); // oluşturduğum yeni node u stack1 e ekliyorum.
            } else if (sembol == '+' || sembol == '-' || sembol == '*' || sembol == '/') {
                // işleyen bir elemanla karşılaştığında (operatör) düğüm oluşturur. stack1 den
                // ilk çekileni sağ , ikinci çekileni sol bağlantı yapar sonucu da stack1 e
                // gönderir.

                newNode = new Node(sembol);
                newNode.rightChild = stack1.pop(); // ilk çekileni sağ bağlantı
                newNode.leftChild = stack1.pop(); // ikinci çekileni sol bağlantı yapıyorum.
                stack1.push(newNode); // sonucu stack1 e ekliyorum.

            }
            sembol = expression.charAt(++i);

        }
        this.root = stack1.pop();

    }

    public void postOrder(Node localRoot) { // kökün sonda olduğu dolaşım
        if (localRoot != null) {
            postOrder(localRoot.leftChild);
            postOrder(localRoot.rightChild);
            localRoot.displayNode();
        }
    }

    public void inOrder(Node localRoot) { // kökün ortada olduğu dolaşım
        if (localRoot != null) {
            inOrder(localRoot.leftChild);
            localRoot.displayNode();
            inOrder(localRoot.rightChild);

        }
    }

    public void preOrder(Node localRoot) { // kökün başta olduğu dolaşım
        if (localRoot != null) {
            localRoot.displayNode();
            preOrder(localRoot.leftChild);
            preOrder(localRoot.rightChild);

        }
    }

}
