public class ListeQueue {
    Node front; 
    Node rear; 
    int counter;
    int size;

    public ListeQueue(int size) {
        this.size = size;
        counter = 0;
        front = null;
        rear = null;
    }

    void enQueue(int data) {
        if (isFull()) {
            System.out.println("Kuyruk Dolu Ekleme Başarısız!");
        } else {
            Node eleman = new Node(data);
            if (isEmpty()) {
                front = eleman;
                rear = eleman;
                System.out.println(data + " kuyruğa ilk eleman olarak eklendi...");

            } else {
                rear.next = eleman;
                rear = rear.next;
                System.out.println(data + " kuyruğa eklendi...");
            }
            counter++;
        }
    }

    void deQueue() {
        if (isEmpty()) {
            System.out.println("Kuyruk Boş! Silinecek Eleman Yok!");
        } else {
            System.out.println(front.data + " silindi...");
            front = front.next;
            counter--;

        }
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Kuyruk Boş Yazdırılacak Eleman Bulunamadı!");
        } else {
            Node temp = front;
            System.out.print("Başlangıç <---");
            while (temp != null) {
                System.out.print(temp.data + "<---");
                temp = temp.next;
            }
            System.out.println("<---Son");
        }
    }

    private boolean isEmpty() {
        return counter == 0;
    }

    private boolean isFull() {
        return counter == size;
    }
}
