public class TekYonluListeYapisi {

    Node head = null;
    Node tail = null;

    void basaEkle(int x) {
        Node eleman = new Node();
        eleman.data = x;

        if (head == null) {
            eleman.next = null;
            head = eleman;
            tail = eleman;
            System.out.println("Liste Yapısı Oluşturuldu İlk Eleman Eklendi.");
        } else {
            eleman.next = head;
            head = eleman;
            System.out.println("Başa Eleman Eklendi.");
        }
    }

    void sonaEkle(int x) {
        Node eleman = new Node();
        eleman.data = x;

        if (head == null) {
            eleman.next = null;
            head = eleman;
            tail = eleman;
            System.out.println("Liste Yapısı Oluşturuldu İlk Eleman Eklendi.");
        } else {
            eleman.next = null;
            tail.next = eleman;
            tail = eleman;
            System.out.println("Sona Eleman Eklendi.");
        }
    }

    void arayaEkle(int indis, int x) {

        Node eleman = new Node();
        eleman.data = x;

        if (head == null && indis == 0) {
            eleman.next = null;
            head = eleman;
            tail = eleman;
            System.out.println("Liste Yapısı Oluşturuldu İlk Eleman Eklendi.");
        } else if (head != null && indis == 0) {
            eleman.next = head;
            head = eleman;
            System.out.println(indis + " İndisinci Sıraya Yeni Eleman Eklendi.");
        } else if (head == null && indis >= 0) {
            System.out.println("Listede henüz eleman yok");
        }

        else {

            int n = 0;
            Node temp = head;
            Node temp2 = head;

            while (temp.next != null) {
                n++;
                temp2 = temp;
                temp = temp.next;
            }

            if (n == indis) { // sondaki düğümden hemen önceki yere ekleme yapmak için
                temp2.next = eleman;
                eleman.next = temp;
                System.out.println("Eleman eklendi");
            } else {
                temp = head;
                temp2 = head;
                
                int i = 0;

                while (i != indis) {
                    temp2 = temp;
                    temp = temp.next;
                    i++;
                }

                temp2.next = eleman;
                eleman.next = temp;
                System.out.println(indis + " sıraya eleman eklendi");
            }
        }
    }

    void bastanSilme() {
        if (head == null) {
            System.out.println("Liste Boş Silinecek Eleman Yok!");
        } else if (head.next == null) {
            head = null;
            tail = null;
            System.out.println("Listede Kalan Son Elemanda Silindi.");
        } else {
            head = head.next;
            System.out.println("Listenin Başındaki Eleman Silindi");
        }
    }

    void sondanSilme() {
        if (head == null) {
            System.out.println("Liste Boş Silinecek Eleman Yok!");
        } else if (head.next == null) {
            head = null;
            tail = null;
            System.out.println("Listede Kalan Son Elemanda Silindi.");
        } else {
            Node temp = head;
            Node temp2 = head;
            while (temp.next != null) {
                temp2 = temp;
                temp = temp.next;
            }
            temp2.next = null;
            tail = null;
            System.out.println("Listede Sondan Eleman Silindi.");
        }
    }

    void aradanSilme(int indis) {
        if (head == null) {
            System.out.println("Liste Boş Silinecek Eleman Yok!");
        } else if (head.next == null && indis == 0) {
            head = null;
            tail = null;
            System.out.println("Listede Kalan Son Eleman Silindi.");
        } else if (head.next != null && indis == 0) {
            head = head.next;
            System.out.println("Liste Başındaki Eleman Silindi.");
        }

        else {
            int i = 0;
            Node temp = head;
            Node temp2 = head;

            while (temp != null) {
                i++;
                temp2 = temp;
                temp = temp.next;
            }
            if (i == indis) {
                temp2.next = null;
                tail = temp2;
                System.out.println("Listede Sonuncu Eleman Silindi.");
            } else {
                temp = head;
                temp2 = head;

                int j = 0;
                while (j != indis) {
                    temp2 = temp;
                    temp = temp.next;
                    j++;
                }

                temp2.next = temp.next;
                System.out.println(" Aradaki Eleman Silindi.");
            }

        }

    }

    void yazdir() {
        if (head == null) {

            System.out.println("Liste Yapısı Boş!");
        } else {
            Node temp = head;
            System.out.print("Baş ->");

            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }

        }
        System.out.print("Son  ");
    }

}
