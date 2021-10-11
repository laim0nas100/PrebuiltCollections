package lt.lb.prebuiltcollections;

import java.util.Queue;

/**
 *
 * @author laim0nas100
 */
public interface DelegatingQueue<T> extends Queue<T>, DelegatingCollection<T> {

    @Override
    public Queue<T> delegate();

    @Override
    public default boolean add(T e) {
        return delegate().add(e);
    }

    @Override
    public default boolean offer(T e) {
        return delegate().offer(e);
    }

    @Override
    public default T remove() {
        return delegate().remove();
    }

    @Override
    public default T poll() {
        return delegate().poll();
    }

    @Override
    public default T element() {
        return delegate().element();
    }

    @Override
    public default T peek() {
        return delegate().peek();
    }

}
