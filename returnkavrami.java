public class returnkavrami {
    //Fonksiyonlarda return den sonraki hiçbir kod çalışmaz.
    
    public static int besiletopla(int a){

        return a+5;
    }
    public static int dörtilecarp(int a){

        return a*4;
    }
    public static int sekizilecarp(int a){ 

        return a*8;
    }

    public static void main(String[] args) {

        System.out.println("Sonuç = "+sekizilecarp(besiletopla(dörtilecarp(8))));
       
    
}

}