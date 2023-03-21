import java.util.Scanner;

public class OtogaleriKayit {
    Scanner scanner = new Scanner(System.in);
    Node head = null;
    Node tail = null;
    String plaka;
    String marka;
    String model;
    String renk;
    int alisFiyat;
    int satisFiyat;
    String aciklama;

    void aracEkle() {
        System.out.println("Sisteme Eklenecek Otomobilin Bilgilerini Giriniz: ");
        System.out.println("Araç Plakasını Giriniz: ");
        plaka = scanner.nextLine();
        System.out.println("Araç Markasını Giriniz: ");
        marka = scanner.nextLine();
        System.out.println("Aracın Modelini Giriniz: ");
        model = scanner.nextLine();
        System.out.println("Aracın Rengini Giriniz: ");
        renk = scanner.nextLine();
        System.out.println("Aracın Alış Fiyatını Giriniz: ");
        alisFiyat = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Araç Açıklamasını Giriniz: ");
        aciklama = scanner.nextLine();

        Node arac = new Node(plaka, marka, model, renk, alisFiyat, aciklama);

        if (head == null) {
            head = arac;
            tail = arac;
            tail.next = head;
            System.out.println(plaka + "plakalı araç galeri sistemine eklendi.");

        } else {
            arac.next = head;
            head = arac;
            tail.next = head;
            System.out.println(plaka + "plakalı araç galeri sistemine eklendi.");

        }

    }

    void aracSil() {
        if (head == null) {
            System.out.println("Galeri Sisteminde Araç Yok");
        } else {
            System.out.println("Sistemden Silinecek Otomobil Plakasını Giriniz: ");
            plaka = scanner.nextLine();
            if (head == tail && head.plaka.equals(plaka)) {
                System.out.println(plaka + "plakalı araç" + head.satisFiyat + "TL ye satıldı.");
                head = null;
                tail = null;
                

            } else if (head != tail && head.plaka.equals(plaka)) {
                System.out.println(plaka + "plakalı araç " + head.satisFiyat + "TL ye satıldı");
                head = head.next;
                tail = head;
            } else {
                Node temp = head;
                Node temp2 = temp;
                while (temp != tail) {
                    if (temp.plaka.equals(plaka)) {
                        System.out.println(plaka + "plakalı araç " + temp.satisFiyat + "TL ye satıldı");
                        temp2.next = temp.next;
                       
                    }
                    temp2 = temp;
                    temp = temp.next;
                }
                if (temp.plaka.equals(plaka)) { // listedeki son aracı satmak istediğimizde while den çıkıyor bu yüzden
                                                // son aracı satmak istiyorsam buraya girecek.
                    tail = temp2;
                    tail.next = head;
                    //temp2.next = temp.next;
                    System.out.println(plaka + "plakalı araç " + temp.satisFiyat + "TL ye satıldı");
                }
            }

        }

    }

    void aracıBul() {

        if (head == null) {
            System.out.println("Galeri Sisteminde Araç Yok");
        } else {
            boolean sonuc = false;
            System.out.println("Aradığınız Aracın Plakasını Giriniz : ");
            plaka = scanner.nextLine();
            Node temp = head;
            Node temp2 = head;
            while (temp != tail) {
                if (temp.plaka.equals(plaka)) {
                    temp2 = temp;
                    sonuc = true;
                }
                temp = temp.next;

            }

            if (temp.plaka.equals(plaka)) {
                temp2 = temp;
                sonuc = true;
            }
            if (sonuc == false) {
                System.out.println(plaka + " plakalı araç otogaleri sisteminde yok");
            } else {
                System.out.println(plaka + " Plakalı Araç Bilgileri : ");
                System.out.println("Marka : " + temp2.marka);
                System.out.println("Model : " + temp2.model);
                System.out.println("Rengi : " + temp2.renk);
                System.out.println("Alış Fiyatı : " + temp2.alisFiyat);
                System.out.println("Satış Fiyatı : " + temp2.satisFiyat);
                System.out.println("Açıklama : " + temp2.aciklama);

            }

        }
    }

    void print() {
        if (head == null) {
            System.out.println("Otogaleri Sisteminde Araç Yok");
        } else {
            System.out.println("Plaka\tMarka\tModel\tRenk\talışFiyatı\tsatısFiyatı\tAçıklama ");
            Node temp = head;
            while (temp != tail) {
                System.out.println(temp.plaka + "\t " + temp.marka + "\t " + temp.model + "\t " + temp.renk + "\t "
                        + temp.alisFiyat + "\t " + temp.satisFiyat + "\t " + temp.aciklama);
                temp = temp.next;
            }
            System.out.println(temp.plaka + "\t " + temp.marka + "\t " + temp.model + "\t " + temp.renk + "\t "
                    + temp.alisFiyat + "\t " + temp.satisFiyat + "\t " + temp.aciklama);

        }
    }

}
