package lt.lb.prebuiltcollections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.Spliterator;

/**
 *
 * @author laim0nas100
 * @param <T>
 */
public interface DelegatingSortedSet<T> extends DelegatingSet<T>, SortedSet<T>{

    @Override
    public SortedSet<T> delegate();

    @Override
    public default T last(){
        return delegate().last();
    }

    @Override
    public default T first(){
        return delegate().first();
    }

    @Override
    public default SortedSet<T> tailSet(T fromElement){
        return delegate().tailSet(fromElement);
    }

    @Override
    public default SortedSet<T> headSet(T toElement){
        return delegate().headSet(toElement);
    }

    @Override
    public default SortedSet<T> subSet(T fromElement, T toElement){
        return delegate().subSet(fromElement, toElement);
    }

    @Override
    public default Comparator<? super T> comparator(){
        return delegate().comparator();
    }

    @Override
    public default Spliterator<T> spliterator(){
        return delegate().spliterator();
    }
    
}
