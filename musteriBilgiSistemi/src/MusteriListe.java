import java.util.Scanner;

public class MusteriListe {
    Scanner scanner = new Scanner(System.in);
    Node head = null;
    Node tail = null;

    int id;
    String isim;
    String soyisim;
    String telefonNo;
    String adresBilgisi;
    String urunBilgisi;

    void musteriEkleme() {
        System.out.println("***********************************");
        System.out.println("Lütfen Sisteme Eklemek İstediğiniz Müşterinin Bilgilerini Giriniz:");
        System.out.println("Müsteri Numarası: ");
        id=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Müsteri İsmi: ");
        isim=scanner.nextLine();
        System.out.println("Müsteri Soyismi: ");
        soyisim =scanner.nextLine();
        System.out.println("Müsteri Telefon Numarası: ");
        telefonNo=scanner.nextLine();
        System.out.println("Müsteri Adres Bilgisi: ");
        adresBilgisi=scanner.nextLine();
        System.out.println("Müsteri Ürün Bilgisi: ");
        urunBilgisi=scanner.nextLine();
        System.out.println("***********************************");

        Node musteri = new Node(id, isim, soyisim, telefonNo, adresBilgisi, urunBilgisi);

        if (head == null) {
            head = musteri;
            tail = musteri;
            System.out.println("Müşteri Listesi Oluşturuldu,İlk Müşteri Eklendi");
        } else {
            musteri.next = head;
            head.prev = musteri;
            head = musteri;
            System.out.println(id + " numaralı müşterinin kaydı başarılı");
        }

    }

    void musteriSilme() {
        boolean sonuc = false;
        if (head == null) {
            System.out.println("Müşteri Listesi Boş!");
        } else {
            System.out.println("Sistemden Silinecek Müşteri Numarasını Giriniz: ");
            id = scanner.nextInt();
            scanner.nextLine();

            if (head.next == null && head.id == id) {
                head = null;
                tail = null;
                System.out.println(id + "numaralı müşteri bilgileri sistemden silindi");

            } else if (head.next != null && head.id == id) {
                head = head.next;
                head.prev = null;

                System.out.println(id + "numaralı müşteri bilgileri sistemden silindi");
                sonuc = true;
            } else if (tail.id == id) {
                tail = tail.prev;
                tail.next = null;
                System.out.println(id + "numaralı müşteri bilgileri silindi");
                sonuc = true;
            } else {
                Node temp = head;
                while (temp != null) {
                    if (temp.id == id) {
                        temp.next.prev = temp.prev;
                        temp.prev.next = temp.next;
                        sonuc = true;
                        break;
                    }
                    temp = temp.next;
                }

            }
            if (!sonuc) {
                System.out.println(id + " numaralı müşteri listede yok!");
            }
        }

    }

    void musteriBilgileriGuncelleme() {
        boolean sonuc = false;
        if (head == null) {
            System.out.println("Müşteri Listesi Boş!");
        } else {
            System.out.println("Bilgileri Güncellenecek Müşteri Numarasını Giriniz: ");
            id = scanner.nextInt();
            scanner.nextLine();

            Node temp = head;
            while (temp != null) {
                if (temp.id == id) {
                    System.out.println(id + " numaralı müşteri bilgileri: ");
                    System.out.println("İsim:    " + temp.isim);
                    System.out.println("Soyisim:    " + temp.soyisim);
                    System.out.println("Telefon:    " + temp.telefonNo);
                    System.out.println("Adres:    " + temp.adresBilgisi);
                    System.out.println("Ürün Bilgisi:    " + temp.urunBilgisi);

                    System.out.println("Ürün Bilgilerini Güncelleyiniz: ");
                    temp.urunBilgisi = scanner.nextLine();
                    System.out.println("Ürün Bilgisi Güncellendi ");

                    sonuc = true;
                    break;

                }
                temp = temp.next;
            }

        }
        if (!sonuc) {
            System.out.println(id + " numaralı müşteri listede yok!");
        }
    }

    void musteriArama() {
        boolean sonuc = false;
        if (head == null) {
            System.out.println("Müşteri Listesi Boş!");
        } else {
            System.out.println("Aradığınız Müşteri Numarasını Giriniz: ");
            id = scanner.nextInt();
            scanner.nextLine();

            Node temp = head;
            while (temp != null) {
                if (temp.id == id) {
                    System.out.println(id + " numaralı müşteri bilgileri: ");
                    System.out.println("İsim:    " + temp.isim);
                    System.out.println("Soyisim:    " + temp.soyisim);
                    System.out.println("Telefon:    " + temp.telefonNo);
                    System.out.println("Adres:    " + temp.adresBilgisi);
                    System.out.println("Ürün Bilgisi:    " + temp.urunBilgisi);

                    sonuc = true;
                    break;

                }
                temp = temp.next;
            }

        }
        if (!sonuc) {
            System.out.println(id + " numaralı müşteri listede yok!");
        }
    }

    void listele() {

        if (head == null) {
            System.out.println("Müşteri Listesi Boş!");
        } else {
            System.out.println("Müşteri Numarası:\tİsim:\tSoyisim:\tTelefon:\tAdres Bilgisi:\tÜrün Bilgisi:\n");

            Node temp = head;
            while (temp != null) {

                System.out.println(temp.id +     "\t" + temp.isim +     "\t" + temp.soyisim +     "\t" +     temp.telefonNo + "\t"
                        + temp.adresBilgisi + "\t" +       temp.urunBilgisi);

                temp = temp.next;
            }

        }

    }
}
