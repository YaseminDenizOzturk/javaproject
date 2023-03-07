public class Test {
    public static void main(String[] args){

        ogrenci[] tumOgrenciler = new ogrenci[500];

        ogrenci yasemin = new ogrenci();

        yasemin.isim = "Yasemin Deniz Öztürk";
        yasemin.sinif = 12;
        yasemin.ogrenciNo = 2524;
        yasemin.aktif = true;

        yasemin.ogrenciBilgileriniYazdir();

        ogrenci bos = new ogrenci();
        bos.ogrenciBilgileriniYazdir();

        ogrenci Deniz = new ogrenci(  500 ,  "Deniz", (byte) 5,  true);
        Deniz.ogrenciBilgileriniYazdir();

        ogrenci Hasan =  new ogrenci("Hasan");
        Hasan.aktif =true;
        Hasan.ogrenciBilgileriniYazdir();
        /*
        yasemin = Deniz;
        System.out.println("Yasemin'in Bilgileri Yazdırılıyor...");
        yasemin.ogrenciBilgileriniYazdir();
        System.out.println("Deniz'in Bilgileri Yazdırılıyor...");
        Deniz.ogrenciBilgileriniYazdir();

        */

        


        ogrenci ogr1 = new ogrenci();
        
        ogrenci ogr2 = new ogrenci(111);
        
        ogrenci ogr3 = new ogrenci(111,"Yasemin Deniz");
        
        ogrenci ogr4 = new ogrenci(111,"Yasemin Deniz",(byte)5);
        
        ogrenci ogr5 = new ogrenci(111,"Yasemin Deniz",(byte)5,true);

        tumOgrenciler[0]=ogr1;
        tumOgrenciler[1]=ogr2;
        tumOgrenciler[2]=ogr3;
        tumOgrenciler[3]=ogr4;
        tumOgrenciler[4]=ogr5;

        tumOgrenciler[5]= new ogrenci(122,"Yeni Öğrenci",(byte)9,true);

        tumOgrenciler[0].aktif = true;
        tumOgrenciler[1].aktif = true;
        tumOgrenciler[2].aktif = true;
        tumOgrenciler[3].aktif = true;
        tumOgrenciler[4].aktif = true;

        tumOgrenciler[0].ogrenciBilgileriniYazdir();
        tumOgrenciler[1].ogrenciBilgileriniYazdir();
        tumOgrenciler[2].ogrenciBilgileriniYazdir();
        tumOgrenciler[3].ogrenciBilgileriniYazdir();
        tumOgrenciler[4].ogrenciBilgileriniYazdir();
        tumOgrenciler[5].ogrenciBilgileriniYazdir();

    
        
        
        

        

        

        

       

    }
}