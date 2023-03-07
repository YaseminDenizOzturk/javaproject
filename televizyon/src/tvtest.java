public class tvtest {
    public static void main(String[] args)  {
        televizyon tv = new televizyon();
        tv.ac();
        tv.setSesSeviyesi(15);
        tv.setKanal (20);
        tv.kapat();

        tv.goster();





}
}

// static: nesneden bağımsız sınıfa özgü değişkendir.
// static olmayan metodlar static metod ve değişkenlere erişebilir ama static olanlar static olmayanlara erişemez.

