package week2.Lecture;

public class useGenericBox {
    public static void main(String[] args) {
        GenericBox<String> box1 = new GenericBox<>();
        GenericBox<Integer> box2 = new GenericBox<>();

        box1.store("Hello World");
        box2.store(100);

        System.out.println("Box 1 has " + box1.toString());
        System.out.println("Box 2 has " + box2.toString());

        box1.remove();
        box2.remove();

        System.out.println("After removal, box 1 has " + box1.toString());
        System.out.println("After removal, box 2 has " + box2.toString());

//        box1.store(100);
//        box2.store("Hello World"); // these will cause compilation error because incompatible types

    }
}
