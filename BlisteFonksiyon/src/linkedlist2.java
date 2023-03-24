public class linkedlist2 {
    Node head; // ilk düğümü tutacak eleman
    int elemanSayisi;

    public linkedlist2() {
        head = null;
        elemanSayisi = 0;

    }

    public void viewList() {
        Node temp = head;
        if (temp == null) {
            System.out.println("Liste Boş Eleman Yok");
            return;
        }

        int sayac = 1;
        while (temp != null) {
            System.out.println(sayac + " . " + temp.data);
            temp = temp.next; // sıra temp in next ine geçecek ve sayac 1 arttırılacak while döngüsü şartı
                              // boyunca
            sayac++;
        }

    }

    public int elemanAdedi(int data) { 

        int sayac = 0;
        Node temp = head;
        if (Search(data) == -1) {
            System.out.println("Aradığınız Eleman Listede Yok...");
        } else {
            while (temp != null) {
                if (temp.data == data) {
                    sayac++;
                    temp = temp.next;
                } else {
                    temp = temp.next;

                }
            }

            System.out.println(sayac + "Adet Aradığınız Elemandan Bulunmuştur...");

        }
        return sayac;
    }

    public int kacAdetVarsaSil(int data) {

        
        if (Search(data) == -1) {
            System.out.println("Aradığınız Eleman Listede Yok*");
        } else {
            int kactane=elemanAdedi(data);
            while ( kactane != 0) {
                delete(data);
                kactane--;
            }
            System.out.println("Seçtiğiniz Eleman Tüm Listeden Silinmiştir!");

        }
        return 0;
    }

    public void addInOrder(Node n) {
        if (head == null) { // böyleyse bağlı listede hiç eleman yoktur gelen eleman ilk sıraya
                            // eklenecektir.
            head = n;
        } else if (head.data > n.data) { // böyleyse en başa ekleme kodu çalışması lazım
            n.next = head;
            head = n;
        } else { // hem sona hem araya ekleme
            Node temp = head;
            while (temp.next != null && temp.next.data < n.data) {
                // tempin nexti nulla eşit olmadığı sürece ve tempin nextinin datası yeni
                // ekleyeceğim node un datasından küçük olduğu sürece ilerlesin.
                // yani bu işlemle küçükten büyüğe sıralama yaptım
                temp = temp.next;
            }
            n.next = temp.next; // yeni düğümün nexti tempin nextini gösterecek.
            temp.next = n; // tempin nexti artık yeni düğüm olacak araya ekledim diye

        }
    }

    public int Search(int data) {
        int sayac = 0;
        Node temp = head;
        /* 2 1 3 */
        while (temp != null) {
            if (temp.data == data) {
                return sayac;
            } else {
                sayac++;
                temp = temp.next;

            }
        }
        return -1;
    }

    public void delete(int d) {// yani silmek istediği elemanı int olarak gönderecek
        if (head == null) {
            System.out.println("Liste Boş");
        } else if (head.data == d) {// d benim silmek istediğim değer
            // yani silmek istediğim düğüm ilk düğümse
            head = head.next;
        } else if (Search(d) == -1) {
            System.out.println("Aradıgınız eleman listede yok.");
        } else {
            Node temp = head;
            while (temp != null) { // temp in nexti null olmadığı sürece devam edecek.
                if (temp.next.data == d) {
                    temp.next = temp.next.next;
                    break;
                }
                // yani temp sileceğim elemandan bir önceki eleman olmalı
                temp = temp.next;
            }

        }

    }

    public void add(Node n) { // sonuna ekleme
        if (head == null) { // böyleyse bağlı listede hiç eleman yoktur gelen eleman ilk sıraya
                            // eklenecektir.
            head = n;

        } else {
            Node temp = head;
            while (temp.next != null) { // temp in nexti null olmadığı sürece devam edecek.
                temp = temp.next;

            }
            // while den çıktığı zaman demektir ki temp son elemana geldi sonrası null çünkü
            // sona ekleyeceğimi tempin sonrasına ekleyeceğim yani temp.next e
            temp.next = n;
        }
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-");
            temp = temp.next;

        }
        System.out.println();

    }

}