public class asalsayi {
    

        public static boolean asalMi(int sayi){

            for(int i = 2; i < sayi ; i++){
                if(sayi % i == 0){
                    return false;
                }

            }
            return true;
            // return den sonraki kodlar çalışmaz!

    

        }
        public static void main(String[] args) {

            for ( int i = 2; i < 2000 ; i++){
                if (asalMi(i)){
                    System.out.println(i);
                }
            }








}

}