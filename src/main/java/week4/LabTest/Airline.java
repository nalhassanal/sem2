package week4.LabTest;
/*
class Airline: store info about particular airline
	airline_name
	flight_number
	along with account
 */
public class Airline extends Account{
    private String airline_name;
    private String flight_number;

    public Airline(){

    }

    public Airline(String airline_name, String flight_number) {
        this.airline_name = airline_name;
        this.flight_number = flight_number;
    }

    // this is to initialize the crew
    public Airline(String crew_name, String airline_name, String flight_number) {
        super(crew_name);
        this.airline_name = airline_name;
        this.flight_number = flight_number;
    }

    // this is to initialize the passengers
    public Airline(String user_id, String name, String email, String contact_number, String airline_name, String flight_number) {
        super(user_id, name, email, contact_number);
        this.airline_name = airline_name;
        this.flight_number = flight_number;
    }

    public String getAirline_name() {
        return airline_name;
    }

    public void setAirline_name(String airline_name) {
        this.airline_name = airline_name;
    }

    public String  getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(String flight_number) {
        this.flight_number = flight_number;
    }
}
