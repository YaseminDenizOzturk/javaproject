public class QueueYapisi {
    int[] dizi;
    int size; // dizinin kapasitesi
    int front; // dizinin sıfırıncı indisi
    int rear; // dizinin sonuncu indisi ( son eleman )

    public QueueYapisi(int size) {
        this.size = size;
        dizi = new int[size]; // kuyruk
        front = 0;
        rear = -1;
    }

    void enQueue(int data) { // sona eleman ekleme
        if (isFull()) {
            System.out.println("Kuyruk Dolu Ekleme Başarısız!");
        } else {
            rear++;
            dizi[rear] = data;
            System.out.println(dizi[rear] + "kuyruğa eklendi");
        }

    }

    void deQueue() {// baştan eleman çıkarma
        if (isEmpty()) {
            System.out.println("Kuyruk Boş Silme İşlemi Başarısız!");
        } else {
            int sayi = dizi[front];
            for (int i = 1; i <= rear; i++) {
                dizi[i - 1] = dizi[i]; // dizinin birinci değerini sıfırıncı değerine atamış oluyorum yani sıfırıncı
                                       // değeri siliyorum.
            }
            rear--;
            System.out.println(sayi + "kuyruktan çıkartıldı...");
        }

    }

    void elemanSayisi() {
        System.out.println("Eleman Sayısı: " + (rear + 1));
    }

    void print() {
        int i = rear; // sondan başa doğru yazdırmak için
        System.out.print("Son--->");
        while (i >= 0) {
            System.out.print(dizi[i] + "--->");
            i--;

        }
        System.out.println("Başlangıç");
    }

    private boolean isEmpty() {
        return rear == -1;
    }

    private boolean isFull() {
        return rear == size - 1;
    }

}
