package week8.pastyear;

public class test  {
    static class DiplomaStudent extends Student{
        public DiplomaStudent(){

        }
    }
    static class Student {
        public Student(){

        }
    }
/*

 */
    public static void main(String[] args) {
        boolean b = false;
//        DiplomaStudent s = new Student();
        DiplomaStudent d = new DiplomaStudent();
float e = 2.8f;
        Student sd = new Student();
        Student ff = new DiplomaStudent();
        int i =0;
        switch (i){
            case 0:
                System.out.print("Zero    ");
            case 1:
                System.out.print("one    ");
            case 2:
                System.out.print("Two    ");
            default:
                System.out.print("Default    ");
        }
    }
}

