import java.util.Scanner;

public class PideKuyruğu {
    Scanner scanner = new Scanner(System.in);
    Node front;
    Node rear;
    int size;
    int counter;

    public PideKuyruğu(int size) {
        this.size = size;
        counter = 0;
        front = null;
        rear = null;

    }

    String isim;
    int pideAdedi;
    int toplamKazanc = 0;

    void enQueue() {
        if (isFull()) {
            System.out.println("Kuyruk Dolu Ekleme Başarısız!");
        } else {
            System.out.println("Müşteri İsmi: ");
            isim = scanner.nextLine();
            System.out.println(isim + " Adlı Müşterinin Aldığı Pide Adedi: ");
            pideAdedi = scanner.nextInt();
            scanner.nextLine();
            Node musteri = new Node(isim, pideAdedi);
            if (isEmpty()) {
                front = musteri;
                rear = musteri;
                System.out.println("İlk eleman kuyruğa eklendi...");
            } else {
                rear.next = musteri;
                rear = musteri;
                System.out.println(rear.isim + " kuyruğa eklendi...");
            }
            counter++;
        }
    }

    void deQueue() {
        if (isEmpty()) {
            System.out.println("Kuyruktan Silme Başarısız! Pide Kuyruğunda Müşteri Bulunmamaktadır...");
        } else {
            toplamKazanc += front.ucret;
            System.out.println(front.isim + " " + front.pideAdedi + " Adet Pide Almıştır Yapacağı Toplam Ödeme: "
                    + front.ucret + "TL ' dir...");
            front = front.next;
            counter--;

        }
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Kuyrukta Bekleyen Müşteri Bulunmamaktadır! Listeleme Yapılamadı...");
        } else {
            Node temp = front;
            while (temp != null) {
                System.out.print(temp.isim + "<---");
                temp = temp.next;
            }
            System.out.println(" Son");
        }
    }

    public boolean isEmpty() {
        return counter == 0;
    }

    public boolean isFull() {
        return counter == size;
    }

}
