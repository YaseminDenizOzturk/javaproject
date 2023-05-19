public class App {
    public static void main(String[] args) throws Exception {
        Tree tree1 = new Tree();
        tree1.binaryTreeyeDonusum("642+/dc-*");

        tree1.inOrder(tree1.root);
        System.out.println();
        tree1.postOrder(tree1.root);
        System.out.println();
        tree1.preOrder(tree1.root);
    }
}
