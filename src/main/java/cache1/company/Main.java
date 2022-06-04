package cache1.company;


import cache1.company.constants.EvictionPolicy;
import cache1.company.model.Cache;
import cache1.company.service.CacheService;

public class Main {

    public static void main(String[] args) {
        CacheService cacheService= CacheService.getInstance();
        Cache cache = cacheService.init(10, EvictionPolicy.LRU);
        cacheService.put("HelloJi","First Project Done!!");
        System.out.println(cacheService.get("HelloJi"));
    }
}
