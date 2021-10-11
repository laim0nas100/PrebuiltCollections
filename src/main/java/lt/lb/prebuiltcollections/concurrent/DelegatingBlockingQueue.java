package lt.lb.prebuiltcollections.concurrent;

import java.util.Collection;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import lt.lb.prebuiltcollections.DelegatingQueue;

/**
 *
 * @author laim0nas100
 */
public interface DelegatingBlockingQueue<T> extends DelegatingQueue<T>, BlockingQueue<T> {

    @Override
    public BlockingQueue<T> delegate();

    @Override
    public default boolean contains(Object o) {
        return delegate().contains(o);
    }

    @Override
    public default boolean remove(Object o) {
        return delegate().remove(o);
    }

    @Override
    public default boolean add(T e) {
        return delegate().add(e);
    }

    @Override
    public default boolean offer(T e) {
        return delegate().offer(e);
    }

    @Override
    public default void put(T e) throws InterruptedException {
        delegate().put(e);
    }

    @Override
    public default boolean offer(T e, long timeout, TimeUnit unit) throws InterruptedException {
        return delegate().offer(e, timeout, unit);
    }

    @Override
    public default T take() throws InterruptedException {
        return delegate().take();
    }

    @Override
    public default T poll(long timeout, TimeUnit unit) throws InterruptedException {
        return delegate().poll(timeout, unit);
    }

    @Override
    public default int remainingCapacity() {
        return delegate().remainingCapacity();
    }

    @Override
    public default int drainTo(Collection<? super T> c) {
        return delegate().drainTo(c);
    }

    @Override
    public default int drainTo(Collection<? super T> c, int maxElements) {
        return delegate().drainTo(c, maxElements);
    }

}
