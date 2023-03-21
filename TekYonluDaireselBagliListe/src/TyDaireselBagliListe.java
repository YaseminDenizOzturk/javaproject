import java.util.Scanner;

public class TyDaireselBagliListe {
    Scanner scanner = new Scanner(System.in);
    Node head = null;
    Node tail = null;

    void basaEkleme() {
        int data;
        System.out.println("data: ");
        data = scanner.nextInt();
        Node eleman = new Node(data);

        if (head == null) {
            head = eleman;
            tail = eleman;
            tail.next = head; // tydairesel listenin özelliği bu. son düğümün nexti ilk düğüm olmalı.

        } else {
            eleman.next = head;
            head = eleman;
            tail.next = head;
        }
    }

    void sonaEkleme() {
        int data;
        System.out.println("data: ");
        data = scanner.nextInt();
        Node eleman = new Node(data);

        if (head == null) {
            head = eleman;
            tail = eleman;
            tail.next = head; // tydairesel listenin özelliği bu. son düğümün nexti ilk düğüm olmalı.

        } else {
            tail.next = eleman;
            tail = eleman;
            tail.next = head;
        }
    }

    void arayaEkleme() {
        int data;
        int indis;
        System.out.println("indis: ");
        indis = scanner.nextInt();
        System.out.println("data: ");
        data = scanner.nextInt();

        Node eleman = new Node(data);

        if (head == null) {
            head = eleman;
            tail = eleman;
            tail.next = head; // tydairesel listenin özelliği bu. son düğümün nexti ilk düğüm olmalı.

        } else if (indis == 0) {
            eleman.next = head;
            head = eleman;
            tail.next = head;

        } else {
            int n = 0;
            Node temp = head;
            Node temp2 = head;
            while (temp != tail) {
                temp = temp.next;
                n++;
            }
            n++; // while temp tail e eşit olunca sonlanacağı için kaç düğüm olduğunu bulmak için
                 // whileden çıkınca n++ koymalıyız.

            if (indis >= n) { // indis eleman sayısından büyük veya eşitse sona ekleme yapacak.
                tail.next = eleman;
                tail = eleman;
                tail.next = head;
            } else {
                temp = head;
                temp2 = temp;
                int i = 0;
                while (i < indis) {
                    i++;
                    temp2 = temp; // temp ekleyeceğim düğüm / temp2 de bir önceki düğüm
                    temp = temp.next;
                }
                temp2.next = eleman;
                eleman.next = temp;

            }
        }

    }

    void bastanSil() {
        if (head == null) {
            System.out.println("Liste Boş!");

        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            tail.next = head;
        }
    }

    void sondanSil() {
        if (head == null) {
            System.out.println("Liste Boş!");

        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node temp = head;

            while (temp.next != tail) { // yani tailden bir önceki düğüm temptir.
                temp = temp.next; // temp.next tail e eşit olunca döngüden çıkar.

            }
            tail = temp;
            tail.next = head;
        }
    }

    void aradanSil() {
        if (head == null) {
            System.out.println("Liste Boş!");

        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            int n = 0;
            int indis;
            System.out.println("İndis: ");
            indis = scanner.nextInt();
            scanner.nextLine(); 
            Node temp = head;
            Node temp2 = head;

            while (temp != tail) { // yani tailden bir önceki düğüm temptir.

                temp = temp.next;
                n++; // temp.next tail e eşit olunca döngüden çıkar.

            }
            n++;
            temp = head;
            int i = 0;
            while (i < indis) {
                temp2 = temp;
                temp = temp.next;
                i++;//döngüden nasıl çıkacak ?????
            }
            temp2.next = temp.next; // temp aradan çıkmış oldu.
        }
    }

    void print() {
        if (head == null) {
            System.out.println("Liste Boş!");
        } else {
            Node temp = head;
            System.out.println("**********************");
            System.out.print("Başlangıç -> ");
            while (temp != tail) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;

            }
            System.out.println(temp.data + " ->  son");
        }
    }
}