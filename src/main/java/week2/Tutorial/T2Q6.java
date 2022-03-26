package week2.Tutorial;
/*
6.	Use the Duo class in Question 5 to declare and create two objects as follows :
    a.	First object called sideShape consist of respectively String type and Integer type.
    b.	Second object called points consists of two Double types.
 */
public class T2Q6 {
    public static void main(String[] args) {
        T2Q5.Duo <String , Integer> sideShape = new T2Q5.Duo<>();
        T2Q5.Duo <Double, Double> points = new T2Q5.Duo<>();
    }
}
