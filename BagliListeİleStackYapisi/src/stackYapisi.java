public class stackYapisi {

    int size; // stack kapasitesini tutan değişken
    int count;
    int count2;
    Node top; // en üst düğümü tutan
    // en üsteki top olacak sileceğim zaman top silinecek , ekleyeceğim zaman top ı
    // güncelleyeceğim.

    public stackYapisi(int size) {
        this.size = size;
        count = 0; // stack içinde hiçbir şey yok / yapı boş
        top = null;
    }

    void push(int data) {
        Node eleman = new Node(data);
        if (isFull()) {
            System.out.println("Stack Dolu!!! Ekleme Başarısız!");
        } else {
            if (isEmpty()) {
                top = eleman;
                System.out.println(top.data + " Stack e İlk Eleman Eklendi.");
            } else {
                eleman.next = top; // yani top ın üstüne ekleme yaptım.
                top = eleman; // top ı güncelledim.
                System.out.println(top.data + " Stacke Eklendi.");
            }
            count++;
        }

    }

    void pop() {
        if (isEmpty()) {
            System.out.println("Stack Boş! ");
        } else {
            System.out.println(top.data + " Çıkartıldı");
            top = top.next;
            count--;
        }
    }

    boolean isFull() {
        return count == size; // stack doludur
    }

    boolean isEmpty() {
        return count == 0; // stack boştur.

    }

    

    void print() {
        if (isEmpty()) {
            System.out.println("Stack Boş,Yazdırılacak Bir Şey Yok!");
        } else {
            Node temp = top; // en üstten başlayıp en alta kadar yazdıracağım.
            System.out.println("Stack teki Veriler \n");
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;

            }
            System.out.println("\n");

        }
    }

    void search(int data){
        Node temp = top;
        int count2 = 0;

        while ( temp != null ){
            if ( temp.data == data ){ // aranan eleman bulunmuşsa yani temp onun üstündeyse bu if çalışır.
                System.out.println("Aradığınız Eleman " + (count2) + " indiste bulunmuştur.");
                return;
            }
            else{ // temp aradığım elemanın üstünde değilse bu çalışır count2 artırılır.
                temp = temp.next;
                count2++;
            }

        }
        System.out.println("Böyle bir eleman bulunamadı!");
    }
    void peek(){
        if (isEmpty()){
            System.out.println("Stack Boş!");
        }
        else{
            System.out.println("En üstteki düğümün datası: " + top.data);
        }
    }

}
