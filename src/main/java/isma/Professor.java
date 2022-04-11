package isma;

public class Professor extends AssociateProfessor{

    private int OtherAllowance;

    public Professor(){

    }

    public Professor(String name, int basic_salary, int DA, int MedAllowance, int OtherAllowance){
        super(name, basic_salary, DA, MedAllowance);
        this.OtherAllowance = OtherAllowance;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + ((OtherAllowance * super.getSalary())/100);
    }

    @Override
    public String getDetails() {
        return "Professor: " + name + " RM" + getSalary();
    }
}
