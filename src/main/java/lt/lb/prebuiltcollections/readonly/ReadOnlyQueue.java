package lt.lb.prebuiltcollections.readonly;

import java.util.Queue;

/**
 *
 * @author laim0nas100
 */
public interface ReadOnlyQueue<T> extends ReadOnlyCollection<T>, Queue<T> {

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

}
