import java.util.Scanner;

public class atmprogrami {
    public static void main(String[] args) {
    /*
    işlemlerimiz:
    1.işlem : Bakiye Sorgulama
    2.işlem : Para Yatırma
    3.İşlem : Para Çekme
    4.İşlem : Hesaba Para Gönderme
    Çıkış : q
    
    */
    Scanner scanner = new Scanner(System.in);
    int bakiye = 5000;
    String islemler = "1.İşlem : Bakiye Sorgulama\n"
                    +"2.İşlem : Para Yatırma\n"
                    +"3.İşlem : Para Çekme\n"
                    +"4.İşlem : Hesaba Para Gönderme\n"
                    +"Çıkış için q'a basın";
            
            System.out.println("*****************************************");
            System.out.println(islemler);
            System.out.println("*****************************************");


            while(true){

                System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz: ");
                String islem = scanner.nextLine();



                if(islem.equals("q")){
                    System.out.println("İşleminiz Sonlandırılıyor...");
                    break;
                }

                else if (islem.equals("1")){
                    System.out.println("Bakiyeniz: "+bakiye);
                }
                else if (islem.equals("2")){
                    System.out.print("Yatırmak İstediğiniz Tutar : ");
                    int tutar = scanner.nextInt();
                    scanner.nextLine();
                    bakiye = bakiye + tutar;
                    System.out.println("Yeni Bakiyeniz: "+bakiye);

                }
                else if (islem.equals("3")){
                    System.out.print("Çekmek İstediğiniz Tutar: ");
                    int tutar = scanner.nextInt();
                    scanner.nextLine();
                

                    if (bakiye - tutar <0){
                        System.out.println("İşlem İçin Yeterli Bakiyeniz Bulunmamaktadır!\n Bakiyeniz: "+bakiye);
                    }
                    else {
                        bakiye = bakiye - tutar ;
                        System.out.println("Yeni Bakiyeniz: "+bakiye);

                    }
                } 
                else if (islem.equals("4")){
                    System.out.print("Göndermek İstedğiniz Hesap Numarasını Giriniz :  ");
                    String hesapno = scanner.nextLine();
                    System.out.print("Göndermek İstediğiniz Tutar : ");
                    int tutar = scanner.nextInt();
                    scanner.nextLine();

                    bakiye = bakiye - tutar;
                    System.out.println( "Yeni Bakiyeniz: "+bakiye);


                }
                else {
                    System.out.println("Lütfen Geçerli Bir İşlem Seçiniz!");
                }

}

}

}