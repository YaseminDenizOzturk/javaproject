public class App {
    public static void main(String[] args)  {
        linkedlist2 ll = new linkedlist2();
        Node n1 = new Node(5);
        Node n2 = new Node(5);
        Node n3 = new Node(9);
        Node n4 = new Node(20);
        Node n5 = new Node(20);
        Node n6 = new Node(5);
        Node n7 = new Node(20);
        Node n8 = new Node(10);
       
        
        

        
        ll.addInOrder(n1);
        ll.print();
        ll.addInOrder(n2);
        ll.print();
        ll.addInOrder(n3);
        ll.print();
        ll.addInOrder(n4);
        ll.print();
        ll.addInOrder(n5);
        ll.print();
        ll.addInOrder(n6);
        ll.print();
        ll.addInOrder(n7);
        ll.print();
        ll.addInOrder(n8);
        ll.print();
       
        

      /*   ll.delete(25);
        ll.delete(20);
        ll.delete(12);
        ll.delete(9);
        ll.delete(15);
        ll.delete(5);
        ll.delete(25);
        ll.delete(0);
        (System.out.println(ll.Search(30));
         ll.elemanAdedi(5);
        ll.elemanAdedi(20);
        ll.elemanAdedi(19);
        ll.elemanAdedi(9); */
        ll.kacAdetVarsaSil(9);

   


       
        ll.print();

       
        



       
    }
}
