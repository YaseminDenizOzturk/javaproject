public class Tree {
    Node root;

    public Tree() {
        this.root = null;
    }

    public void agacaEkleme(int deger){
        Node eleman = new Node(deger);

        if(this.root == null){
            this.root = eleman;
            System.out.println("Root: " + deger);
            return;
        }

        Node parent = null;
        Node temp = this.root;

        while(true){
            parent = temp;
            if(deger < temp.x){ // deger x ten küçükse sol bağlantıya
                temp = temp.leftChild;
                if(temp == null){
                    parent.leftChild = eleman;
                    System.out.println("Parent : " + parent.x + " soluna " + eleman.x + " eklendi ");
                    return;
                }
            }
            else if(deger > temp.x){ // deger x ten büyükse sağ bağlantıya 
                temp = temp.rightChild;
                if(temp == null){
                    parent.rightChild = eleman;
                    System.out.println("Parent: " + parent.x + " sağına " + eleman.x + " eklendi ");
                    return;
                }
            }
            else{
                System.out.println("Bu değer ağaçta var");
                return;
            }
        }

    }

    public void inOrder(Node localRoot){ 
        if(localRoot != null){
            inOrder(localRoot.leftChild);
            localRoot.print();
            inOrder(localRoot.rightChild);
            
        }

    }

    public void postOrder(Node localRoot){
        if(localRoot != null){
            postOrder(localRoot.leftChild);
            postOrder(localRoot.rightChild);
            localRoot.print();

        }
    }

    public void preOrder(Node localRoot){
        if(localRoot != null){
            localRoot.print();
            preOrder(localRoot.leftChild);
            preOrder(localRoot.rightChild);
        }
    }


}
