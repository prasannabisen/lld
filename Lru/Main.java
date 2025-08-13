package Lru;

public class Main {
    public static void main(String[] args) {
        LRU lru = new LRU(3);
        lru.get(1);
        lru.get(2);
        lru.get(3);
        lru.get(1);
        lru.get(3);

        LRU lru1 = new LRU(4);
        lru1.get(100);
        lru1.get(200);
        lru1.get(300);
        lru1.get(400);

        lru.print();
        lru1.print();
    }
}
