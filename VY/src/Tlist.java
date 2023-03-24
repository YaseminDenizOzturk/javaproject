public class Tlist {
    private Node head;
    
    public Tlist(){
        this.head = null;
    }

    public void basaEkle(int deger){
        Node eleman = new Node(deger);
        eleman.setNext(this.head);
        this.head = eleman;
    }

    public void sonaEkle(int deger){
        Node eleman = new Node(deger);
        if(this.head == null){
            this.head = eleman;
            return;
        }
        Node temp = this.head;
        while ( temp.getNext() != null ){ // while ( temp.next != null )
            temp = temp.getNext();
        }
        //Döngünün sonunda temp en son düğüm üzerine konumlanmıştır.
        temp.setNext(eleman);// temp döngüden çıktı sondüğüm üzerinde oraya da set fonksiyonu ile elemanı ekledim.
     // temp.next = eleman;
    }
    public void arayaEkle(int deger, int indis){
        Node eleman = new Node(deger);
        
      
        if ((this.head==null) && (indis==1)){ //liste boş ise
            eleman.setNext(null);
            head=eleman;
            System.out.println("ilk eleman eklendi ");
        }
        Node yeni=new Node(deger);
        Node temp=this.head;
        int sayac=1;

        while(temp.getNext()!=null){  //eklenecek yerin bir önceki düğümüne tempin konumlandırılması
            if(sayac+1==indis){
                break;
            }
            sayac++;
            temp=temp.getNext();
        }
        yeni.setNext(temp.getNext()); //yeşil bağlantı
        temp.setNext(eleman);   //mavi bağlantı
    }

    public void listeleme(){
        Node temp = this.head; // listelemeye başlayacağı yeri belirttim.
        if ( temp == null ){
            System.out.println("Listede Eleman Yok");
            return;
        }
        while( temp != null ){
            temp.yazdir();
            temp = temp.getNext();   //temp = temp.next;
             
        }
        System.out.println("**************************");

    }



    
}
