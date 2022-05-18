package week9.pastyear.pastyear;

public class person {
    private String name, occupation, frontliner_status = "Not frontliner";
    private int age;
    private String gender;
    final private String [] occupation_list = {"Doctor", "Nurse", "Teacher", "Police"};
    private boolean frontliner;

    public person(String name, int age){
        this.name = name;
        this.age = age;
        this.gender = null;
        this.occupation = null;
    }

    public person (String name, int age, String gender){
        this(name, age);
        this.gender = gender;
    }

    public person (String name, int age,String gender, String occupation){
        this (name, age, gender);
        this.occupation = occupation;
        setFrontliner();
    }

    public void setFrontliner(){
        for (String element: occupation_list) {
            if (element.equalsIgnoreCase(occupation))
                frontliner = true;
        }
        if(frontliner)
            frontliner_status = "frontliner";
    }

    public String[] getOccupation_list() {
        return occupation_list;
    }

    public String getName() {
        return name;
    }

    public String getFrontliner_status() {
        return frontliner_status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return "Name: " + name + " " +
                "Age: "  + age +" " +
                "Gender: "  + gender + " " +
                frontliner_status;
    }
}
