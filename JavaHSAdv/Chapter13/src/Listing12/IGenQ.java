package Listing12;

import Listing13.QueueFullException;
import Listing14.QueueEmptyException;

// A generic queue interface.
public interface IGenQ<T> {
    // Put an item into the queue.
    void put(T ch) throws QueueFullException;

    // Get an item from the queue.
    T get() throws QueueEmptyException;
}
