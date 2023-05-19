public class App {
    public static void main(String[] args) throws Exception {
        Tree binarySearchTree = new Tree();
        binarySearchTree.root = binarySearchTree.insert(binarySearchTree.root, 10);
        binarySearchTree.root = binarySearchTree.insert(binarySearchTree.root, 8);
        binarySearchTree.root = binarySearchTree.insert(binarySearchTree.root, 15);
        binarySearchTree.root = binarySearchTree.insert(binarySearchTree.root, 5);
        binarySearchTree.root = binarySearchTree.insert(binarySearchTree.root, 12);
        binarySearchTree.root = binarySearchTree.insert(binarySearchTree.root, 20);
        binarySearchTree.root = binarySearchTree.insert(binarySearchTree.root, 9);
        binarySearchTree.root = binarySearchTree.insert(binarySearchTree.root, 25);

        /*
         * System.out.println("Kök: " + binarySearchTree.root.data);
         * System.out.println("Kökün solu: " + binarySearchTree.root.left.data);
         * System.out.println("Kökün sağı: " + binarySearchTree.root.right.data);
         */
        System.out.print("preOrder'a göre dolaşma: ");
        binarySearchTree.preOrder(binarySearchTree.root);
        System.out.println();
        System.out.print("inOrder'a göre dolaşma: ");
        binarySearchTree.inOrder(binarySearchTree.root);
        System.out.println();
        System.out.print("postOrder'a göre dolaşma: ");
        binarySearchTree.postOrder(binarySearchTree.root);

        System.out.println("\n\n\nAğacın Yüksekliği: "+ binarySearchTree.height(binarySearchTree.root));
        System.out.println("\nAğaç üzerindeki eleman sayısı:  " + binarySearchTree.size(binarySearchTree.root));
    }
}
