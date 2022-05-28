package cache.storage;

import cache.exceptions.KeyNotFoundException;
import cache.exceptions.StorageFullException;

public interface Storage<Key, Value> {
    public void add(Key key,Value value) throws StorageFullException;
    public void remove(Key key) throws KeyNotFoundException;
    public Value get(Key key) throws KeyNotFoundException;

}
