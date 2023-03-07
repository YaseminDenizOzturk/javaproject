public class ImmutableVeMetodaNesneGondermek {
    public static void main(String[] args)  {
        //String[]ureticiFirmalari = {"A","B","c"};
        bilgisayar b1 = new bilgisayar(8,16,new String[]{"A","B","C"});
        bilgisayarYazdir(b1);

        String [] ureticiler = b1.getUreticiFirmalari();
        ureticiler[0]= "D";
        bilgisayarYazdir(b1);



    }
    public static void bilgisayarYazdir(bilgisayar yazdirilacakPC){
        System.out.println("Çekirdek Sayısı: " + yazdirilacakPC.getCekirdekSayisi()+" Ram Boyutu: " + yazdirilacakPC.getRamBoyutu()
        +" Üretici Firmalar: " + yazdirilacakPC.getUreticiFirmalari()[0]);
    }
}

class bilgisayar {
    private int cekirdekSayisi;
    private int ramBoyutu;
    private String[] ureticiFirmalari;
    
    public bilgisayar(int cSayisi, int ramBoyutu, String[] ureticiFirmalari){
        this.cekirdekSayisi = cSayisi;
        this.ramBoyutu =  ramBoyutu;
        this.ureticiFirmalari = ureticiFirmalari;
    }
    public int getCekirdekSayisi(){
        return cekirdekSayisi;
    }
    public int getRamBoyutu(){
        return ramBoyutu;
    }
    public String[] getUreticiFirmalari(){
        String [] kopyaFirmaIsimleri = new String [ureticiFirmalari.length];

        for(int i = 0 ; i < kopyaFirmaIsimleri.length;i++){
            kopyaFirmaIsimleri[i] = ureticiFirmalari[i];
        }
        return kopyaFirmaIsimleri;
    }







}
