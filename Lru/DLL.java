package Lru;

public class DLL {
    int key;
    DLL next;
    DLL prev;

    public DLL(int key) {
        this.key = key;
        this.next = null;
        this.prev = null;
    }
}
