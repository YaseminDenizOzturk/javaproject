import java.util.Scanner;

public class kursKayitStack {
    Scanner scanner = new Scanner(System.in);

    Node top;
    int kontenjan;
    int sayac;

    public kursKayitStack(int kontenjan) { // kullanıcı bir stack yapısı oluşturacaksa kontenjanı girmeli ( yani bu
                                           // stack kapasitesi demek)
        this.kontenjan = kontenjan;
        sayac = 0;
        top = null;
    }

    String tc;
    String isim;
    String soyisim;
    String bolum;

    void push() { // stacke ekleme
        
        System.out.println("Kişi Bilgilerini Giriniz: ");
        System.out.println("TC no: ");
        tc = scanner.nextLine();
        System.out.println("İsim: ");
        isim = scanner.nextLine();
        System.out.println("Soyisim: ");
        soyisim = scanner.nextLine();
        System.out.println("Hangi Bölümden Mezun Oldunuz: ");
        bolum = scanner.nextLine();
        Node eleman = new Node(tc, isim, soyisim, bolum);

       

        if (isFull()) {
            System.out.println("Kurs Kontenjanı Dolmuşur!");
        } else {
            if (isEmpty()) {
                top = eleman;
                System.out.println(top.tc + "İlk öğrenci kaydı başarılı");
            } else { // stack te daha önceden kayıtlı kişi varsa else ye girecek
                eleman.next = top; // top ın üstüne ekliyorum.
                top = eleman;// top ı güncelliyorum.
                System.out.println(top.tc + "numaralı öğrenci kaydı başarılı");
            }
            sayac++;

        }
    }

    void pop() {
        if (isEmpty()) {
            System.out.println("Kursa Kayıtlı  Kişi Yok!");
        } else {
            System.out.println(top.tc + "numaralı kişinin kurstan kaydı silindi...");
            top = top.next;
            sayac--;
        }
       
    }

    private boolean isFull() {
        return sayac == kontenjan;
    }

    private boolean isEmpty() {
        return sayac == 0;
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Kursa Kayıtlı Kişi Yok! Liste Oluşturulamadı!");

        } else {
            Node temp = top;
            System.out.println("**********Kursa Kayıtlı Kişiler Listesi**********");
            System.out.println("TC no\tİsim\tSoyisim\tMezun Olduğu Bölüm");
            while (temp != null) {
                System.out.println(temp.tc + "\t" + temp.isim + "\t" + temp.soyisim + "\t" + temp.bolum);
                temp = temp.next;
            }
        }

    }

    void kalanKont(){
        System.out.println("Kursa Toplam Kayıtlı Kişi Sayısı: " + sayac);
        System.out.println("Kalan Kontenjan: " + (kontenjan - sayac )); // *****
    }

    void sonKayıt() {
        if (isEmpty()) {
            System.out.println("Kursa Kayıtlı Kişi Yok!");
        } else {
            System.out.println("--------Kursa Kayıtlı Son Kişi Bilgileri-------- \n"); // en son kişi top
            System.out.println(top.tc + "\t" + top.isim + "\t" + top.soyisim + "\t" + top.bolum);
        }
    }

}
