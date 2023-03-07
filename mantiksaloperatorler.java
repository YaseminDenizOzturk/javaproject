public class mantiksaloperatorler {

    public static void main(String[] args) {
    

        /* 
        Mantıksal Operatörler
        && --> and operatörü : Bütün sonuçlar kendi içinde true ise true,en az birisi bile false ise false olur.

        || --> or operatörü : Sonuçlardan en az birisi bile true ise sonuç true, hepsi false ise genel sonuç false olur.

        ! --> not operatörü : true ise false, false ise true.

        */


        System.out.println(6 == 6);
        System.out.println(2 > 5);
        System.out.println(3 == 3 && 2 > 5);
        System.out.println(4 != 5 && "Jasmine" == "Jasmine" && 7 >= 6);
        System.out.println (3 == 3 || "Freedom" != "Freedom");
        System.out.println(!((3 < 4 && "rain" == "rain") || 3.4 == 2.1));
        

    
}

}