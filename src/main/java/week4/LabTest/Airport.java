package week4.LabTest;
/*
class Airport :
	main
		Flight
	<T> max <T> ()
		most expensive ticket
 */
public class Airport {
    public static void main(String[] args) {
        Airline ANA_Airline = new Airline("1001", "Amy" , "amy@gmail.com", "012-9887765" ,"ANA - All Nippon Airline" , "NH804");
        Item<String, String> ANA_economy = new Item<>("Economy", "3922");
        Item<String, String> ANA_meal = new Item<>("Deep Fried Chicken Don", "25");
        Flight ANA_Flight = new Flight("Joan,Daniel,Matt" ,"ANA - All Nippon Airline" , "NH804", ANA_economy,ANA_meal);

        Airline SG_Airline = new Airline("1002" , "Jessica" , "jessica@gmail.com","019-2562398", "Singapore Airlines" ,"SQ103");
        Item<String, String> SG_economy = new Item<>("Economy", "5476");
        Item<String, String> SG_meal = new Item<>("Sandwiches", "12");
        Flight SG_Flight = new Flight("Myra,Lawrence", "Singapore Airlines" , "SQ103" , SG_economy, SG_meal);

        Airline MY_Airline = new Airline("1003" , "Brandon","brandon@gmail.com" , "018-3234546", "Malaysia Airlines" , "MH104");
        Item<String, String> MY_economy = new Item<>("Business", "14210");
        Item<String, String> MY_meal = new Item<>("Chinese Roasted Duck with Rice", "39");
        Flight MY_Flight = new Flight("Fred,Emily,Kendrick,Olivia" , "Malaysia Airlines" , "MH104", MY_economy, MY_meal);

        print_airline(ANA_Airline);
        print_flight(ANA_Flight);

        print_airline(SG_Airline);
        print_flight(SG_Flight);

        print_airline(MY_Airline);
        print_flight(MY_Flight);

        compare(ANA_Flight, SG_Flight);
        compare(SG_Flight, MY_Flight);
        compare(ANA_Flight,MY_Flight);
        System.out.println("The most expensive flight ticket is RM " + max (ANA_economy, SG_economy, MY_economy));
    }

    public static void compare(Flight obj, Flight obj2){
        if ( obj.compareTo(obj2) > 0){
            System.out.println(obj.getAirline_name() +" has a larger cabin crew than " + obj2.getAirline_name());
        }
        else if (obj.compareTo(obj2) < 0){
            System.out.println(obj.getAirline_name() +" has a larger cabin crew than " + obj2.getAirline_name());
        }
        else
            System.out.println(obj.getAirline_name() + " has the same number of cabin crew with " + obj2.getAirline_name());
    }

    public static <T extends Airline> void print_airline(T obj){
        System.out.println("Airline name: "+obj.getAirline_name());
        System.out.println("Flight number: " + obj.getFlight_number());
        System.out.println("Passenger info:");
        System.out.println("User ID: " + obj.getUser_id());
        System.out.println("Name: " + obj.getPassenger_name());
        System.out.println("Email: " + obj.getEmail());
        System.out.println("Contact Num: " + obj.getContact_number());
    }

    public static <T extends Flight> void print_flight(T obj){
        System.out.println(obj.toString());
    }


    public static <T> String max(T obj, T obj1, T obj2){
        String max = (String) ((Item<?, ?>) obj).getPrice();
        String val1 = (String) ((Item<?, ?>) obj1).getPrice();
        String val2= (String) ((Item<?, ?>) obj2).getPrice();

        if (val1.compareTo(max) < 0)
            max = val1;
        if (val2.compareTo(max) < 0)
            max = val2;

        return max;
    }
}
