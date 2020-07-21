package com.qubits.util;

import com.qubits.dto.Item;
import org.apache.ignite.Ignite;
import org.apache.ignite.Ignition;
import org.apache.ignite.IgniteCache;
import org.apache.ignite.configuration.IgniteConfiguration;
import org.apache.ignite.configuration.CacheConfiguration;

public class CacheClient {

    private Ignite ignite;
    private IgniteCache<Long, Item> cache;
    private final String CACHE_LBL = "ItemsCache";

    public CacheClient() {
        ignite = Ignition.start();
        cache = ignite.getOrCreateCache(CACHE_LBL);
    }

    public void persist() {
        Item i1 = new Item("Apparel", "XXL");
        Item i2 = new Item("Electronics", "DDR3");
        cache.put(1L, i1);
        cache.put(2L, i2);
    }
}
