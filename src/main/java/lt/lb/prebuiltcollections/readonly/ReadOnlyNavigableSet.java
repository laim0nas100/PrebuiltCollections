package lt.lb.prebuiltcollections.readonly;

import java.util.NavigableSet;

/**
 *
 * @author laim0nas100
 */
public interface ReadOnlyNavigableSet<T> extends ReadOnlySet<T>, NavigableSet<T> {

    @Override
    public default T pollFirst() {
         throw new UnsupportedOperationException("Read only instance of " + getClass());
    }

    @Override
    public default T pollLast() {
         throw new UnsupportedOperationException("Read only instance of " + getClass());
    }

    
}
