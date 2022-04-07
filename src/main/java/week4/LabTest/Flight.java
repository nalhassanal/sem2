package week4.LabTest;
/*
class Flight extends Airline :
	Item <T1,T2>flight
	Item <T1,T2>meal
	public Flight (Item flight, Item meal, super)
		super
	override compareTo() (implement comparable?)
		compare number of cabin crew on another flight
 */
public class Flight extends Airline implements Comparable<Flight>{
    private Item<? , ? > flight;
    private Item<?, ? > meal;

    public Flight(String airline_name, String flight_number, Item<?, ? > flight, Item<?, ? > meal) {
        super(airline_name, flight_number);
        this.flight = flight;
        this.meal = meal;
    }

    public Flight( String crew_name, String airline_name, String flight_number, Item<?, ? > flight, Item<?, ? > meal) {
        super(crew_name, airline_name, flight_number);
        this.flight = flight;
        this.meal = meal;
    }

    public Item<?, ?> getFlight() {
        return flight;
    }

    public void setFlight(Item<?, ?> flight) {
        this.flight = flight;
    }

    public Item<?, ?> getMeal() {
        return meal;
    }

    public void setMeal(Item<?, ?> meal) {
        this.meal = meal;
    }

    public int compareTo(Flight o){
        if (this.getCrew_members() > o.getCrew_members())
            return 1;
        else if ( this.getCrew_members() < o.getCrew_members())
            return -1;
        return 0;
    }

    public String toString(){
        String flightString = "[Item name: " + flight.getItem() + "\n" +"ItemPrice: RM " +flight.getPrice() + "]\n";
        String mealString = "[Item name: " + meal.getItem() + "\n" +"ItemPrice: RM " +meal.getPrice()+ "]\n";
        return flightString + mealString;
    }
}
