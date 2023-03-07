public class memurtest {
    public static void main(String[] args)  {

        memur m1 = new memur("Yasemin",5000);

        memur m2 = new memur();
        m2.setIsim("Deniz");
        m2.setMaas(6000);

        memur m3 = new memur();
        m3.setIsim("Elif");
        m3.setMaas(4750);
    
        m3.bilgileriGoster();
        memur.kanunuSoyle();
        m1.bilgileriGoster();

        System.out.println("Nesne Sayısı Sınıf : "+memur.getMemursayi());
    }
}
