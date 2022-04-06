package week3.Tutorial;
/*
• Returns the name of the company making this bid.
• Returns the description of the air conditioner that this bid is for.
• Returns the capacity of this bid's AC in tons (1 ton = 12,000 BTU).
• Returns the seasonal efficiency of this bid's AC (SEER).
• Returns the cost of this bid's AC.
• Returns the cost of installing this bid's AC.
• Returns the yearly cost of operating this bid's AC.
 */
public interface BidInterface {
    /** Returns the name of the company making this bid.
     * precondition: none
     * postcondition: the name of the company was returned
     * @return name of the company making the bid
     */
    public String getCompanyName();

    /** Returns the description of the air conditioner that this bid is for.
     * precondition: none
     * postcondition: returns description of air conditoner in the bid
     * @return description of air conditioner
     */
    public String getDescAC();

    /** Returns the capacity of this bid's AC in tons (1 ton = 12,000 BTU).
     * precondition: none
     * postcondition: gets the capacity of the AC in tons
     * @return returns the capacity of AC
     */
    public double getCapacity();

    /** Returns the seasonal efficiency of this bid's AC (SEER).
     * precondition: none
     * postcondition: get the seasonal efficiency of bid's AC
     * @return the SEER ratio of AC
     */
    public double getSEER();

    /** Returns the cost of this bid's AC.
     * precondition: none
     * postcondition: get cost of bid's AC
     * @return cost of AC
     */
    public double getCostAC();

    /** Returns the cost of installing this bid's AC.
     * precondition: none
     * postcondition: get installation cost of AC
     * @return install cost of AC
     */
    public double getInstallCost();

    /** Returns the yearly cost of operating this bid's AC.
     * precondition: none
     * postcondition: get operating cost of AC per year
     * @return operating cost of AC per year
     */
    public double getOperatingCostPerYear();
}// end BidInterface
