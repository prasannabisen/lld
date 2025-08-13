package Lru;

import java.util.HashMap;

public class DLLoperation {
    static DLL head = null;
    static DLL tail = null;
    static HashMap<Integer, DLL> hashMap = new HashMap<>();

    public static void addNode(DLL node) {
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
        return;
    }

    public static void remove() {
        DLL node = tail.prev;
        node.next = null;
        tail.prev = null;
        tail = node;
        return;
    }

    public static DLL find(int key) {
        DLL node = head;
        while (node != null) {
            if (node.key == key) {
                return node;
            }
        }
        return null;
    }

    public static void print() {
        while (head != null) {
            System.out.println(head.key);
            head = head.next;
        }
    }

    public static void placeAtFirst(DLL node) {
        if(head == node) return;
        if(tail == node){
            node.prev.next = null;
            node.prev = null;
            node.next = head;
            head.prev = node;
            head = node;
            return;
        }
        node.prev.next = node.next;
        node.next.prev = node.prev;
        node.next = head;
        head.prev = node;
        head = node;
    }
}
