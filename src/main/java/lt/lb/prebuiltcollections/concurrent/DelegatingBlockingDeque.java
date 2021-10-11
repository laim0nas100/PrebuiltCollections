package lt.lb.prebuiltcollections.concurrent;

import java.util.Iterator;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TimeUnit;
import lt.lb.prebuiltcollections.DelegatingDeque;

/**
 *
 * @author laim0nas100
 */
public interface DelegatingBlockingDeque<T> extends DelegatingBlockingQueue<T>, DelegatingDeque<T>, BlockingDeque<T> {
    
    @Override
    public BlockingDeque<T> delegate();
    
    @Override
    public default Iterator<T> iterator() {
        return delegate().iterator();
    }
    
    @Override
    public default int size() {
        return delegate().size();
    }
    
    @Override
    public default void addFirst(T e) {
        delegate().addFirst(e);
    }
    
    @Override
    public default void addLast(T e) {
        delegate().addLast(e);
    }
    
    @Override
    public default boolean offerFirst(T e) {
        return delegate().offerFirst(e);
    }
    
    @Override
    public default boolean offerLast(T e) {
        return delegate().offerLast(e);
    }
    
    @Override
    public default void putFirst(T e) throws InterruptedException {
        delegate().putFirst(e);
    }
    
    @Override
    public default void putLast(T e) throws InterruptedException {
        delegate().putLast(e);
    }
    
    @Override
    public default boolean offerFirst(T e, long timeout, TimeUnit unit) throws InterruptedException {
        return delegate().offerLast(e, timeout, unit);
    }
    
    @Override
    public default boolean offerLast(T e, long timeout, TimeUnit unit) throws InterruptedException {
        return delegate().offerLast(e, timeout, unit);
    }
    
    @Override
    public default T takeFirst() throws InterruptedException {
        return delegate().takeFirst();
    }
    
    @Override
    public default T takeLast() throws InterruptedException {
        return delegate().takeLast();
    }
    
    @Override
    public default T pollFirst(long timeout, TimeUnit unit) throws InterruptedException {
        return delegate().pollFirst(timeout, unit);
    }
    
    @Override
    public default T pollLast(long timeout, TimeUnit unit) throws InterruptedException {
        return delegate().pollLast(timeout, unit);
    }
    
    @Override
    public default boolean removeFirstOccurrence(Object o) {
        return delegate().removeFirstOccurrence(o);
    }
    
    @Override
    public default boolean removeLastOccurrence(Object o) {
        return delegate().removeLastOccurrence(o);
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
    public default T remove() {
        return delegate().remove();
    }
    
    @Override
    public default T poll() {
        return delegate().poll();
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
    public default T element() {
        return delegate().element();
    }
    
    @Override
    public default T peek() {
        return delegate().peek();
    }
    
    @Override
    public default boolean remove(Object o) {
        return delegate().remove(o);
    }
    
    @Override
    public default boolean contains(Object o) {
        return delegate().contains(o);
    }
    
    @Override
    public default void push(T e) {
        delegate().push(e);
    }
    
}
