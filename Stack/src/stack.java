public class stack {
    int dizi[];
    int size;
    int indis;

    public stack(int size) {
        this.size = size;
        dizi = new int[size];
        indis = -1; // varsayılan
    }

    void push(int data) { // ekleme
        if (isFull()) {
            System.out.println("Stack Dolu!");
        } else {
            indis++;
            dizi[indis] = data;
            System.out.println("push() : " + dizi[indis]);
        }
    }

    int pop() {
        if (!isEmpty()) {
            return dizi[indis--]; // dizinin indisini bir eksilt ve geriye değer döndür.
        } else {
            System.out.println("Dizi Boş!");
            return -1;

        }

    }

    boolean isFull() {
        return (indis == size - 1); // ör: 5 eleman varsa indis 4 e kadar gider

    }

    boolean isEmpty() {
        return (indis == -1); // liste boşsa
    }

}
