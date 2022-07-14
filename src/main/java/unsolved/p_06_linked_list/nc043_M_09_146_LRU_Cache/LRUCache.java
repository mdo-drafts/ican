package unsolved.p_06_linked_list.nc043_M_09_146_LRU_Cache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    class Node {

        int val;

        Node prev;

        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node prev, Node next) {
            this.val = val;
            this.prev = prev;
            this.next = next;
        }
    }

    int capacity;

    Node first;

    Node last;

    Map<Integer, Node> map = new HashMap<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
        first = new Node(-1);
        last = new Node(-1);
        first.next = last;
        last.prev = first;
    }

    public int get(int key) {
        if (!map.containsKey(key)) return -1;
        Node getNode = map.get(key);
        delete(getNode);
        addFirst(getNode);
        return getNode.val;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            delete(map.get(key));
        }
        Node newNode = new Node(value);
        map.put(key, newNode);
        addFirst(newNode);
        if (capacity < map.size()) deleteLast();
    }

    private void delete(Node toDelete) {
        Node prev = toDelete.prev;
        Node next = toDelete.next;
        prev.next = next;
        next.prev = prev;
    }

    private void addFirst(Node toAdd) {
        toAdd.next = first;
        first.prev = toAdd;
        first = toAdd;
    }

    private void deleteLast() {
        Node prev = last.prev;
        prev.next = null;
        last.prev = null;
        last = prev;
    }
}
