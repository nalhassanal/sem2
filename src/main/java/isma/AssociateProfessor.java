package isma;

public class AssociateProfessor extends AssistantProfessor{
    private int MedAllowance;

    public AssociateProfessor(){

    }

    public AssociateProfessor(String name, int basic_salary, int DA, int MedAllowance){
        super(name, basic_salary, DA);
        this.MedAllowance = MedAllowance;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + MedAllowance;
    }

    @Override
    public String getDetails() {
        return "Associate Professor " + name + " RM" + getSalary();
    }
}