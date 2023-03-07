import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {

    

     // continue kullanımı for döngüsünde

     for ( int j = 0 ; j < 10 ;j++){
        if (j==3 || j==5){
            continue;
        }
        System.out.println("j= "+j);

    }
    //Aynı işlemi while döngüsü ile denedim

    int i = 0;
    while ( i<10){
        if (i==3 || i==5){
            i++;
            continue;
        }
        System.out.println("i = "+i);
        i++;

    }
}
}