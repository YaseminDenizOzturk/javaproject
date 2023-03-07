public class account {
    

    private String hesapNo;
    private double bakiye;
    private String isim;
    
    private String email;
    
    private String telefonNo;

    public account(){
        
        System.out.println("Kendi Yazdığımız Consttructor....");
        
    }
    public account(String hesapNo,double bakiye,String isim,String email,String telefonNo) {
        
        this.hesapNo = hesapNo;
        
        this.bakiye =  bakiye;
        this.isim = isim;
        
        this.email = email;
        this.telefonNo = telefonNo;
        
    }
    
    public void paraYatir(double miktar){
        
        bakiye += miktar;
        
        System.out.println("Yeni Bakiye = " + bakiye);
        
    }
    public void paraCekme(double miktar) {
        
        if (miktar > 1500) {
            System.out.println("Bir günde 1500 tlden fazla para çekemezsiniz...");
        }
        if (bakiye - miktar < 0 ) {
            System.out.println("Yeterli bakiye yok. Bakiye = " + bakiye);
            
        }
        else {
            
            bakiye -= miktar;
            System.out.println("Yeni bakiye = " + bakiye);
            
        }
    }
    /**
     * @return the hesapNo
     */
    public String getHesapNo() {
        return hesapNo;
    }

    /**
     * @param hesapNo the hesapNo to set
     */
    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    /**
     * @return the bakiye
     */
    public double getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /*
     * @param isim the isim to set */
}