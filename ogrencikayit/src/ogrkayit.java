import java.util.Scanner;

public class ogrkayit {
    Node head = null; // baş düğümü tutan değişkeni
    Node tail = null; // ve son düğümü tutan değişkeni oluşturdum
    Node temp = null;
    Node temp2 = null;
    int no;
    String isim;
    String soyisim;
    int vize;
    int fin;
    double ortalama;
    String durum;

    Scanner scanner = new Scanner(System.in);


    void bilgiEkle(){
        System.out.println("Teknoloji Fakültesine Kayıt Olacak Öğrencinin Bilgilerini Giriniz: ");
        System.out.println("Öğrenci Numarası: ");
        no = scanner.nextInt();
        scanner.nextLine(); // sayıyı girdikten sonra enter a basınca boşluk olarak algılar o zaman bu satır çalışacak ve alttaki kodda oluşabilecek hatayı önlemiş oldum
        System.out.println("Öğrencinin İsmi: ");
        isim = scanner.nextLine();
        System.out.println("Öğrenci Soyismi:");
        soyisim = scanner.nextLine();
        System.out.println("Vize Notu: ");
        vize = scanner.nextInt();
        System.out.println("Final Notu: ");
        fin = scanner.nextInt();

        Node ogrenci = new Node(no,isim,soyisim,vize,fin);

        if ( head== null){
            head = ogrenci;
            tail = ogrenci;
            System.out.println("Öğrenci Listesi Oluşturuldu ve İlk Öğrencinin Kaydı Başarıyla Gerçekleştirilmiştir...");

        }
        else {
            ogrenci.next = head; // head in önüne elemanı ekledim
            head = ogrenci;
            System.out.println( no + " numaralı öğrencinin kaydı başarıyla gerçekleştirilmiştir... ");

        }



    }


    void bilgiSil(){
        if( head == null ){
            System.out.println("Sistemde Kayıtlı Öğrenci Bulunmamaktadır!");
        }
        else {
            System.out.println("Silmek İstediğiniz Öğrencinin Numarasını Giriniz: ");
            no = scanner.nextInt();
             if( no == head.no && head.next == null )// listede bir öğrenci var (head) ve bu öğrenciyi silmek istiyoruz.
             {
                head = null;
                tail = null;
                System.out.println(no + " numaralı öğrenci bilgileri silindi, sistemde kayıtlı öğrenci kalmadı");

             }
             else if(no == head.no && head.next != null ) // Listede birden çok eleman var ama headi silmek istiyorum.
             {
                head = head.next;
                System.out.println(no + " numaralı öğrenci bilgileri silindi.");
             }
             else {
                temp = head;
                temp2 = head; // temp 2 tempten önce gelir***
                while( temp.next != null ){ // son düğümde çalışmaz onu için while dışında ayrı if açtım

                    if( no == temp.no ){
                        temp2.next = temp.next; // temp2 den sonra temp değil tempin nexti gelecek yani temp boşaltıldı.
                        System.out.println(no + " numaralı öğrenci bilgileri silindi.");
                    }
                    temp2 = temp; // temp2 ve temp ardışık düğümler ben temp i silmek istiyorum.
                    temp = temp.next;
                }
                if( no == temp.no ){
                    temp2.next = null; 
                    tail = temp2; // tempi sildim son düğüm temp2 olarak kaldı.
                    System.out.println(no + " numaralı öğrenci bilgileri silindi.");
                }
            }
        }
        
    }

    void bilgileriGoster(){
        if ( head == null ){
            System.out.println("Sistemde Kayıtlı Öğrenci Bulunmamaktadır!");
        }
        else {
            temp = head;
            while ( temp != null ){// son öğrenciye kadar gidecek 
                System.out.println(temp.no + " numaralı öğrencinin bilgileri ");
                System.out.println("*******************************************");
                System.out.println("Öğrencinin İsmi: "+ temp.isim);
                System.out.println("Öğrencinin Soyismi: "+ temp.soyisim);
                System.out.println("Öğrencinin Vize Notu: "+ temp.vize);
                System.out.println("Öğrencinin Final Notu : "+ temp.fin);
                System.out.println("Öğrencinin Ortalaması: " + temp.ortalama);
                System.out.println("Öğrencinin Geçme- Kalma Durumu: "+ temp.durum);
                System.out.println("*******************************************");

                temp = temp.next; 
            }// acana + koymak mı gerekiyor
        }
    }
    void okulBirincisi(){
        if ( head == null ){
            System.out.println("Sistemde Kayıtlı Öğrenci Bulunmamaktadır!");
        }
        else {
            temp = head;
            double basari = temp.ortalama;
            while ( temp != null ){// son öğrenciye kadar gidecek 
                if ( basari < temp.ortalama ){
                    basari = temp.ortalama;
                    no=temp.no;
                    isim = temp.isim;
                    soyisim = temp.soyisim;
                    vize = temp.vize;
                    fin = temp.fin;
                    ortalama = temp.ortalama;
                    durum = temp.durum;
                }

                temp = temp.next; 
                    
            }
           

            System.out.println("******Okul Birincisi Öğrencinin Bilgileri******");
            System.out.println(no + " numaralı öğrencinin bilgileri ");
                System.out.println("*******************************************");
                System.out.println("Öğrencinin İsmi: " +isim);
                System.out.println("Öğrencinin Soyismi: " +soyisim);
                System.out.println("Öğrencinin Vize Notu: " +vize);
                System.out.println("Öğrencinin Final Notu : " +fin);
                System.out.println("Öğrencinin Ortalaması: " +ortalama);
                System.out.println("Öğrencinin Geçme- Kalma Durumu: " +durum);
                System.out.println("*******************************************");
        }
    }

    
        
        


   

}