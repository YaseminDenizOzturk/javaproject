public class ciftyonludogrusalbagliliste {
    Node head = null; // en baştaki düğümü tutacak
    Node tail = null; // en sondaki düğümü tutacak

    public int sizeOf() {
        if (head == null) {
            return 0; // liste boşsa sıfır değeri döndürecek
        } else {
            Node temp = head;
            int sayac = 0;
            while (temp != null) {
                temp = temp.next;
                sayac++;
            }
            return sayac;
        }

    }

    void basaEkleme(int data) { // fonksiyonu çağıran içine datasını koyacak bu data da oluşturulan nesnenin
                                // elemanı olacak.
        Node eleman = new Node(data);
        if (head == null) {
            head = eleman;
            tail = eleman;
        } else {
            eleman.next = head;
            head.prev = eleman; // ileriye gidebileceğimiz gibi geriye de gidebilmeliyiz.
            head = eleman; // başa ekledik.
        }
    }

    void sonaEkleme(int data) { // fonksiyonu çağıran içine datasını koyacak bu data da oluşturulan nesnenin
                                // elemanı olacak.
        Node eleman = new Node(data);
        if (head == null) {
            head = eleman;
            tail = eleman;
        } else {
            tail.next = eleman;
            eleman.prev = tail; // önce çift yönlü olduğunu gösterdim.
            tail = eleman; // sonra yeni tailin eleman olduğunu gösterdim.
        }

    }

    void arayaEkleme(int indis, int data) {
        Node eleman = new Node(data);
        if (head == null) {
            head = eleman;
            tail = eleman;
        } else if (head != null && indis == 0) { // listede eleman vardır ama yine de sıfırıncı indise eklemek
                                                 // istiyoruz.
            eleman.next = head;
            head.prev = eleman;
            head = eleman;
        } else {
            int n = 0; // varsayılan
            Node temp = head;
            while (temp != null) {
                temp = temp.next;
                n++;
            }
            temp = head;
            if (indis > n) { // n eleman sayısı
                tail.next = eleman; // tailden sonra yeni eleman ekleme yapıyoruz bu if te
                eleman.prev = tail;
                tail = eleman;
            } else {
                int i = 0;
                while (i != indis) { // ekleyeceğim indisi bulunca while den çıkacak.
                    temp = temp.next;
                    i++;

                }
                eleman.prev = temp.prev;
                temp.prev.next = eleman; // ekleyeceğim düğümden önceki düğümün sonrası eleman olacak.
                eleman.next = temp;
                temp.prev = eleman;
            }

        }

    }

    void bastanSilme() {
        if (head != null) {
            if (head.next == null) { // tek düğüm varsa bu şeklide sildim.
                head = null;
                tail = null;
            } else { // else ye girerse listede birden fazla düğüm vardır.
                head = head.next;
                head.prev = null;

            }
        }
    }
    void sondanSilme() {//datayı alıp kullanmıyorsun ama alıyorsun ordada vermediğin için hata veriyor.
        if (head != null) {
            if (head.next == null) { // tek düğüm varsa bu şeklide sildim.
                head = null;
                tail = null;
            } else { // else ye girerse listede birden fazla düğüm vardır.
                tail = tail.prev;
                tail.next = null;

            }
        }
    }
    void aradanSilme(int indis){
        if ( head != null ){
            if ( head.next == null && indis == 0 ){ // listede tek düğüm var ve onu silmek istiyoruz
                head = null;
                tail = null;
            }
            else if ( head.next != null && indis == 0 ){ // listede başka düğümler de var ama ben headi silmek istiyorum
                head = head.next;
                head.prev = null;
            }
            else {
                int n = 0;
                Node temp = head;
                while ( temp != null ){
                    n++; // listede kaç düğüm olduğunu bulacağız.
                    temp = temp.next; 
                }
                if ( indis == (n-1) ){
                    tail = tail.prev;
                    tail.next = null;
                }
                else {
                    temp = head;
                    int i = 0;
                    while ( i < indis ){
                        i++;
                        temp = temp.next; // temp silinecek olan düğümün üzerine geldiğinde while döngüsünden çıkılır.
                    }
                    temp.next.prev = temp.prev;
                    temp.prev.next = temp.next;
                }
            }
        }

    }

    void sondanBasaYazdir() {
        Node temp = tail;
        System.out.print("Son -> ");
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.prev;
        }
        System.out.println("Başlangıç");

    }

    void listeyiGoster() {
        Node temp = head;
        if (temp == null) {
            System.out.println("Liste Boş Eleman Yok");
            return;
        }

        int sayac = 1;
        while (temp != null) {
            System.out.println(sayac + " - " + temp.data);
            temp = temp.next; // sıra temp in next ine geçecek ve sayac 1 arttırılacak while döngüsü şartı
                              // boyunca
            sayac++;
        }
    }

}
