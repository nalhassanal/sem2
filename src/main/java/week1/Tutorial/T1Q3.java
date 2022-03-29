package week1.Tutorial;

public class T1Q3 {

    public static void main(String[] args) {
        Object[] o = {new A(), new B()};
        System.out.println(o[0]); // A
        System.out.println(o[1]); // B
    }

    static class A extends B{
        public String toString() {
            return "A";
        }
    }

    static class B{
        public String toString(){
            return "B";
        }
    }
}

