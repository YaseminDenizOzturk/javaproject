public class App {
    public static void main(String[] args) throws Exception {
        stack stack1 = new stack(5);
        stack1.push(20); // yani 20 yi stack e ekledim.
        stack1.push(40);
        stack1.push(60);
        stack1.push(80);
        stack1.push(100);
        stack1.push(120); // stack 5 int değer alabiliyor bu kod satırına gelince stack dolu der.
        stack1.push(140);

        System.out.println("Çıkan : " + stack1.pop()); // çıkan en son eklediğim olur.
        System.out.println("Çıkan : " + stack1.pop());
        System.out.println("Çıkan : " + stack1.pop());
        System.out.println("Çıkan : " + stack1.pop());
        System.out.println("Çıkan : " + stack1.pop());
        System.out.println("Çıkan : " + stack1.pop());

    }
}
