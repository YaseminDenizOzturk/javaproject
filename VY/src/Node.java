public class Node {
    private int veri;
    private Node next;


    public Node(int deger){
        this.veri = deger;
        this.next = null;
    }

    public void yazdir(){
        System.out.println("" + this.veri);
    }
    public int getVeri(){
        return this.veri;
    }

    public void setVeri(int deger){
        this.veri=deger; // sette veriye bir değer atayabiliyorum.
    }
    public Node getNext(){
        return this.next;
    }
    public void setNext(Node ref){
        this.next = ref;
    }
    
}
