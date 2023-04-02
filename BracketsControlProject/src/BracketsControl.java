public class BracketsControl {

    Node top;
    int count = 0;
    int count2;
    int size;
    

    public BracketsControl(int size) {
        this.size = size;
        top = null; // varsayılan olarak null atadım.
    }

   

    public void push(char data) {
        if (isFull()) {
            System.out.println("Stack Dolu!");
        } else {
            Node bracket = new Node(data);
            if (top == null) {
                top = bracket;
                return;
            } else {
                bracket.next = top;
                top = bracket; // top ı güncelledim artık yeni top bracket.
                count++; // eklediğim için sayacı bir artırıyorum.
            }
        }
    }

    public char pop() {
        if (isEmpty()) {
            return 0;
        } else {
            char temp = top.data;
            top = top.next;
            count--; // sildiğim için sayacı bir azaltıyorum.
            return temp;
        }
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Stack Boş Yazdırılacak Öge Bulunamadı!");
        } else {
            Node temp = top;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public char peek() { // top ı gösterir.
        if (isEmpty()) {
            return 0;
        } else {
            return top.data;
        }
    }

    void search(char data) {
        Node temp = top; // aramayı top tan başlattım
        count2 = 0;
        while (temp != null) {
            if (temp.data == data) { // eğer temp aradığım elemanın üzerinde ise bu if çalışır.
                System.out.println(count2);
                return;
            } else {
                temp = temp.next; // eğer temp aradığım elemanın üzerinde değilse bulana kadar ilerlemeye devam
                                  // eder.
                count2++; // indis numarasını da verebilmemiz için sayacı artırmalıyız.
            }
        }
        System.out.println("Böyle Bir Eleman Bulunamadı!");
    }

    boolean isEmpty() {
        return count == 0;
    }

    boolean isFull() {
        return count == size;
    }

}
