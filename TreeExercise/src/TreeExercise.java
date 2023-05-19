public class TreeExercise {
    Node root;

    public TreeExercise() {
        root = null;
    }

    Node newNode(int y){
        root = new Node(y);
        return root;
    }

    Node insert(Node root,int y){
        if(root != null){
            if( y < root.data){
                root.left = insert(root.left,y);
            }
            else{ // y root'un datasına eşit veya büyükse burası çalışır.
                root.right = insert(root.right,y);
            }
        }
        else{
            root = newNode(y);
        }
        return root;

    }
    // ağaç üzerinde dolaşım şekilleri

    void inOrder(Node root){ // önce ağacın solu sonra kök sonra agacın sağ tarafı(ortada kök)
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }


    Node delete(Node root,int y){
        Node firstT,secondT;
        if(root == null){
            return null;
        }
        if(root.data == y){
            if(root.left == root.right){ // silinecek düğümün altında hiç dal yok.
                root = null;
                return null;
            }
            else if(root.left == null){
                firstT = root.right;
                return firstT;
            }
            else if(root.right == null){
                firstT = root.left;
                return firstT;
            }
            else {
                firstT = secondT = root.right;
               
                while(firstT.left != null){
                    firstT = firstT.left;
                }
                firstT.left = root.left;
                return secondT;
            }
        }
        else {
            if(y < root.data){
                root.left = delete(root.left,y);
            }
            else{
                root.right = delete(root.right,y);
            }
            return root;
        }
    }

    
}
