package cache;

import cache.exceptions.StorageFullException;
import cache.policies.EvictionPolicy;
import cache.storage.Storage;

public class Cache<Key,Value>{

    private final EvictionPolicy<Key> evictionPolicy;
    private final Storage<Key,Value> storage;

    public Cache(EvictionPolicy<Key> evictionPolicy, Storage<Key, Value> storage) {
        this.evictionPolicy = evictionPolicy;
        this.storage = storage;
    }

    public void put(Key key,Value value)
    {
        try {
            this.storage.add(key,value);
        } catch (StorageFullException e) {
            e.printStackTrace();
        }
        //this.evictionPolicy.keyAccessed(key);

    }
}
