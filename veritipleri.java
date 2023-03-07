public class veritipleri {
    public static void main(String[] args) {
        // byte-->short-->int-->long

        byte a= 100;
        byte b= (byte)(a/2);

        System.out.println(b);

        short i =100;
        byte j=2;
        int k=4;
        long d = i+j+k;

        System.out.println(d);


        // Double: 64bit - 8 byte
        // Float: 32bit - 4 byte


        //otomatik dönüştürme:  int-->float-->double


        int x = 22 / 7;
        float y= 22f / 7f;
        double z= 22d / 7d;

        System.out.println("x:"+x);
        System.out.println("y:"+y);
        System.out.println("z:"+z);


//double float farkı

        double sayi1= 70.25;
        double sayi2= 60d;
        double sayi3= 80.2;


        float sayi4= 70.25f;
        float sayi5= 60f;
        float sayi6= 80.2f;

        System.out.println("ortalama: "+ (sayi1+sayi2+sayi3)/3);
        System.out.println("ortalama: "+ (sayi4+sayi5+sayi6)/3);


       
        
        







}
  }