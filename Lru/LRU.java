package Lru;

import java.util.HashMap;

public class LRU {
    private int size = 0;
    private int length = 0;
    HashMap<Integer, DLL> hashmap = new HashMap<>();

    public LRU(int size) {
        this.size = size;
    }

    void put(int key) {
        DLL node = new DLL(key);
        hashmap.put(key, node);
        if (length == size) {
            DLLoperation.remove();
            hashmap.remove(key);
            DLLoperation.addNode(node);
            return;
        }
        DLLoperation.addNode(node);
        length++;
        return;
    }

    void get(int key) {
        DLL node = hashmap.get(key);
        if (node == null) {
            put(key);
            return;
        }
        if (node.prev == null) {
            return;
        }
        DLLoperation.placeAtFirst(node);
    }

    void print() {
        DLLoperation.print();
    }
}
