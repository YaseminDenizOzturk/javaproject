public class App {
    public static void main(String[] args) {
        ListeQueue queue = new ListeQueue(5);
        queue.enQueue(12);
        queue.enQueue(22);
        queue.enQueue(36);
        queue.enQueue(39);
        queue.enQueue(48);
        System.out.println("Kuyruktaki Eleman Sayısı: " + queue.counter);
        System.out.println("Kuyruğun Başındaki Eleman: " + queue.front.data);
        System.out.println("Kuyruğun Sonundaki Eleman: " + queue.rear.data);
        queue.print();
        queue.enQueue(60);
        queue.enQueue(72);
        queue.print();
        queue.deQueue();
        queue.print();
        queue.deQueue();
        queue.print();
        queue.deQueue();
        queue.print();
        queue.deQueue();
        queue.print();
        queue.deQueue();
        queue.print();
        queue.enQueue(60);
        queue.print();

        System.out.println("Kuyruktaki Eleman Sayısı: " + queue.counter);
        System.out.println("Kuyruğun Başındaki Eleman: " + queue.front.data);
        System.out.println("Kuyruğun Sonundaki Eleman: " + queue.rear.data);
    }
}
