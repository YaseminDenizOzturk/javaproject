public class App {
    public static void main(String[] args) throws Exception {
        TreeExercise t1 = new TreeExercise();

        t1.root = t1.insert(t1.root,10);
        t1.root = t1.insert(t1.root,5);
        t1.root = t1.insert(t1.root,15);
        t1.root = t1.insert(t1.root,20);
        t1.root = t1.insert(t1.root,4);
        t1.root = t1.insert(t1.root,8);
        t1.root = t1.insert(t1.root,12);

        t1.inOrder(t1.root); 

        t1.root =t1.delete(t1.root,4);
        System.out.println();
        System.out.println("Silme İşleminden Sonra...");
        
        t1.inOrder(t1.root); 
    }
}
