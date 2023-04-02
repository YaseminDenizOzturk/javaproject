import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String secim = "";
        int kuyrukKapasitesi;
        int counter;

        System.out.println("Kuyrukta Bulunabilecek Max Müşteri Sayısını Belirleyiniz: ");
        kuyrukKapasitesi = scanner.nextInt();
        scanner.nextLine();

        PideKuyruğu queue = new PideKuyruğu(kuyrukKapasitesi);

        while (true) {
            System.out.println("1-Kuyruğa Yeni Müşteri Ekleme");
            System.out.println("2-Kuyruktan Müşteri Silme");
            System.out.println("3-Kuyruktaki Tüm Müşterileri Göster");
            System.out.println("4-Pide Satışından Elde Edilen Toplam Kazanç");
            System.out.println("5-Kuyruğun Başındaki Müşteri");
            System.out.println("6-Kuyruğun Sonundaki Müşteri");
            System.out.println("q-Çıkış");
            System.out.println("İşlem Seçiminiz: ");
            secim = scanner.nextLine();

            if (secim.equals("1")) {
                queue.enQueue();
            } else if (secim.equals("2")) {
                queue.deQueue();
            } else if (secim.equals("3")) {
                queue.print();
            } else if (secim.equals("4")) {
                System.out.println("Toplam Kazanç: " + queue.toplamKazanc);
            } else if (secim.equals("5")) {
                if (queue.isEmpty()) {
                    System.out.println("Liste Boş Olduğu İçin Kuyruk Başındaki Müşteri Yazdırılamadı!");
                } else {
                    System.out.println("Kuyruğun Başındaki Müşteri: " + queue.front.isim);
                }

            } else if (secim.equals("6")) {
                if (queue.isEmpty()) {
                    System.out.println("Liste Boş Olduğu İçin Kuyruk Sonundaki Müşteri Yazdırılamadı!");
                } else {
                    System.out.println("Kuyruğun Sonundaki Müşteri: " + queue.rear.isim);
                }

            } else if (secim.equals("q")) {
                System.out.println("Çıkış Yapılıyor...");
                break;
            } else {
                System.out.println("Geçersiz Seçim!");
            }

        }

        scanner.close();
    }

}
