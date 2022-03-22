package week1.Tutorial;

public class T1Q2 {
    static class Person{
        public Person(){
            System.out.println("(1) Performs Person's tasks");
        }
    }

    static class Employee extends Person{
        public Employee(){
            this("(2) Invoke Employee's overloaded constructor");
            System.out.println("(3) Performs Employee's tasks");
        }
        public Employee(String s){
            System.out.println(s);
        }
    }

    public static class Faculty extends Employee{
        public Faculty(){
            System.out.println("(4) Performs Faculty's tasks");
        }

        public static void main(String[] args) {
            new Faculty();
        }
    }
}
