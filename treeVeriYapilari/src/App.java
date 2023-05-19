public class App {
    public static void main(String[] args) throws Exception {
        Tree tree1 = new Tree();
        tree1.agacaEkleme(23);
        tree1.agacaEkleme(12);
        tree1.agacaEkleme(33);
        tree1.agacaEkleme(4);
        tree1.agacaEkleme(5);
        tree1.agacaEkleme(55);
        tree1.agacaEkleme(15);
        tree1.inOrder(tree1.root);
    }
}
