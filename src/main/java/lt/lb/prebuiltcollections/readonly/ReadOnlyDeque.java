package lt.lb.prebuiltcollections.readonly;

import java.util.Collection;
import java.util.Deque;

/**
 *
 * @author laim0nas100
 */
public interface ReadOnlyDeque<T> extends ReadOnlyQueue<T>, Deque<T> {

    @Override
    public default void addFirst(T e) {
        throw new UnsupportedOperationException("Read only instance of " + getClass());
    }

    @Override
    public default void addLast(T e) {
        throw new UnsupportedOperationException("Read only instance of " + getClass());
    }

    @Override
    public default boolean offerFirst(T e) {
        throw new UnsupportedOperationException("Read only instance of " + getClass());
    }

    @Override
    public default boolean offerLast(T e) {
        throw new UnsupportedOperationException("Read only instance of " + getClass());
    }

    @Override
    public default T removeFirst() {
        throw new UnsupportedOperationException("Read only instance of " + getClass());
    }

    @Override
    public default T removeLast() {
        throw new UnsupportedOperationException("Read only instance of " + getClass());
    }

    @Override
    public default T pollFirst() {
        throw new UnsupportedOperationException("Read only instance of " + getClass());
    }

    @Override
    public default T pollLast() {
        throw new UnsupportedOperationException("Read only instance of " + getClass());
    }

    @Override
    public default boolean removeFirstOccurrence(Object o) {
        throw new UnsupportedOperationException("Read only instance of " + getClass());
    }

    @Override
    public default boolean removeLastOccurrence(Object o) {
        throw new UnsupportedOperationException("Read only instance of " + getClass());
    }

    @Override
    public default boolean add(T e) {
        throw new UnsupportedOperationException("Read only instance of " + getClass());
    }

    @Override
    public default boolean offer(T e) {
        throw new UnsupportedOperationException("Read only instance of " + getClass());
    }

    @Override
    public default T remove() {
        throw new UnsupportedOperationException("Read only instance of " + getClass());
    }

    @Override
    public default T poll() {
        throw new UnsupportedOperationException("Read only instance of " + getClass());
    }

    @Override
    public default boolean addAll(Collection<? extends T> c) {
        throw new UnsupportedOperationException("Read only instance of " + getClass());
    }

    @Override
    public default void push(T e) {
        throw new UnsupportedOperationException("Read only instance of " + getClass());
    }

    @Override
    public default T pop() {
        throw new UnsupportedOperationException("Read only instance of " + getClass());
    }

    @Override
    public default boolean remove(Object o) {
        throw new UnsupportedOperationException("Read only instance of " + getClass());
    }

    @Override
    public default boolean contains(Object o) {
        return ReadOnlyQueue.super.contains(o);
    }

}
