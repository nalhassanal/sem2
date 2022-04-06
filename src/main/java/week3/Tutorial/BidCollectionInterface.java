package week3.Tutorial;
/*
• Adds a bid to this collection.
• Returns the bid in this collection with the best yearly cost.
• Returns the bid in this collection with the best initial cost. The initial cost will be defined
  as the unit cost plus the installation cost.
• Clears all of the items from this collection.
• Gets the number of items in this collection.
• Sees whether this collection is empty.
 */
public interface BidCollectionInterface {
    /**Adds a bid to this collection.
     * Precondition: None
     * Postcondition: The bid was added into the collection.
     * @param AddBid The bid which wanted to add.
     */
    public void Add(BidInterface AddBid);

    /**Returns the bid in this collection with the best yearly cost.
     * Precondition: The collection cannot be empty.
     * Postcondition: The bid with best yearly cost will be returned.
     * @param operationHours Average number of unit operates per year.
     * @param usageFees Cost per kilowatt hour.
     * @return The bid with lowest yearly cost.
     */
    public BidInterface bestYearlyCostBid(double operationHours, double usageFees);

    /**Returns the bid in this collection with the best initial cost. The initial cost will be defined as
     the
     unit cost plus the installation cost.
     * Precondition: The collection cannot be empty.
     * Postcondition: The bid with best initial cost will be returned.
     * @param bidCollection The collection of bids.
     * @return The bid with lowest initial cost.
     */
    public BidInterface bestInitialCost(BidInterface bidCollection);

    /**Clears all of the items from this collection.
     * Precondition: The collection cannot be empty.
     * Postcondition: The collection is empty.
     */
    public void clear();

    /**Gets the number of items in this collection.
     * Precondition: The collection cannot be empty.
     * Postcondition: The number of items in this collection will be returned.
     * @param bidCollection The collection of bids
     * @return number of items.
     */
    public int numberOfItems(BidInterface bidCollection);

    /**Sees whether this collection is empty
     * Precondition: None
     * Postcondition: The collection is unchanged.
     */
    public boolean isEmpty();

}// end BidCollectionInterface
