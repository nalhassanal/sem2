package week2.Lecture;

public class UseBox {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();

        box1.store("Hello World");
        box2.store(100);

        System.out.println("Box 1 has " + box1.toString());
        System.out.println("Box 2 has " + box2.toString());

        // this line will cause runtime error bcs not using generics
//        int c = box1.retrieve().compareTo(box2.retrieve());
    }
}
