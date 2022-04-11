package isma;

public class AssistantProfessor extends Faculty{
    int DA;

    public AssistantProfessor(){}

    public AssistantProfessor(String name, int basic_salary, int DA){
        super(name,basic_salary);
        this.DA = DA;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + ((super.getSalary() * DA) / 100);
    }

    @Override
    public String getDetails() {
        return "Assistant Professor: " + name + " RM"  + getSalary();
    }
}
