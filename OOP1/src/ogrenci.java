public class ogrenci {

    int ogrenciNo;
    String isim;
    byte sinif;
    boolean aktif;

    public ogrenci() {
        System.out.println("Öğrenci Nesnesi Oluşturuluyor...");
        aktif = true;
        ogrenciNo = 9999;
        isim = "Henüz İsim Verilmemiş";
        sinif = 2;
        // hem bellekte yer açtım hem de varsayılan değerleri girdim.
    }

    /*
     * public ogrenci(int ogrenciNo,String isim,byte sinif,boolean aktif){
     * this.ogrenciNo = ogrenciNo;
     * this.isim = isim;
     * this.sinif = sinif;
     * this.aktif = aktif;
     * }
     */
    public ogrenci(String isim) {
        this.isim = isim;
    }

    public void dersAl() {
        System.out.println("Öğrenci Ders Alıyor");
    }

    public void ogrenciBilgileriniYazdir() {
        if (aktif) {
            System.out.println("Adı: " + isim + " Numara: " + ogrenciNo + " Sınıf: " + sinif);
        } else {
            System.out.println("Bu Öğrenci Aktif Değil...");
        }

    }

    // Bir Constructorda Başka Bir Constructoru Misafir Etmek

    public ogrenci(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public ogrenci(int ogrenciNo, String isim) {
        this(ogrenciNo);
        this.isim = isim;
    }

    public ogrenci(int ogrenciNo, String isim, byte sinif) {
        this(ogrenciNo, isim);
        this.sinif = sinif;
    }

    public ogrenci(int ogrenciNo, String isim, byte sinif, boolean aktif) {
        this(ogrenciNo, isim, sinif);
        this.aktif = aktif;
    }

}
