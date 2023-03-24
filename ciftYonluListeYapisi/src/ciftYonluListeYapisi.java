import java.util.Scanner;

public class ciftYonluListeYapisi {

    Scanner scanner = new Scanner(System.in);
    Node head = null;
    Node tail = null;

    Node temp = null;
    Node temp2 = null;
    int data;
    int indis;

    void basaEkle() {
        System.out.println("data: ");
        data = scanner.nextInt();

        Node eleman = new Node(data);
        if (head == null) {
            head = eleman;
            tail = eleman;
            head.next = tail;
            tail.prev = head;
            head.prev = tail;
            tail.next = head;

        } else {// listede düğüm varsa elseye girecek.
            eleman.next = head;
            head.prev = eleman;

            head = eleman;// yeni headi eleman olarak güncelledim.
            tail.next = head;
            head.prev = tail;
        }
    }

    void sonaEkle() {
        System.out.println("data: ");
        data = scanner.nextInt();

        Node eleman = new Node(data);
        if (head == null) {
            head = eleman;
            tail = eleman;
            head.next = tail;
            tail.prev = head;
            head.prev = tail;
            tail.next = head;

        } else {// listede düğüm varsa elseye girecek.
            tail.next = eleman;
            eleman.prev = tail;
            tail = eleman;// yeni taili eleman olarak güncelledim.

            tail.next = head;
            head.prev = tail;
        }
    }

    void arayaEkle() {
        System.out.println("İndis: ");
        indis = scanner.nextInt();
        System.out.println("data: ");
        data = scanner.nextInt();

        Node eleman = new Node(data);
        if (head == null) {
            head = eleman;
            tail = eleman;
            head.next = tail;
            tail.prev = head;
            head.prev = tail;
            tail.next = head;

        } else if (indis == 0) {
            eleman.next = head;
            head.prev = eleman;
            head = eleman;
            tail.next = head;
            head.prev = tail;
        } else {
            temp = head;
            temp2 = temp;
            int n = 0;
            while (temp != tail) { // temp baştaki düğümden başlayıp sondaki düğüme kadar gidecek.
                n++;
                temp = temp.next;
            }
            temp = head;
            int i = 0;
            while (i < indis) {
                temp2 = temp;
                temp = temp.next;
                i++;
            } // while den çıktığı zaman temp indisinci değerde olur.

            if (n < indis) { // eleman sayısı kullanıcının girdiği indise eşitse son düğümün sonrasına
                              // eklemek istiyordur.
                // if in içi kullanıcıdan aldığım indis büyükse sona ekleme yapmak istiyor.
                tail.next = eleman;
                eleman.prev = tail;
                tail = eleman;// yeni taili eleman olarak güncelledim.

                tail.next = head;
                head.prev = tail;

            }
            else {
                temp2.next = eleman;
                eleman.prev = temp2;
                eleman.next = temp;
                temp.prev = eleman;
            }

            
        }
    }
    void bastanSilme(){
        if ( head == null ){
            System.out.println("Liste Boş!");
        }
        else if ( head == tail ){ // listede tek düğüm varsa 
            head = null;
            tail = null;
        }
        else {// bastan silme
            head = head.next;
            head.prev = tail;
            tail.next = head;
        }

    }
    void sondanSilme(){
        if ( head == null ){
            System.out.println("Liste Boş!");
        }
        else if ( head == tail ){ // listede tek düğüm varsa 
            head = null;
            tail = null;
        }
        else { // sondan silme
            temp = head;
            while ( temp.next != tail ){ // whileden çıkıldığında tempten sonraki düğüm taildir.
                temp = temp.next;
            }
            tail = temp;// taili sildim yeni tail artık temptir.
            tail.next = head;
            head.prev = tail;
        }

    }
    void aradanSilme(){
        if ( head == null ){
            System.out.println("Liste Boş!");
        }
        else {
            System.out.println("İndis: ");
            indis = scanner.nextInt();

            if ( indis == 0 && head == tail ){ //baştan silme
                head = null;
                tail = null;
            }
            else if ( indis == 0 && head != tail ){ // baştan silme
                head = head.next;
                head.prev = tail;
                tail.next = head;

            }
            else {
                int n = 0;
                temp = head;
                while ( temp.next != tail ){
                    n++;
                    temp = temp.next;
                }
                if ( indis >= n ){
                    tail = temp;
                    tail.next = head;
                    head.prev = tail;
                }
                else { // aradan silme 
                    temp = head;
                    temp2 = temp;
                    int i = 0;
                    while ( i< indis ){
                        i++;
                        temp2 = temp;
                        temp = temp.next;
                    }
                    temp2.next = temp.next;
                    temp.next.prev = temp2;


                   
                }

            }

            
        }

    }
    void print(){
        if ( head == null ){
            System.out.println("Liste Boş!");
        }
        else{

            temp = head;
            System.out.print("Başlangıç ->");
            while ( temp != tail ){// son düğüme kadar gidecek.
            System.out.print(temp.data + " -> ");
            temp = temp.next;
            }
            System.out.println( temp.data  + " ->  son"); // whileden çıkıldığında temp tailin üstünde olacak yani son düğümü yazdırmam için bu satır gerekli.
        }
    }
    void terstenYazdir(){
        if ( head == null ){
            System.out.println("Liste Boş!");
        }
        else{

            temp = tail;
            System.out.print("Son ->");
            while ( temp != head ){// son düğüme kadar gidecek.
            System.out.print(temp.data + " -> ");
            temp = temp.prev;
            }
            System.out.print( temp.data + " ->  baş\n");
        }
    }

}
