class memur {
    private String isim;
    private int maas;
    private static int olusturulanMemurNesnesi;


    public memur (){
        olusturulanMemurNesnesi ++;

    }
    public memur(String isim,int maas){
        this.isim=isim;
        this.maas=maas;
        olusturulanMemurNesnesi ++;
    }
    public String getIsim(){
        return isim;
    }
    public void setIsim(String isim){
        this.isim = isim;
    }
    public int getMaas(){
        return maas;
    }
    public void setMaas(int maas){
        if (maas < 0){
            maas = 0;
        }
        else {
            this.maas = maas;
        }

    }
    public static int getMemursayi(){
        return olusturulanMemurNesnesi;
    }
    public static void kanunuSoyle(){
        System.out.println("... sayılı kanun geçerlidir");

    }

    public void bilgileriGoster(){
        kanunuSoyle();
        System.out.println("Oluşturulan memur nesnesi: " + olusturulanMemurNesnesi);
    }


}
