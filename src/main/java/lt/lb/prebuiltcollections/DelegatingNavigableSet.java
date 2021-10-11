package lt.lb.prebuiltcollections;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

/**
 *
 * @author laim0nas100
 */
public interface DelegatingNavigableSet<T> extends DelegatingSortedSet<T>, NavigableSet<T> {

    @Override
    public NavigableSet<T> delegate();

    @Override
    public default T lower(T e) {
        return delegate().lower(e);
    }

    @Override
    public default T floor(T e) {
        return delegate().floor(e);
    }

    @Override
    public default T ceiling(T e) {
        return delegate().ceiling(e);
    }

    @Override
    public default T higher(T e) {
        return delegate().higher(e);
    }

    @Override
    public default T pollFirst() {
        return delegate().pollFirst();
    }

    @Override
    public default T pollLast() {
        return delegate().pollLast();
    }

    @Override
    public default Iterator<T> iterator() {
        return delegate().iterator();
    }

    @Override
    public default NavigableSet<T> descendingSet() {
        return delegate().descendingSet();
    }

    @Override
    public default Iterator<T> descendingIterator() {
        return delegate().descendingIterator();
    }

    @Override
    public default NavigableSet<T> subSet(T fromElement, boolean fromInclusive, T toElement, boolean toInclusive) {
        return delegate().subSet(fromElement, fromInclusive, toElement, toInclusive);
    }

    @Override
    public default NavigableSet<T> headSet(T toElement, boolean inclusive) {
        return delegate().headSet(toElement, inclusive);
    }

    @Override
    public default NavigableSet<T> tailSet(T fromElement, boolean inclusive) {
        return delegate().tailSet(fromElement, inclusive);
    }

    @Override
    public default SortedSet<T> subSet(T fromElement, T toElement) {
        return delegate().subSet(fromElement, toElement);
    }

    @Override
    public default SortedSet<T> headSet(T toElement) {
        return delegate().headSet(toElement);
    }

    @Override
    public default SortedSet<T> tailSet(T fromElement) {
        return delegate().tailSet(fromElement);
    }
    
}
