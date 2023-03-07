import java.util.Scanner;

public class gelismishesapmakinesi {

    public static int cikarma(int a, int b){
        return(a-b);
    
    }
    public static double bolme(int a, int b){
        return((double)a/b); 

    }

    public static int toplama(int a, int b){
        return(a+b);
    }
    public static int toplama(int a, int b,int c){
        return(a+b+c);

    }
    public static int carpma(int a, int b){
        return(a*b);

    }
    public static int carpma(int a, int b,int c){
        return(a*b*c);
    }

    public static void main(String[] args) {
        String islemler = "1.İşlem : Toplama İşlemi\n"
                        +"2.İşlem : Çıkarma İşlemi\n"
                        +"3.İşlem : Çarpma İşlemi\n"
                        +"4.İşlem  : Bölme İşlemi\n"
                        +"Çıkış için q 'a basınız...";
        

            String islem;
            Scanner scanner = new Scanner(System.in);
            System.out.println("***************************************************");
            System.out.println(islemler);
            System.out.println("***************************************************");

            while (true){
                System.out.print(" Lütfen İşlemi Seçiniz: \n");
                islem = scanner.nextLine();


                if ( islem.equals("q")){
                    System.out.println("Programdan Çıkılıyor...");
                    break;

                }
                else if (islem.equals("1")){
                    System.out.println("Kaç Sayı Toplayacaksınız? (2 veya 3)");
                    int kacsayi = scanner.nextInt();

                    if (kacsayi == 2){
                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Girilen Sayıların Toplamı: "+ (toplama(a,b)));        
                
                
                }
                    else if (kacsayi == 3 ){
                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    System.out.print("c: ");
                    int c = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Girilen Sayıların Toplamı: "+ (toplama(a,b,c)));    
                   
                }

                    else {

                        System.out.println("Bunun için uygun metod bulunamıyor!");
    
                         }
                
                
                }
            

                }  
                 if (islem.equals("2"))  {
                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Girilen Sayıların Farkları :" + (cikarma(a,b)));
                 }

                 else if (islem.equals("3")){
                    System.out.println("Kaç Sayı Çarpacaksınız? (2 veya 3)");
                    int kacsayi = scanner.nextInt();

                    if (kacsayi == 2){
                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Girilen Sayıların Çarpımları: "+ (carpma(a,b)));          
                    }  

                    else if(kacsayi ==3){
                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    System.out.print("c: ");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Girilen Sayıların Çarpımları: "+ (carpma(a,b,c)));    
                    
                }

                    else {
                        System.out.print("Bunun İçin Uygun Metod Bulunamıyor!");
                    }
                   
                }

                else if (islem.equals("4"))  {
                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Girilen Sayıların Bölümü :" + (bolme(a,b)));
                 }

                 else {
                    System.out.println("Geçersiz İşlem! Lütfen Geçerli Bir İşlem Giriniz...");
                   }

                 }





                }
                









                    
                
                    









        




    








