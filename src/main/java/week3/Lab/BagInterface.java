package week3.Lab;

/**
An interface that describes the operations of a bag of objects.
*/
public interface BagInterface<T> {
    /** Gets the current number of entries in this bag.
    @return the integer number of entries currently in the bag */
    int getCurrentSize();

    /** Sees whether this bag is full.
    @return true if the bag is full, or false if not */
    boolean isFull();

    /** Sees whether this bag is empty.
    @return true if the bag is empty, or false if not */
    boolean isEmpty();

    /** Adds a new entry to this bag.
    @param newEntry the object to be added as a new entry
    @return true if the addition is successful, or false if not */
    boolean add(T newEntry);

    /** Removes one unspecified entry from this bag, if possible.
    @return either the removed entry, if the removal was successful,
    or null */
    T remove();

    /** Removes one occurrence of a given entry from this bag.
    @param anEntry the entry to be removed
    @return true if the removal was successful, or false if not */
    boolean remove(T anEntry);

    /** Removes all entries from this bag. */
    void clear();

    /** Counts the number of times a given entry appears in this bag.
    @param anEntry the entry to be counted
    @return the number of times anEntry appears in the bag */
    int getFrequencyOf(T anEntry);

    /** Tests whether this bag contains a given entry.
    @param anEntry the entry to locate
    @return true if this bag contains anEntry, or false otherwise */
    boolean contains(T anEntry);

    /** Retrieves all entries that are in this bag.
    @return a newly allocated array of all the entries in the bag */
    T[] toArray();

    /** Combine two bags into a new collection
     * @param o bag to be combined
     * @return a new bag after combining two bags
     */
    BagInterface <T> union(BagInterface<T> o);

    /** A new collection of the entries that occur in both collections
     * @param o bag to be combined
     * @return a new bag after checking for intersecting elements
     */
    BagInterface <T> intersection(BagInterface<T> o);

    /** gives a collection that would be left in one collection
     * after removing those that also occur in the second
     * @param o bag to be combined
     * @return a new bag after the process of removing same elements
     */
    BagInterface <T> difference(BagInterface<T> o);
} // end BagInterface
