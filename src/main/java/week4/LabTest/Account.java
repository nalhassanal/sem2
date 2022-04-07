package week4.LabTest;
/*
class account : main entry for passengers and cabin crew (basically daftar)
	user_id
	name
	email
	contact_number
 */
public class Account {
    private String user_id;
    private String passenger_name;
    private String crew_name;
    private String email;
    private String contact_number;
    private int crew_members;

    public String getCrew_name() {
        return crew_name;
    }

    public void setCrew_name(String crew_name) {
        this.crew_name = crew_name;
    }

    public int getCrew_members() {
        return crew_members;
    }

    public void setCrew_members(int crew_members) {
        this.crew_members = crew_members;
    }

    public Account() {
    }

    public Account(String crew_name){
        this.crew_name = crew_name;
        String result [] = crew_name.split(",");
        crew_members += result.length;
    }

    public Account(String user_id, String passenger_name, String email, String contact_number) {
        this.user_id = user_id;
        this.passenger_name = passenger_name;
        this.email = email;
        this.contact_number = contact_number;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getPassenger_name() {
        return passenger_name;
    }

    public void setPassenger_name(String passenger_name) {
        this.passenger_name = passenger_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String  getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }
}
