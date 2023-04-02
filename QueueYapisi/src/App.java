public class App {
    public static void main(String[] args) {
        QueueYapisi queue = new QueueYapisi(5);
        queue.enQueue(20);
        queue.enQueue(40);
        queue.enQueue(50);
        queue.enQueue(60);
        queue.enQueue(70);
        System.out.println("Kuyruğun Başındaki Eleman: " + queue.dizi[queue.front]);
        System.out.println("Kuyruğun Sonundaki Eleman: " + queue.dizi[queue.rear]);
        queue.print();
        queue.elemanSayisi();
        queue.enQueue(80);
        queue.elemanSayisi();
        queue.enQueue(90);
        queue.enQueue(65);
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.enQueue(65);
        queue.elemanSayisi();
    }
}
