package isma;

public class Faculty {
    String name;
    private int basic_salary;

    public Faculty(){
    }

    public Faculty(String name, int basic_salary){
        this.name = name;
        this.basic_salary = basic_salary;

    }

    public String getDetails(){
        return name + " RM" + basic_salary;
    }

    public double getSalary(){
        return basic_salary;
    }
}
