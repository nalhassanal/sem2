package week8.pastyear;

public class overload {
    void message (int x){
        System.out.println("Diploma student");
    }
    void message (){
        System.out.println("Undergraduate student");
    }

    public static void main(String[] args) {
        overload o = new overload();
        o.message(5);
    }
}
