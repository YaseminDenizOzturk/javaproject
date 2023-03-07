public class Node {
    public int data;
    public Node next;
    //default consructor
    public Node(){
        this.next=null;
    }
    // parametreli constructor elimizde datasi olan bir node olusturmak istedigimizde bu calisir
    public Node(int data){
        this.data=data;
        this.next=null; 
    }
}