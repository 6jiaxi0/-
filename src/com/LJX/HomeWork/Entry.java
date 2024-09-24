package com.LJX.HomeWork;

public interface Entry<K,V> {
     K getKey();
     V getValue();
     V setValue(V value);
     K setKey(K key);
     boolean equals(Object o);
     int hashCode();
}
