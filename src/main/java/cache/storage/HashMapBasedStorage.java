package cache.storage;

import cache.exceptions.KeyNotFoundException;
import cache.exceptions.StorageFullException;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasedStorage<Key, Value> implements Storage<Key, Value> {

    Map<Key, Value> storage;
    private final Integer capacity;

    public HashMapBasedStorage(Integer capacity) {
        this.capacity = capacity;
        storage = new HashMap<>();
    }

    @Override
    public void add(Key key, Value value) throws StorageFullException {
        storage.put(key, value);
    }

    @Override
    public void remove(Key key) throws KeyNotFoundException {
        storage.remove(key);

    }

    @Override
    public Value get(Key key) throws KeyNotFoundException {
        return storage.get(key);
    }
}
