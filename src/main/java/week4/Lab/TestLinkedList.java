package week4.Lab;

public class TestLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Character> list = new MyLinkedList<>();
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        list.add('e');
        list.print();
        list.reverse();
        System.out.println(list.size);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.remove(list.size/2);
        list.print();
        System.out.println("index of b : " + list.indexOf('b'));
        System.out.println("index of c : " + list.indexOf('c'));
        System.out.println(" c exist? : " + list.contains('c'));

        Character [] arr = {'h','e','l','l','o'};
        for (int i = 0; i < arr.length; i++) {
            if (i < list.size) {
                System.out.println(list.set(i, arr[i]));
            } else { // basically if bigger than size then add to last
                list.add(arr[i]);
            }
        }

        list.print();
        System.out.println(list.getMiddleValue());
    }
}
