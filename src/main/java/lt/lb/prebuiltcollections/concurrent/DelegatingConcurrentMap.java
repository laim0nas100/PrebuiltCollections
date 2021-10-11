package lt.lb.prebuiltcollections.concurrent;

import java.util.concurrent.ConcurrentMap;
import lt.lb.prebuiltcollections.DelegatingMap;

/**
 *
 * @author laim0nas100
 */
public interface DelegatingConcurrentMap<K, V> extends DelegatingMap<K, V>, ConcurrentMap<K, V> {

    @Override
    public ConcurrentMap<K, V> delegate();

    @Override
    public default V putIfAbsent(K key, V value) {
        return delegate().putIfAbsent(key, value);
    }

    @Override
    public default boolean remove(Object key, Object value) {
        return delegate().remove(key, value);
    }

    @Override
    public default boolean replace(K key, V oldValue, V newValue) {
        return delegate().replace(key, oldValue, newValue);
    }

    @Override
    public default V replace(K key, V value) {
        return delegate().replace(key, value);
    }

}
