public class dortgen {
    private double genislik;
    private double yukseklik;

    public dortgen() {
        this.genislik = 0;
        this.yukseklik = 0;

    }

    public dortgen(double w) {
        this.genislik = w;
        this.yukseklik = w;

    }

    public dortgen(double w, double h) {
        this.genislik = w;
        this.yukseklik = h;

    }

    public double alanHesabi() {
        return this.genislik * this.yukseklik;
    }

    public double cevreHesabi() {
        return 2 * (this.genislik + this.yukseklik);
    }

    public void boyutlariGoster() {
        System.out.println("Genişlik: " + this.genislik + "," + "Yükseklik: " + this.yukseklik);
    }

    public double getGenislik() {
        return this.genislik;

    }

    public double getYukseklik() {
        return this.yukseklik;

    }

    public double setGenislik(double w) {
        return this.genislik = w;

    }

    public double setYukseklik(double h) {
        return this.yukseklik = h;

    }

}