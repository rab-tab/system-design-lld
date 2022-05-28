package cache.policies;

import cache.algo.DoublyLinkedList;
import cache.algo.DoublyLinkedListNode;

import java.util.HashMap;
import java.util.Map;

public class LRUEvictionPolicy<Key> implements EvictionPolicy<Key> {

    private DoublyLinkedList<Key> dll;
    private Map<Key, DoublyLinkedListNode<Key>> mapper;
    private DoublyLinkedListNode<Key> first;
    private DoublyLinkedListNode<Key> first1;

    public LRUEvictionPolicy() {
        this.dll = new DoublyLinkedList<>();
        this.mapper = new HashMap<>();
    }

    @Override
    public void keyAccessed(Key key) {
        if (mapper.containsKey(key)) {
            dll.detachNode(mapper.get(key));
            dll.addNodeAtLast(mapper.get(key));
        } else {
            DoublyLinkedListNode<Key> newNode = dll.addElementAtLast(key);
            mapper.put(key, newNode);
        }
    }

    @Override
    public Key evictkey() {
        DoublyLinkedListNode<Key> first1 = dll.getFirstNode();
        if (first1 == null) {
            return null;
        }
        dll.detachNode(first1);
        return (Key) first.toString();
    }

}
