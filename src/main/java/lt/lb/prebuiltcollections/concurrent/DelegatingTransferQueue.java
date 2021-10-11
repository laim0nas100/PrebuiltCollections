package lt.lb.prebuiltcollections.concurrent;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

/**
 *
 * @author laim0nas100
 */
public interface DelegatingTransferQueue<T> extends DelegatingBlockingQueue<T>, TransferQueue<T> {

    @Override
    TransferQueue<T> delegate();

    @Override
    public default boolean tryTransfer(T e) {
        return delegate().tryTransfer(e);
    }

    @Override
    public default void transfer(T e) throws InterruptedException {
        delegate().transfer(e);
    }

    @Override
    public default boolean tryTransfer(T e, long timeout, TimeUnit unit) throws InterruptedException {
        return delegate().tryTransfer(e, timeout, unit);
    }

    @Override
    public default boolean hasWaitingConsumer() {
        return delegate().hasWaitingConsumer();
    }

    @Override
    public default int getWaitingConsumerCount() {
        return delegate().getWaitingConsumerCount();
    }

}
